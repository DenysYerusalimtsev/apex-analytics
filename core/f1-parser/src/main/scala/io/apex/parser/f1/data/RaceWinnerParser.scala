package io.apex.parser.f1.data

import io.apex.f1.data.RaceWinner
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object RaceWinnerParser {
  val codec: Codec[RaceWinner] = {
    ("vehicleIdx" | uint8)
  }.as[RaceWinner]
}
