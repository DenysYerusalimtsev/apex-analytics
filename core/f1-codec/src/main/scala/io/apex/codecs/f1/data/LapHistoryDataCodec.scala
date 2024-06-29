package io.apex.codecs.f1.data

import io.apex.f1.data.LapHistoryData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object LapHistoryDataCodec {
  val codec: Codec[LapHistoryData] = (
    ("lapTimeInMS" | uint32) ::
      ("sector1TimeInMS" | uint16) ::
      ("sector2TimeInMS" | uint16) ::
      ("sector3TimeInMS" | uint16) ::
      ("lapValidBitFlags" | uint8)
  ).as[LapHistoryData]
}
