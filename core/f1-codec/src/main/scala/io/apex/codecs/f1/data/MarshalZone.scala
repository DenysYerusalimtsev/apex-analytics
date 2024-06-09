package io.apex.codecs.f1.data

import io.apex.f1.data.MarshalZone
import io.apex.f1.enums.ZoneFlag
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object MarshalZone {
  implicit val codec: Codec[MarshalZone] =
    (("zoneStart" | float) :: ("zoneFlag" | Codec[ZoneFlag])).as[MarshalZone]
}
