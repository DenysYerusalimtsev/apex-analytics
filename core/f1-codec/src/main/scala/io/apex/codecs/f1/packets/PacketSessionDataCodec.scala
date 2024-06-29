package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.*
import io.apex.codecs.f1.enums.*
import io.apex.f1.packets.PacketSessionData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketSessionDataCodec {

  val codec: Codec[PacketSessionData] = (
    ("header" | PacketHeaderCodec.codec) ::
      ("weather" | WeatherCodec.codec) ::
      ("trackTemperature" | int8) ::
      ("airTemperature" | int8) ::
      ("totalLaps" | uint8) ::
      ("trackLength" | uint16) ::
      ("sessionType" | SessionTypeCodec.codec) ::
      ("trackId" | Track2022Codec.codec) ::
      ("formula" | FormulaCodec.codec) ::
      ("sessionTimeLeft" | uint16) ::
      ("sessionDuration" | uint16) ::
      ("pitSpeedLimit" | uint8) ::
      ("gamePaused" | uint8) ::
      ("isSpectating" | uint8) ::
      ("spectatorCarIndex" | uint8) ::
      ("sliProNativeSupport" | uint8) ::
      ("numMarshalZones" | uint8) ::
      ("marshalZones" | listOfN(provide(21), MarshalZoneCodec.codec)) ::
      ("safetyCarStatus" | SafetyCarStatusCodec.codec) ::
      ("networkGame" | uint8) ::
      ("numWeatherForecastSamples" | uint8) ::
      ("weatherForecastSamples" | listOfN(uint8, WeatherForecastSampleCodec.codec)) ::
      ("forecastAccuracy" | uint8) ::
      ("aiDifficulty" | uint8) ::
      ("seasonLinkIdentifier" | uint32) ::
      ("weekendLinkIdentifier" | uint32) ::
      ("sessionLinkIdentifier" | uint32) ::
      ("pitStopWindowIdealLap" | uint8) ::
      ("pitStopWindowLatestLap" | uint8) ::
      ("pitStopRejoinPosition" | uint8) ::
      ("steeringAssist" | uint8) ::
      ("brakingAssist" | uint8) ::
      ("gearboxAssist" | uint8) ::
      ("pitAssist" | uint8) ::
      ("pitReleaseAssist" | uint8) ::
      ("ERSAssist" | uint8) ::
      ("DRSAssist" | uint8) ::
      ("dynamicRacingLine" | uint8) ::
      ("dynamicRacingLineType" | uint8) ::
      ("gameMode" | uint8) ::
      ("ruleSet" | uint8) ::
      ("timeOfDay" | uint32) ::
      ("sessionLength" | uint8)
  ).as[PacketSessionData]
}
