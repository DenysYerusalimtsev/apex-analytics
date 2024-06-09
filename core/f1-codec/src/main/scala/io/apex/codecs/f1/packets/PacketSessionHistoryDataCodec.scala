package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.*
import io.apex.f1.data.PacketSessionHistoryData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketSessionHistoryDataCodec {
  val codec: Codec[PacketSessionHistoryData] = {
    ("header" | Codec[PacketHeader]) ::
    ("carIdx" | uint8) ::
    ("numLaps" | uint8) ::
    ("numTyreStints" | uint8) ::
    ("bestLapTimeLapNum" | uint8) ::
    ("bestSector1LapNum" | uint8) ::
    ("bestSector2LapNum" | uint8) ::
    ("bestSector3LapNum" | uint8) ::
    ("lapHistoryData" | listOfN(uint8, LapHistoryDataCodec.codec)) ::
    ("tyreStintsHistoryData" | listOfN(uint8, TyreStintHistoryDataCodec.codec))
  }.as[PacketSessionHistoryData]
}
