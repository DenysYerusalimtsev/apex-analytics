package io.apex.codecs.f1.enums

import io.apex.f1.enums.SafetyCarStatus
import io.apex.f1.enums.SafetyCarStatus.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object SafetyCarStatusCodec {

  val codec: Codec[SafetyCarStatus] = mappedEnum(
    int8,
    NO_SAFETY_CAR -> 0,
    FULL_SAFETY_CAR -> 1,
    VIRTUAL_SAFETY_CAR -> 2)
}
