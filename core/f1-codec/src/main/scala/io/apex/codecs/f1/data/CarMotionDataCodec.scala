package io.apex.codecs.f1.data

import io.apex.f1.data.CarMotionData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object CarMotionDataCodec {
  implicit val codec: Codec[CarMotionData] = (
    ("worldPositionX" | float) ::
      ("worldPositionY" | float) ::
      ("worldPositionZ" | float) ::
      ("worldVelocityX" | float) ::
      ("worldVelocityY" | float) ::
      ("worldVelocityZ" | float) ::
      ("worldForwardDirX" | int16) ::
      ("worldForwardDirY" | int16) ::
      ("worldForwardDirZ" | int16) ::
      ("worldRightDirX" | int16) ::
      ("worldRightDirY" | int16) ::
      ("worldRightDirZ" | int16) ::
      ("gForceLateral" | float) ::
      ("gForceLongitudinal" | float) ::
      ("gForceVertical" | float) ::
      ("yaw" | float) ::
      ("pitch" | float) ::
      ("roll" | float)
  ).as[CarMotionData]
}
