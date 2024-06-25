package io.apex.codecs.f1.data

import io.apex.f1.data.TeamMateInPits
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object TeamMateInPitsCodec {
  val codec: Codec[TeamMateInPits] = ("vehicleIdx" | uint8).as[TeamMateInPits]
}
