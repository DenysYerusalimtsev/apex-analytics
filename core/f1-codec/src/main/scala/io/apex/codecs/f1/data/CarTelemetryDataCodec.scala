package io.apex.codecs.f1.data

import io.apex.f1.data.CarTelemetryData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object CarTelemetryDataCodec {
  val codec: Codec[CarTelemetryData] = (
    ("speed" | uint16) ::
      ("throttle" | float) ::
      ("steer" | float) ::
      ("brake" | float) ::
      ("clutch" | uint8) ::
      ("gear" | int8) ::
      ("engineRPM" | uint16) ::
      ("drs" | uint8) ::
      ("revLightsPercent" | uint8) ::
      ("revLightsBitValue" | uint16) ::
      ("brakesTemperature" | listOfN(provide(4), uint16)) ::
      ("tyresSurfaceTemperature" | listOfN(provide(4), uint8)) ::
      ("tyresInnerTemperature" | listOfN(provide(4), uint8)) ::
      ("engineTemperature" | uint16) ::
      ("tyresPressure" | listOfN(provide(4), float)) ::
      ("surfaceType" | listOfN(provide(4), uint8))
  ).as[CarTelemetryData]
}
