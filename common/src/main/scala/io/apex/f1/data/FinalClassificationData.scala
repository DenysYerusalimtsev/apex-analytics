package io.apex.f1.data

import io.apex.f1.enums.ResultStatus

case class FinalClassificationData(
    position: Int,
    numLaps: Int,
    gridPosition: Int,
    points: Int,
    numPitStops: Int,
    resultStatus: ResultStatus,
    bestLapTimeInMS: Long,
    totalRaceTime: Double,
    penaltiesTime: Int,
    numPenalties: Int,
    numTyreStints: Int,
    tyreStintsActual: List[Int],
    tyreStintsVisual: List[Int],
    tyreStintsEndLaps: List[Int]) {
  //  def fill(buffer: ByteBuf): FinalClassificationData = {
  //    position = buffer.readUnsignedByte()
  //    numLaps = buffer.readUnsignedByte()
  //    gridPosition = buffer.readUnsignedByte()
  //    points = buffer.readUnsignedByte()
  //    numPitStops = buffer.readUnsignedByte()
  //    resultStatus = ResultStatus.valueOf(buffer.readUnsignedByte())
  //    bestLapTime = buffer.readFloatLE()
  //    totalRaceTime = buffer.readDoubleLE()
  //    penaltiesTime = buffer.readUnsignedByte()
  //    numPenalties = buffer.readUnsignedByte()
  //    numTyreStints = buffer.readUnsignedByte()
  //    for (j <- 0 until PacketConstants.TYRE_STINTS) {
  //      tyreStintsActual(j) = buffer.readUnsignedByte()
  //    }
  //    for (j <- 0 until PacketConstants.TYRE_STINTS) {
  //      tyreStintsVisual(j) = buffer.readUnsignedByte()
  //    }
  //    this
  //  }
  //
  //  def fillBuffer(buffer: ByteBuf): ByteBuf = {
  //    buffer.writeByte(position)
  //    buffer.writeByte(numLaps)
  //    buffer.writeByte(gridPosition)
  //    buffer.writeByte(points)
  //    buffer.writeByte(numPitStops)
  //    buffer.writeByte(resultStatus.getValue)
  //    buffer.writeFloatLE(bestLapTime)
  //    buffer.writeDoubleLE(totalRaceTime)
  //    buffer.writeByte(penaltiesTime)
  //    buffer.writeByte(numPenalties)
  //    buffer.writeByte(numTyreStints)
  //    for (j <- 0 until PacketConstants.TYRE_STINTS) {
  //      buffer.writeByte(tyreStintsActual(j))
  //    }
  //    for (j <- 0 until PacketConstants.TYRE_STINTS) {
  //      buffer.writeByte(tyreStintsVisual(j))
  //    }
  //    buffer
  //  }

  override def toString: String =
    s"FinalClassificationData[position=$position,numLaps=$numLaps,gridPosition=$gridPosition,points=$points," +
    s"numPitStops=$numPitStops,resultStatus=$resultStatus,bestLapTime=$bestLapTimeInMS,totalRaceTime=$totalRaceTime," +
    s"penaltiesTime=$penaltiesTime,numPenalties=$numPenalties,numTyreStints=$numTyreStints," +
    s"tyreStintsActual=${tyreStintsActual.mkString(", ")},tyreStintsVisual=${tyreStintsVisual.mkString(",")}]"
}

object FinalClassificationData extends F1Data {
  override def size: Int = 37
}
