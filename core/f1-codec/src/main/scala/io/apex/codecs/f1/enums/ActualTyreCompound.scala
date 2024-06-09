package io.apex.codecs.f1.enums

import scodec.*
import scodec.bits.*
import scodec.codecs.*

object ActualTyreCompound {
  val codec: Codec[ActualTyreCompound] =
    mappedEnum(
      uint8,
      Unknown -> 0,
      F1C5 -> 16,
      F1C4 -> 17,
      F1C3 -> 18,
      F1C2 -> 19,
      F1C1 -> 20,
      F1Inter -> 7,
      F1Wet -> 8,
      F1ClassicDry -> 9,
      F1ClassicWet -> 10,
      F2SuperSoft -> 11,
      F2Soft -> 12,
      F2Medium -> 13,
      F2Hard -> 14,
      F2Wet -> 15)
}
