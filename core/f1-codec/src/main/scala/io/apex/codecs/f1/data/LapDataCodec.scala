package io.apex.codecs.f1.data

import io.apex.codecs.f1.enums.*
import io.apex.f1.data.LapData
import io.apex.f1.enums.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object LapDataCodec extends Codec[LapData] {

  val codec: Codec[LapData] = (
    ("lastLapTimeInMS" | uint32) ::
      ("currentLapTimeInMS" | uint32) ::
      ("sector1TimeInMS" | uint16) ::
      ("sector2TimeInMS" | uint16) ::
      ("lapDistance" | float) ::
      ("totalDistance" | float) ::
      ("safetyCarDelta" | float) ::
      ("carPosition" | uint8) ::
      ("currentLapNum" | uint8) ::
      ("pitStatus" | PitStatusCodec.codec) ::
      ("numPitStops" | uint8) ::
      ("sector" | uint8) ::
      ("currentLapInvalid" | uint8) ::
      ("penalties" | uint8) ::
      ("warnings" | uint8) ::
      ("numUnservedDriveThroughPens" | uint8) ::
      ("numUnservedStopGoPens" | uint8) ::
      ("gridPosition" | uint8) ::
      ("driverStatus" | DriverStatusCodec.codec) ::
      ("resultStatus" | ResultStatusCodec.codec) ::
      ("pitLaneTimerActive" | uint8) ::
      ("pitLaneTimeInLaneInMS" | uint16) ::
      ("pitStopTimerInMS" | uint16) ::
      ("pitStopShouldServePen" | uint8)
  ).as[LapData]
}
