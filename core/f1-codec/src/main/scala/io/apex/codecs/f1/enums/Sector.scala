package io.apex.codecs.f1.enums

import io.apex.f1.enums.Sector
import io.apex.f1.enums.Sector.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object Sector {

  val codec: Codec[Sector] = mappedEnum(
    uint8,
    SECTOR1 -> 0,
    SECTOR2 -> 1,
    SECTOR3 -> 2)
}
