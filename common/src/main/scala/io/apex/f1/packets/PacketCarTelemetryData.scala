package io.apex.f1.packets

import io.apex.f1.PacketConstants
import io.apex.f1.data.*
import io.apex.f1.enums.*

case class PacketCarTelemetryData(
                                   header: PacketHeader,
                                   carTelemetryData: List[CarTelemetryData],
                                   buttonStatus: Long,
                                   mfdPanelIndex: MfdPanel,
                                   mfdPanelIndexSecondaryPlayer: MfdPanel,
                                   suggestedGear: Short
                                 ) {

  override def toString: String = {
    val carTelemetryDataString = carTelemetryData.map(_.toString).mkString(",")
    s"CarTelemetry[$header, carTelemetryData=[$carTelemetryDataString], " +
      s"buttonStatus=$buttonStatus, mfdPanelIndex=$mfdPanelIndex, " +
      s"mfdPanelIndexSecondaryPlayer=$mfdPanelIndexSecondaryPlayer, suggestedGear=$suggestedGear]"
  }
  //  def fill(buffer: ByteBuf): PacketCarTelemetryData = {
  //    val filledHeader = PacketHeader().fill(buffer)
  //    val filledCarTelemetryData = ListBuffer[CarTelemetryData]()
  //    for (_ <- 0 until PacketConstants.CARS) {
  //      filledCarTelemetryData += CarTelemetryData().fill(buffer)
  //    }
  //    val filledButtonStatus = buffer.readUnsignedIntLE()
  //    val filledMfdPanelIndex = MfdPanel.valueOf(buffer.readUnsignedByte())
  //    val filledMfdPanelIndexSecondaryPlayer = MfdPanel.valueOf(buffer.readUnsignedByte())
  //    val filledSuggestedGear = buffer.readByte()
  //    PacketCarTelemetryData(
  //      filledHeader,
  //      filledCarTelemetryData.toList,
  //      filledButtonStatus,
  //      filledMfdPanelIndex,
  //      filledMfdPanelIndexSecondaryPlayer,
  //      filledSuggestedGear
  //    )
  //  }
  //
  //  def fillBuffer(packet: PacketCarTelemetryData, buffer: ByteBuf): ByteBuf = {
  //    packet.header.fillBuffer(buffer)
  //    packet.carTelemetryData.foreach(_.fillBuffer(buffer))
  //    buffer.writeIntLE(packet.buttonStatus.toInt)
  //    buffer.writeByte(packet.mfdPanelIndex.getValue())
  //    buffer.writeByte(packet.mfdPanelIndexSecondaryPlayer.getValue())
  //    buffer.writeByte(packet.suggestedGear)
  //    buffer
  //  }
}

object PacketCarTelemetryData extends Packet {
  override def size: Int = PacketHeader.size + CarTelemetryData.size * PacketConstants.CARS + 7
}
