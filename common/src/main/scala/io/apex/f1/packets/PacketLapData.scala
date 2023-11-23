package io.apex.f1.packets

import io.apex.f1.PacketConstants
import io.apex.f1.data.LapData


/**
 * Lap Data Packet
 *
 * The lap data packet gives details of all the cars in the session.
 * Frequency: Rate as specified in menus
 */
case class PacketLapData(
                          header: PacketHeader,
                          lapData: List[LapData]
                        ) {

  override def toString: String = {
    s"LapData[$header,lapData=${lapData.mkString(",")}]"
  }
//  def fill(buffer: ByteBuf): PacketLapData = {
//    val filledHeader = PacketHeader().fill(buffer)
//    val filledLapData = List.fill(PacketConstants.CARS)(LapData().fill(buffer))
//    PacketLapData(filledHeader, filledLapData)
//  }
//
//  def fillBuffer(packet: PacketLapData, buffer: ByteBuf): ByteBuf = {
//    packet.header.fillBuffer(buffer)
//    packet.lapData.foreach(_.fillBuffer(buffer))
//    buffer
//  }
}

object PacketLapData extends Packet {
  override def size: Int = PacketHeader.size + LapData.size * PacketConstants.CARS
}
