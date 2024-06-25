package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.CarDamageDataCodec
import io.apex.f1.packets.PacketCarDamageData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketCarDamageDataCodec {
  val codec: Codec[PacketCarDamageData] = (
    ("header" | PacketHeaderCodec.codec) ::
      ("carDamageData" | vectorOfN(provide(22), CarDamageDataCodec.codec))
  ).as[PacketCarDamageData]
}
