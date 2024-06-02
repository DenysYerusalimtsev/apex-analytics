package io.apex.parser.f1.data

import io.apex.f1.data.SpeedTrap
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object SpeedTrapParser {
  val speedTrapCodec: Codec[SpeedTrap] = {
    ("vehicleIdx" | uint8) ::
    ("speed" | float) ::
    ("isOverallFastestInSession" | uint8) ::
    ("isDriverFastestInSession" | uint8) ::
    ("fastestVehicleIdxInSession" | uint8) ::
    ("fastestSpeedInSession" | float)
  }.as[SpeedTrap]
}
