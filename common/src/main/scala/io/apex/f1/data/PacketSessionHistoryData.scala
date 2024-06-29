package io.apex.f1.data

import io.apex.f1.packets.PacketHeader

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
    tyreStintsHistoryData: List[TyreStintHistoryData])

object PacketSessionHistoryData extends F1Data {

  override def size: Int =
    PacketHeader.size + 8 + (LapHistoryData.size * 22) + (TyreStintHistoryData.size * 8)
}
