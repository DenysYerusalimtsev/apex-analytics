package io.apex.f1.application

import io.apex.codecs.f1.packets.PacketCarDamageDataCodec
import io.apex.f1.packets.PacketCarDamageData
import org.apache.pekko.actor.typed.scaladsl.Behaviors
import org.apache.pekko.actor.typed.{ActorRef, Behavior}
import org.apache.pekko.io.{IO, Udp}
import org.apache.pekko.util.ByteString
import scodec.*
import scodec.bits.*
import scodec.codecs.*

import java.net.InetSocketAddress

object TelemetryProcessor {
  sealed trait Command
  case object StartProcessing extends Command
  case object StopProcessing extends Command
  private case class UdpMessageReceived(data: ByteString) extends Command

  def apply(): Behavior[Command] = Behaviors.setup { context =>
    Behaviors.receiveMessage {
      case StartProcessing =>
        val udpManager =
          context.spawn(UdpProcessor(new InetSocketAddress("localhost", 9999)), "UdpProcessor")
        context.watch(udpManager)
        Behaviors.same

      case StopProcessing =>
        context.children.foreach(context.stop)
        Behaviors.same

      case UdpMessageReceived(data) =>
        decodeData(data)
        Behaviors.same
    }
  }

  private def decodeData(data: ByteString): Unit = {
    val codec: Codec[PacketCarDamageData] = PacketCarDamageDataCodec.codec
    val result = PacketCarDamageDataCodec.codec.decodeValue(BitVector(data.toArray))
    result match {
      case Right(value) => println(s"Decoded value: $value")
      case Left(err)    => println(s"Failed to decode: $err")
    }
  }
}

object UdpProcessor {
  def apply(remote: InetSocketAddress): Behavior[Udp.Command] = Behaviors.setup { context =>
    IO(Udp) ! Udp.Bind(context.self, remote)

    Behaviors.receiveMessage {
      case Udp.Bound(local) =>
        context.log.info(s"Bound to $local")
        Behaviors.same
      case Udp.Received(data, sender) =>
        context.parent ! ProcessorManager.UdpMessageReceived(data)
        Behaviors.same
      case _ => Behaviors.unhandled
    }
  }
}
