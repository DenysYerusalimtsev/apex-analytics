package io.apex.codecs.f1.data

import io.apex.codecs.f1.enums.*
import io.apex.f1.data.LobbyInfoData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object LobbyInfoDataCodec {
  private val nameCodec: Codec[String] = fixedSizeBytes(48, utf8).xmap(_.trim, identity)

  val codec: Codec[LobbyInfoData] = (
    ("aiControlled" | uint8) ::
      ("teamId" | Team2022Codec.codec) ::
      ("nationality" | NationalityCodec.codec) ::
      ("name" | nameCodec) ::
      ("carNumber" | uint8) ::
      ("readyStatus" | ReadyStatusCodec.codec)
  ).as[LobbyInfoData]
}
