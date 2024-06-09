package io.apex.codecs.f1.data

import io.apex.f1.data.LapData
import io.apex.f1.enums.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object LapDataCodec extends Codec[LapData] {

  val codec: Codec[LapData] = {
    ("lastLapTimeInMS" | uint32L) ::
    ("currentLapTimeInMS" | uint32L) ::
    ("sector1TimeInMS" | uint16L) ::
    ("sector2TimeInMS" | uint16L) ::
    ("lapDistance" | float) ::
    ("totalDistance" | float) ::
    ("safetyCarDelta" | float) ::
    ("carPosition" | uint8) ::
    ("currentLapNum" | uint8) ::
    ("pitStatus" | uint8) ::
    ("numPitStops" | uint8) ::
    ("sector" | uint8) ::
    ("currentLapInvalid" | uint8) ::
    ("penalties" | uint8) ::
    ("warnings" | uint8) ::
    ("numUnservedDriveThroughPens" | uint8) ::
    ("numUnservedStopGoPens" | uint8) ::
    ("gridPosition" | uint8) ::
    ("driverStatus" | uint8) ::
    ("resultStatus" | uint8) ::
    ("pitLaneTimerActive" | uint8) ::
    ("pitLaneTimeInLaneInMS" | uint16L) ::
    ("pitStopTimerInMS" | uint16L) ::
    ("pitStopShouldServePen" | uint8)
  }.as[LapData]
}
