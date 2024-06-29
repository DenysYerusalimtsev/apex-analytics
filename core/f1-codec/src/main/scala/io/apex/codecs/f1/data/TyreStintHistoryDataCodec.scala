package io.apex.codecs.f1.data

import io.apex.f1.data.TyreStintHistoryData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object TyreStintHistoryDataCodec {
  val codec: Codec[TyreStintHistoryData] = (
    ("endLap" | uint8) ::
      ("tyreActualCompound" | uint8) ::
      ("tyreVisualCompound" | uint8)
  ).as[TyreStintHistoryData]
}
