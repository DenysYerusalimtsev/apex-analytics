package io.apex.parser.f1.data

import io.apex.f1.data.TeamMateInPits
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object TeamMateInPitsParser {
  val teamMateInPitsCodec: Codec[TeamMateInPits] = {
    ("vehicleIdx" | uint8)
  }.as[TeamMateInPits]
}
