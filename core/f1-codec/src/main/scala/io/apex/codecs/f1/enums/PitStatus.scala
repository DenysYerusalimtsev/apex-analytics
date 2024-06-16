package io.apex.codecs.f1.enums

import io.apex.f1.enums.PitStatus
import io.apex.f1.enums.PitStatus.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PitStatusCodec {

  val codec: Codec[PitStatus] = mappedEnum(
    int8,
    NONE -> 0,
    PITTING -> 1,
    IN_PIT_AREA -> 2)
}
