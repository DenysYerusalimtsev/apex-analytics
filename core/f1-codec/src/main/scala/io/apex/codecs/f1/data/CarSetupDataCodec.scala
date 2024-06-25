package io.apex.codecs.f1.data

import io.apex.f1.data.CarSetupData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object CarSetupDataCodec {
  val codec: Codec[CarSetupData] = (
    ("frontWing" | uint8) ::
      ("rearWing" | uint8) ::
      ("onThrottle" | uint8) ::
      ("offThrottle" | uint8) ::
      ("frontCamber" | float) ::
      ("rearCamber" | float) ::
      ("frontToe" | float) ::
      ("rearToe" | float) ::
      ("frontSuspension" | uint8) ::
      ("rearSuspension" | uint8) ::
      ("frontAntiRollBar" | uint8) ::
      ("rearAntiRollBar" | uint8) ::
      ("frontSuspensionHeight" | uint8) ::
      ("rearSuspensionHeight" | uint8) ::
      ("brakePressure" | uint8) ::
      ("brakeBias" | uint8) ::
      ("rearLeftTyrePressure" | float) ::
      ("rearRightTyrePressure" | float) ::
      ("frontLeftTyrePressure" | float) ::
      ("frontRightTyrePressure" | float) ::
      ("ballast" | uint8) ::
      ("fuelLoad" | float)
  ).as[CarSetupData]
}
