package io.apex.f1.packets

import io.netty.buffer.ByteBuf

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
                           ) extends Packet {

  override def size: Int = PacketHeader.SIZE + CarMotionData.SIZE * PacketConstants.CARS + ExtraCarMotionData.SIZE

  override def toString: String = {
    s"Motion[$header,carMotionData=${carMotionData.mkString(",")},extraCarMotionData=$extraCarMotionData]"
  }

  def fill(buffer: ByteBuf): PacketMotionData = {
    val filledHeader = PacketHeader().fill(buffer)
    val filledCarMotionData = List.fill(PacketConstants.CARS)(CarMotionData().fill(buffer))
    val filledExtraCarMotionData = ExtraCarMotionData().fill(buffer)
    PacketMotionData(filledHeader, filledCarMotionData, filledExtraCarMotionData)
  }

  def fillBuffer(packet: PacketMotionData, buffer: ByteBuf): ByteBuf = {
    packet.header.fillBuffer(buffer)
    packet.carMotionData.foreach(_.fillBuffer(buffer))
    packet.extraCarMotionData.fillBuffer(buffer)
    buffer
  }
}
