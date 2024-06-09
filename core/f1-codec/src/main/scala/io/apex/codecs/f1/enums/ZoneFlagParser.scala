package io.apex.codecs.f1.enums

import io.apex.f1.enums.ZoneFlag
import scodec.*
import scodec.bits.*
import scodec.codecs.*

import scala.util.Try

object ZoneFlagParser {
  implicit val zoneFlagCodec: Codec[ZoneFlag] =
    mappedEnum(
      uint8,
      ZoneFlag.InvalidUnknown -> -1,
      ZoneFlag.None -> 0,
      ZoneFlag.Green -> 1,
      ZoneFlag.Blue -> 2,
      ZoneFlag.Yellow -> 3,
      ZoneFlag.Red -> 4)
}
