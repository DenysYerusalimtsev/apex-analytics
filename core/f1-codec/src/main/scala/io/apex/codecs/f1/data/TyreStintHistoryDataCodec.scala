package io.apex.codecs.f1.data

import io.apex.f1.data.TyreStintHistoryData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object TyreStintHistoryDataCodec extends Codec[TyreStintHistoryData] {
  val codec: Codec[TyreStintHistoryData] = (
    ("m_endLap" | uint8) ::
      ("m_tyreActualCompound" | uint8) ::
      ("m_tyreVisualCompound" | uint8)
  ).as[TyreStintHistoryData]
}
