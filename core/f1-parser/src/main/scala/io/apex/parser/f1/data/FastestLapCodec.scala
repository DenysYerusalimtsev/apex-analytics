package io.apex.parser.f1.data

import io.apex.f1.data.FastestLap
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object FastestLapCodec {
  val codec: Codec[FastestLap] = {
    ("vehicleIdx" | uint8) ::
    ("lapTime" | float)
  }.as[FastestLap]
}
