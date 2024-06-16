package io.apex.codecs.f1.enums

import io.apex.f1.enums.TractionControl
import io.apex.f1.enums.TractionControl.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object TractionControlCodec {
  val codec: Codec[TractionControl] = {
    mappedEnum(
      uint8,
      TractionControl.OFF -> 0,
      TractionControl.MEDIUM -> 1,
      TractionControl.HIGH -> 2)
  }
}
