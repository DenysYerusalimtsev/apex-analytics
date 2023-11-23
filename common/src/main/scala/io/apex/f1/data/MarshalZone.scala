package io.apex.f1.data

import io.apex.f1.enums.ZoneFlag

case class MarshalZone(zoneStart: Float, zoneFlag: ZoneFlag) {
  val SIZE: Int = 5

  //  def fill(buffer: ByteBuf): MarshalZone = {
  //    val zoneStart = buffer.readFloatLE()
  //    val zoneFlag = ZoneFlag.valueOf(buffer.readByte())
  //
  //    MarshalZone(zoneStart, zoneFlag)
  //  }
  //
  //  def fillBuffer(marshalZone: MarshalZone, buffer: ByteBuf): ByteBuf = {
  //    buffer
  //      .writeFloatLE(marshalZone.zoneStart)
  //      .writeByte(marshalZone.zoneFlag.getValue)
  //  }

  override def toString: String = {
    s"MarshalZone[zoneStart=$zoneStart, zoneFlag=$zoneFlag]"
  }
}
