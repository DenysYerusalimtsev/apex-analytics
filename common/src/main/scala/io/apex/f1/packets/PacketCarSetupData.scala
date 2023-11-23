package io.ppatierno.formula1.packets

import io.apex.f1.PacketConstants
import io.apex.f1.packets.{Packet, PacketHeader}
import io.netty.buffer.ByteBuf

import scala.collection.mutable.ListBuffer

/**
 * Car Setups Packet
 *
 * This packet details the car setups for each vehicle in the session. Note that
 * in multiplayer games, other player cars will appear as blank, you will only
 * be able to see your car setup and AI cars.
 * Frequency: 2 per second
 */
case class PacketCarSetupData(
                               header: PacketHeader,
                               carSetupData: List[CarSetupData]
                             ) extends Packet {


  // 1102
  override def size: Int = PacketHeader.SIZE + CarSetupData.SIZE * PacketConstants.CARS

  override def toString: String = {
    val carSetupDataString = carSetupData.map(_.toString).mkString(",")
    s"CarSetup[$header, carSetupData=[$carSetupDataString]]"
  }

  def fill(buffer: ByteBuf): PacketCarSetupData = {
    val filledHeader = header.fill(buffer)
    val filledCarSetupData = ListBuffer[CarSetupData]()
    for (_ <- 0 until PacketConstants.CARS) {
      filledCarSetupData += CarSetupData().fill(buffer)
    }
    PacketCarSetupData(filledHeader, filledCarSetupData.toList)
  }

  def fillBuffer(buffer: ByteBuf): ByteBuf = {
    header.fillBuffer(buffer)
    carSetupData.foreach(_.fillBuffer(buffer))
    buffer
  }
}
