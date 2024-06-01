package io.apex.f1.data

import io.apex.f1.enums.*

case class LapData(
    lastLapTime: Float,
    currentLapTime: Float,
    sector1TimeInMS: Int,
    sector2TimeInMS: Int,
    bestLapTime: Float,
    bestLapNum: Int,
    bestLapSector1TimeInMS: Int,
    bestLapSector2TimeInMS: Int,
    bestLapSector3TimeInMS: Int,
    bestOverallSector1TimeInMS: Int,
    bestOverallSector1LapNum: Short,
    bestOverallSector2TimeInMS: Int,
    bestOverallSector2LapNum: Short,
    bestOverallSector3TimeInMS: Int,
    bestOverallSector3LapNum: Short,
    lapDistance: Float,
    totalDistance: Float,
    safetyCarDelta: Float,
    carPosition: Short,
    currentLapNum: Short,
    pitStatus: PitStatus,
    sector: Sector,
    currentLapInvalid: Short,
    penalties: Short,
    gridPosition: Short,
    driverStatus: DriverStatus,
    resultStatus: ResultStatus) {
  //  def fill(buffer: ByteBuf): LapData = {
  //    LapData(
  //      buffer.readFloatLE(),
  //      buffer.readFloatLE(),
  //      buffer.readUnsignedShortLE(),
  //      buffer.readUnsignedShortLE(),
  //      buffer.readFloatLE(),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedShortLE(),
  //      buffer.readUnsignedShortLE(),
  //      buffer.readUnsignedShortLE(),
  //      buffer.readUnsignedShortLE(),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedShortLE(),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedShortLE(),
  //      buffer.readUnsignedByte(),
  //      buffer.readFloatLE(),
  //      buffer.readFloatLE(),
  //      buffer.readFloatLE(),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedByte(),
  //      PitStatus.valueOf(buffer.readUnsignedByte()),
  //      Sector.valueOf(buffer.readUnsignedByte()),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedByte(),
  //      buffer.readUnsignedByte(),
  //      DriverStatus.valueOf(buffer.readUnsignedByte()),
  //      ResultStatus.valueOf(buffer.readUnsignedByte())
  //    )
  //  }
  //
  //  def fillBuffer(lapData: LapData, buffer: ByteBuf): ByteBuf = {
  //    buffer
  //      .writeFloatLE(lapData.lastLapTime)
  //      .writeFloatLE(lapData.currentLapTime)
  //      .writeShortLE(lapData.sector1TimeInMS)
  //      .writeShortLE(lapData.sector2TimeInMS)
  //      .writeFloatLE(lapData.bestLapTime)
  //      .writeByte(lapData.bestLapNum)
  //      .writeShortLE(lapData.bestLapSector1TimeInMS)
  //      .writeShortLE(lapData.bestLapSector2TimeInMS)
  //      .writeShortLE(lapData.bestLapSector3TimeInMS)
  //      .writeShortLE(lapData.bestOverallSector1TimeInMS)
  //      .writeByte(lapData.bestOverallSector1LapNum)
  //      .writeShortLE(lapData.bestOverallSector2TimeInMS)
  //      .writeByte(lapData.bestOverallSector2LapNum)
  //      .writeShortLE(lapData.bestOverallSector3TimeInMS)
  //      .writeByte(lapData.bestOverallSector3LapNum)
  //      .writeFloatLE(lapData.lapDistance)
  //      .writeFloatLE(lapData.totalDistance)
  //      .writeFloatLE(lapData.safetyCarDelta)
  //      .writeByte(lapData.carPosition)
  //      .writeByte(lapData.currentLapNum)
  //      .writeByte(lapData.pitStatus.getValue)
  //      .writeByte(lapData.sector.getValue)
  //      .writeByte(lapData.currentLapInvalid)
  //      .writeByte(lapData.penalties)
  //      .writeByte(lapData.gridPosition)
  //      .writeByte(lapData.driverStatus.getValue)
  //      .writeByte(lapData.resultStatus.getValue)
  //  }

  override def toString: String = {
    s"LapData[lastLapTime=$lastLapTime," +
    s"currentLapTime=$currentLapTime," +
    s"sector1TimeInMS=$sector1TimeInMS," +
    s"sector2TimeInMS=$sector2TimeInMS," +
    s"bestLapTime=$bestLapTime," +
    s"bestLapNum=$bestLapNum," +
    s"bestLapSector1TimeInMS=$bestLapSector1TimeInMS," +
    s"bestLapSector2TimeInMS=$bestLapSector2TimeInMS," +
    s"bestLapSector3TimeInMS=$bestLapSector3TimeInMS," +
    s"bestOverallSector1TimeInMS=$bestOverallSector1TimeInMS," +
    s"bestOverallSector1LapNum=$bestOverallSector1LapNum," +
    s"bestOverallSector2TimeInMS=$bestOverallSector2TimeInMS," +
    s"bestOverallSector2LapNum=$bestOverallSector2LapNum," +
    s"bestOverallSector3TimeInMS=$bestOverallSector3TimeInMS," +
    s"bestOverallSector3LapNum=$bestOverallSector3LapNum," +
    s"lapDistance=$lapDistance," +
    s"totalDistance=$totalDistance," +
    s"safetyCarDelta=$safetyCarDelta," +
    s"carPosition=$carPosition," +
    s"currentLapNum=$currentLapNum," +
    s"pitStatus=$pitStatus," +
    s"sector=$sector," +
    s"currentLapInvalid=$currentLapInvalid," +
    s"penalties=$penalties," +
    s"gridPosition=$gridPosition," +
    s"driverStatus=$driverStatus," +
    s"resultStatus=$resultStatus]"
  }
}

object LapData extends F1Data {
  override def size: Int = 53
}
