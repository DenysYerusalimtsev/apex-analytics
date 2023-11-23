package io.apex.f1.packets

import io.apex.f1.PacketConstants
import io.apex.f1.data.*

/**
 * Motion Packet
 *
 * The motion packet gives physics data for all the cars being driven.
 * There is additional data for the car being driven with the goal of being able to drive a motion platform setup.
 * Frequency: Rate as specified in menus
 */
case class PacketMotionData(
                             header: PacketHeader,
                             carMotionData: List[CarMotionData],
                             extraCarMotionData: ExtraCarMotionData
                           ) {

  override def toString: String = {
    s"Motion[$header,carMotionData=${carMotionData.mkString(",")},extraCarMotionData=$extraCarMotionData]"
  }
  //
  //  def fill(buffer: ByteBuf): PacketMotionData = {
  //    val filledHeader = PacketHeader().fill(buffer)
  //    val filledCarMotionData = List.fill(PacketConstants.CARS)(CarMotionData().fill(buffer))
  //    val filledExtraCarMotionData = ExtraCarMotionData().fill(buffer)
  //    PacketMotionData(filledHeader, filledCarMotionData, filledExtraCarMotionData)
  //  }
  //
  //  def fillBuffer(packet: PacketMotionData, buffer: ByteBuf): ByteBuf = {
  //    packet.header.fillBuffer(buffer)
  //    packet.carMotionData.foreach(_.fillBuffer(buffer))
  //    packet.extraCarMotionData.fillBuffer(buffer)
  //    buffer
  //  }
}

object PacketMotionData extends Packet {
  override def size: Int = PacketHeader.size + CarMotionData.size * PacketConstants.CARS + ExtraCarMotionData.size
}
