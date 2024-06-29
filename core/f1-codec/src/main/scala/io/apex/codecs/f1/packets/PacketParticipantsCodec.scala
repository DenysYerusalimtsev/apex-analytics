package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.ParticipantDataCodec
import io.apex.f1.packets.{PacketHeader, PacketParticipantsData}
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketParticipantsCodec {
  val codec: Codec[PacketParticipantsData] = (
    ("header" | PacketHeaderCodec.codec) ::
      ("numActiveCars" | uint8) ::
      ("participants" | listOfN(provide(22), ParticipantDataCodec.codec))
  ).as[PacketParticipantsData]
}
