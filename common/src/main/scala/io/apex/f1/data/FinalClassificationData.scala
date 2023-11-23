package io.apex.f1.data

import io.netty.buffer.ByteBuf

import java.util.Arrays

case class FinalClassificationData(
                                    position: Short,
                                    numLaps: Short,
                                    gridPosition: Short,
                                    points: Short,
                                    numPitStops: Short,
                                    resultStatus: ResultStatus,
                                    bestLapTime: Float,
                                    totalRaceTime: Double,
                                    penaltiesTime: Short,
                                    numPenalties: Short,
                                    numTyreStints: Short,
                                    tyreStintsActual: Array[Short],
                                    tyreStintsVisual: Array[Short]
                                  ) {
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
      s"numPitStops=$numPitStops,resultStatus=$resultStatus,bestLapTime=$bestLapTime,totalRaceTime=$totalRaceTime," +
      s"penaltiesTime=$penaltiesTime,numPenalties=$numPenalties,numTyreStints=$numTyreStints," +
      s"tyreStintsActual=${Arrays.toString(tyreStintsActual)},tyreStintsVisual=${Arrays.toString(tyreStintsVisual)}]"
}
