package io.apex.codecs.f1.enums

import io.apex.f1.enums.DrsAllowed
import io.apex.f1.enums.DrsAllowed.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object DrsAllowedCodec {
  val codec: Codec[DrsAllowed] = mappedEnum(
    int8,
    UNKNOWN -> -1,
    NOT_ALLOWED -> 0,
    ALLOWED -> 1)
}
