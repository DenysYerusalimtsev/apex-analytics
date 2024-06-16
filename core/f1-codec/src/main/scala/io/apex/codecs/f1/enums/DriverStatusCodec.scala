package io.apex.codecs.f1.enums

import io.apex.f1.enums.DriverStatus
import io.apex.f1.enums.DriverStatus.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object DriverStatusCodec {
  val codec: Codec[DriverStatus] = mappedEnum(
    uint8,
    IN_GARAGE -> 0,
    FLYING_LAP -> 1,
    IN_LAP -> 2,
    OUT_LAP -> 3,
    ON_TRACK -> 4)
}
