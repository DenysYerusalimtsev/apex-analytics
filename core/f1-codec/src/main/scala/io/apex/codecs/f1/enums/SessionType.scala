package io.apex.codecs.f1.enums

import io.apex.f1.enums.SessionType
import io.apex.f1.enums.SessionType.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object SessionType {
  val codec: Codec[SessionType] = mappedEnum(
    uint8,
    UNKNOWN -> 0,
    P1 -> 1,
    P2 -> 2,
    P3 -> 3,
    SHORT_P -> 4,
    Q1 -> 5,
    Q2 -> 6,
    Q3 -> 7,
    SHORT_Q -> 8,
    OSQ -> 9,
    R -> 10,
    R2 -> 11,
    TIME_TRIAL -> 12)
}
