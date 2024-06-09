package io.apex.codecs.f1.packets

import io.apex.f1.packets.PacketLapData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketLapDataCodec extends Codec[PacketLapData] {

  val codec: Codec[PacketLapData] = {
    ("header" | PacketHeaderCodec.codec) ::
    ("lapData" | vectorOfN(provide(22), LapDataCodec.codec)) ::
    ("timeTrialPBCarIdx" | uint8) ::
    ("timeTrialRivalCarIdx" | uint8)
  }.as[PacketLapData]
}
