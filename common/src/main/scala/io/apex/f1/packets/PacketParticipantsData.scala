package io.apex.f1.packets

import io.apex.f1.data.*

/**
 * Participants Packet
 *
 * This is a list of participants in the race. If the vehicle is controlled by
 * AI, then the name will be the driver name. If this is a multiplayer game, the
 * names will be the Steam Id on PC, or the LAN name if appropriate.
 * Frequency: Every 5 seconds
 */
case class PacketParticipantsData(
                                   header: PacketHeader,
                                   numActiveCars: Short,
                                   participants: List[ParticipantData]
                                 ) {


  override def toString: String = {
    s"Participants[$header,numActiveCars=$numActiveCars,participants=${participants.mkString(",")}]"
  }

  //  def fill(buffer: ByteBuf): PacketParticipantsData = {
  //    val filledHeader = PacketHeader().fill(buffer)
  //    val filledNumActiveCars = buffer.readUnsignedByte()
  //    val filledParticipants = ListBuffer.fill(filledNumActiveCars)(ParticipantData().fill(buffer)).toList
  //    PacketParticipantsData(filledHeader, filledNumActiveCars, filledParticipants)
  //  }
  //
  //  def fillBuffer(packet: PacketParticipantsData, buffer: ByteBuf): ByteBuf = {
  //    packet.header.fillBuffer(buffer)
  //    buffer.writeByte(packet.numActiveCars)
  //    packet.participants.foreach(_.fillBuffer(buffer))
  //    buffer
  //  }
}

object PacketParticipantsData extends Packet {
  override def size: Int = PacketHeader.size + 4 + EventDataDetails.size
}
