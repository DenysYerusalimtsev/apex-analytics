package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.LapDataCodec
import io.apex.f1.packets.PacketLapData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketLapDataCodec {
  val codec: Codec[PacketLapData] = (
    ("header" | PacketHeaderCodec.codec) ::
      ("lapData" | listOfN(provide(22), LapDataCodec.codec)) ::
      ("timeTrialPBCarIdx" | uint8) ::
      ("timeTrialRivalCarIdx" | uint8)
  ).as[PacketLapData]
}
