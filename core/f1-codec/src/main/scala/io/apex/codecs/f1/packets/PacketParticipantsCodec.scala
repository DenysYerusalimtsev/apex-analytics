package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.ParticipantDataCodec
import io.apex.f1.packets.{PacketHeader, PacketParticipantsData}
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketParticipantsCodec {
  val codec: Codec[PacketParticipantsData] = (
    ("m_header" | PacketHeaderCodec.codec) ::
      ("m_numActiveCars" | uint8) ::
      ("m_participants" | vectorOfN(provide(22), ParticipantDataCodec.codec))
  ).as[PacketParticipantsData]
}
