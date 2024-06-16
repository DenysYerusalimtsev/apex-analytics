package io.apex.codecs.f1.enums

import io.apex.f1.enums.VisualTyreCompound
import io.apex.f1.enums.VisualTyreCompound.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object VisualTyreCompoundCodec {
  val codec: Codec[VisualTyreCompound] = {
    mappedEnum(
      uint8,
      VisualTyreCompound.UNKNOWN -> 0,
      VisualTyreCompound.F1_SOFT -> 16,
      VisualTyreCompound.F1_MEDIUM -> 17,
      VisualTyreCompound.F1_HARD -> 18,
      VisualTyreCompound.F1_INTER -> 7,
      VisualTyreCompound.F1_WET -> 8,
      VisualTyreCompound.F1_CLASSIC_DRY -> 9,
      VisualTyreCompound.F1_CLASSIC_WET -> 10,
      VisualTyreCompound.F2_SUPER_SOFT -> 11,
      VisualTyreCompound.F2_SOFT -> 12,
      VisualTyreCompound.F2_MEDIUM -> 13,
      VisualTyreCompound.F2_HARD -> 14,
      VisualTyreCompound.F2_WET -> 15)
  }
}
