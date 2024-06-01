package io.apex.f1.packets

import io.apex.f1.enums.PacketId

import java.math.BigInteger

case class F1PacketHeader$(
    packetFormat: Int,
    gameMajorVersion: Short,
    gameMinorVersion: Short,
    packetVersion: Short,
    packetId: PacketId,
    sessionUid: BigInteger,
    sessionTime: Float,
    frameIdentifier: Long,
    playerCarIndex: Short,
    secondaryPlayerCarIndex: Short) {

  //  def fill(buffer: ByteBuf): PacketHeader = {
  //    PacketHeader(
  //      buffer.readUnsignedShortLE(),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedByte(),
  //      PacketId.valueOf(buffer.readUnsignedByte()),
  //      PacketUtils.toUnsignedBigInteger(buffer.readLongLE()),
  //      buffer.readFloatLE(),
  //      buffer.readUnsignedIntLE(),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedByte()
  //    )
  //  }
  //
  //  def fillBuffer(buffer: ByteBuf): ByteBuf = {
  //    buffer
  //      .writeShortLE(packetFormat)
  //      .writeByte(gameMajorVersion)
  //      .writeByte(gameMinorVersion)
  //      .writeByte(packetVersion)
  //      .writeByte(packetId.getValue)
  //      .writeLongLE(sessionUid.longValue())
  //      .writeFloatLE(sessionTime)
  //      .writeIntLE(frameIdentifier.toInt)
  //      .writeByte(playerCarIndex)
  //      .writeByte(secondaryPlayerCarIndex)
  //  }

  override def toString: String =
    s"Header[format=$packetFormat, major=$gameMajorVersion, minor=$gameMinorVersion, version=$packetVersion, id=$packetId, " +
    s"sessionUid=$sessionUid, sessionTime=$sessionTime, frameIdentifier=$frameIdentifier, playerCarIndex=$playerCarIndex, " +
    s"secondaryPlayerCarIndex=$secondaryPlayerCarIndex]"
}

object F1PacketHeader$ extends F1Packet {
  override def size: Int = 24

  def packetIdOffset: Int = 5
}
