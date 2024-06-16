package io.apex.codecs.f1.enums

import io.apex.f1.enums.Formula
import io.apex.f1.enums.Formula.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object FormulaCodec {
  val codec: Codec[Formula] = mappedEnum(
    int8,
    F1_MODERN -> 0,
    F1_CLASSIC -> 1,
    F2 -> 2,
    F1_GENERIC -> 3)
}
