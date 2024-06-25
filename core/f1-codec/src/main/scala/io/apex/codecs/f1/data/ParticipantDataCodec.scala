package io.apex.codecs.f1.data

import io.apex.f1.data.ParticipantData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object ParticipantDataCodec {
  val codec: Codec[ParticipantData] = (
    ("m_aiControlled" | uint8) ::
      ("m_driverId" | uint8) ::
      ("m_networkId" | uint8) ::
      ("m_teamId" | uint8) ::
      ("m_myTeam" | uint8) ::
      ("m_raceNumber" | uint8) ::
      ("m_nationality" | uint8) ::
      ("m_name" | fixedSizeBytes(48, utf8)) ::
      ("m_yourTelemetry" | uint8)
  ).as[ParticipantData]
}
