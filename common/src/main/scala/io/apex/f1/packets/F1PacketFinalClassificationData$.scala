package io.apex.f1.packets

import io.apex.f1.PacketConstants
import io.apex.f1.data.FinalClassificationData


/**
 * Final Classification Packet
 *
 * This packet details the final classification at the end of the race, and the
 * data will match with the post race results screen. This is especially useful
 * for multiplayer games where it is not always possible to send lap times on
 * the final frame because of network delay.
 * Frequency: Once at the end of a race
 */
case class F1PacketFinalClassificationData$(
                                             header: F1PacketHeader$,
                                             numCars: Short,
                                             finalClassificationData: List[FinalClassificationData]
                                        ) {

  override def toString: String = {
    s"FinalClassification[$header,numCars=$numCars,finalClassificationData=${finalClassificationData.mkString(",")}]"
  }
  //  def fill(buffer: ByteBuf): PacketFinalClassificationData = {
  //    val filledHeader = PacketHeader().fill(buffer)
  //    val filledNumCars = buffer.readUnsignedByte()
  //    val filledFinalClassificationData = List.fill(filledNumCars)(FinalClassificationData().fill(buffer))
  //    PacketFinalClassificationData(filledHeader, filledNumCars, filledFinalClassificationData)
  //  }
  //
  //  def fillBuffer(packet: PacketFinalClassificationData, buffer: ByteBuf): ByteBuf = {
  //    packet.header.fillBuffer(buffer)
  //    buffer.writeByte(packet.numCars)
  //    packet.finalClassificationData.foreach(_.fillBuffer(buffer))
  //    buffer
  //  }
}

object F1PacketFinalClassificationData$ extends F1Packet {
  override def size: Int = F1PacketHeader$.size + 1 + FinalClassificationData.size * PacketConstants.CARS
}
