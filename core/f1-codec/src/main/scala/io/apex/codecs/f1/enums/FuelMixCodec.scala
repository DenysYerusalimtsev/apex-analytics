package io.apex.codecs.f1.enums

import io.apex.f1.enums.FuelMix
import io.apex.f1.enums.FuelMix.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object FuelMixCodec {

  val codec: Codec[FuelMix] = mappedEnum(
    int8,
    LEAN -> 0,
    STANDARD -> 1,
    RICH -> 2,
    MAX -> 3)
}
