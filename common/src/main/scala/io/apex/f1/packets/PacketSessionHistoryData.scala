package io.apex.f1.packets

import io.apex.f1.data.*

case class PacketSessionHistoryData(
    header: PacketHeader,
    carIdx: Int,
    numLaps: Int,
    numTyreStints: Int,
    bestLapTimeLapNum: Int,
    bestSector1LapNum: Int,
    bestSector2LapNum: Int,
    bestSector3LapNum: Int,
    lapHistoryData: List[LapHistoryData],
    tyreStintsHistoryData: List[TyreStintHistoryData]) {
  override def toString: String = {
    val lapHistoryString = lapHistoryData.map(_.toString).mkString(", ")
    val tyreStintsHistoryString = tyreStintsHistoryData.map(_.toString).mkString(", ")
    s"PacketSessionHistoryData[header=$header, carIdx=$carIdx, numLaps=$numLaps, " +
    s"numTyreStints=$numTyreStints, bestLapTimeLapNum=$bestLapTimeLapNum, " +
    s"bestSector1LapNum=$bestSector1LapNum, bestSector2LapNum=$bestSector2LapNum, " +
    s"bestSector3LapNum=$bestSector3LapNum, lapHistoryData=[$lapHistoryString], " +
    s"tyreStintsHistoryData=[$tyreStintsHistoryString]]"
  }
}

object PacketSessionHistoryData extends F1Packet {
  // 1146
  override def size: Int =
    PacketHeader.size + 8 + (LapHistoryData.size * 100) + (TyreStintHistoryData.size * 8)
}
