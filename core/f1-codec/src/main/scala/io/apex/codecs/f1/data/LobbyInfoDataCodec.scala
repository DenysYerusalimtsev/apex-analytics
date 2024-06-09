package io.apex.codecs.f1.data

import io.apex.f1.data.LobbyInfoData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object LobbyInfoDataCodec {
  val codec: Codec[LobbyInfoData] = {
    ("aiControlled" | uint8) ::
    ("teamId" | uint8) ::
    ("nationality" | uint8) ::
    ("name" | fixedSizeBytes(48, utf8)) ::
    ("carNumber" | uint8) ::
    ("readyStatus" | uint8)
  }.as[LobbyInfoData]
}
