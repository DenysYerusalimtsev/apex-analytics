package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.{MarshalZoneCodec, WeatherForecastSampleCodec}
import io.apex.f1.packets.PacketSessionData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketSessionDataCodec extends Codec[PacketSessionData] {

  val codec: Codec[PacketSessionData] = {
    ("header" | PacketHeaderCodec.codec) ::
    ("weather" | uint8) ::
    ("trackTemperature" | int8) ::
    ("airTemperature" | int8) ::
    ("totalLaps" | uint8) ::
    ("trackLength" | uint16L) ::
    ("sessionType" | uint8) ::
    ("trackId" | int8) ::
    ("formula" | uint8) ::
    ("sessionTimeLeft" | uint16L) ::
    ("sessionDuration" | uint16L) ::
    ("pitSpeedLimit" | uint8) ::
    ("gamePaused" | uint8) ::
    ("isSpectating" | uint8) ::
    ("spectatorCarIndex" | uint8) ::
    ("sliProNativeSupport" | uint8) ::
    ("numMarshalZones" | uint8) ::
    ("marshalZones" | vectorOfN(uint8, MarshalZoneCodec.codec)) ::
    ("safetyCarStatus" | uint8) ::
    ("networkGame" | uint8) ::
    ("numWeatherForecastSamples" | uint8) ::
    ("weatherForecastSamples" | vectorOfN(uint8, WeatherForecastSampleCodec.codec)) ::
    ("forecastAccuracy" | uint8) ::
    ("aiDifficulty" | uint8) ::
    ("seasonLinkIdentifier" | uint32L) ::
    ("weekendLinkIdentifier" | uint32L) ::
    ("sessionLinkIdentifier" | uint32L) ::
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
    ("timeOfDay" | uint32L) ::
    ("sessionLength" | uint8)
  }.as[PacketSessionData]
}
