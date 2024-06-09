package io.apex.codecs.f1.data

import io.apex.f1.data.LapHistoryData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object LapHistoryDataCodec extends Codec[LapHistoryData] {
  val codec: Codec[LapHistoryData] = {
    ("lapTimeInMS" | uint32L) ::
    ("sector1TimeInMS" | uint16L) ::
    ("sector2TimeInMS" | uint16L) ::
    ("sector3TimeInMS" | uint16L) ::
    ("lapValidBitFlags" | uint8)
  }.as[LapHistoryData]
}
