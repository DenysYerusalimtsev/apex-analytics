package io.apex.f1.data

case class StartLights(numLights: Int)

case class DriveThroughPenaltyServed(vehicleIdx: Int)

case class StopGoPenaltyServed(vehicleIdx: Int)

case class Flashback(flashbackFrameIdentifier: Long, flashbackSessionTime: Float)

case class Buttons(buttonStatus: Long)
