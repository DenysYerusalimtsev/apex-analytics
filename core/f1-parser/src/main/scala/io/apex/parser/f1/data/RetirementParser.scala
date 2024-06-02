package io.apex.parser.f1.data

import io.apex.f1.data.Retirement
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object RetirementParser {
  val codec: Codec[Retirement] = {
    ("vehicleIdx" | uint8)
  }.as[Retirement]
}
