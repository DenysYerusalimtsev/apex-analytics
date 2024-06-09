package io.apex.codecs.f1.data

import io.apex.f1.data.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object StartLightsParser {
  val startLightsCodec: Codec[StartLights] = {
    ("numLights" | uint8)
  }.as[StartLights]

  val driveThroughPenaltyServedCodec: Codec[DriveThroughPenaltyServed] = {
    ("vehicleIdx" | uint8)
  }.as[DriveThroughPenaltyServed]

  val stopGoPenaltyServedCodec: Codec[StopGoPenaltyServed] = {
    ("vehicleIdx" | uint8)
  }.as[StopGoPenaltyServed]

  val flashbackCodec: Codec[Flashback] = {
    ("flashbackFrameIdentifier" | uint32L) ::
    ("flashbackSessionTime" | float)
  }.as[Flashback]

  val buttonsCodec: Codec[Buttons] = {
    ("buttonStatus" | uint32L)
  }.as[Buttons]
}
