package io.apex.codecs.f1.data

import io.apex.codecs.f1.enums.{DriverCodec, NationalityCodec}
import io.apex.f1.data.ParticipantData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object ParticipantDataCodec {
  private val nameCodec: Codec[String] = fixedSizeBytes(48, utf8).xmap(_.trim, identity)

  val codec: Codec[ParticipantData] = (
    ("aiControlled" | uint8) ::
      ("driverId" | DriverCodec.codec2022) ::
      ("networkId" | uint8) ::
      ("teamId" | uint8) ::
      ("myTeam" | uint8) ::
      ("raceNumber" | uint8) ::
      ("nationality" | NationalityCodec.codec) ::
      ("name" | nameCodec) ::
      ("yourTelemetry" | uint8)
  ).as[ParticipantData]
}
