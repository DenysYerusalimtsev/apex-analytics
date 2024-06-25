package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.LobbyInfoDataCodec
import io.apex.f1.packets.PacketLobbyInfoData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketLobbyInfoDataCodec {
  val codec: Codec[PacketLobbyInfoData] = {
    ("header" | PacketHeaderCodec.codec) ::
    ("numPlayers" | uint8) ::
    ("lobbyPlayers" | listOfN(provide(22), LobbyInfoDataCodec.codec))
  }.as[PacketLobbyInfoData]
}
