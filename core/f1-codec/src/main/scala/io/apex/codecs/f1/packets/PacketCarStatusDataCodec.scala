package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.CarStatusDataCodec
import io.apex.f1.packets.PacketCarStatusData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketCarStatusDataCodec {
  val codec: Codec[PacketCarStatusData] = {
    ("header" | PacketHeaderCodec.codec) ::
    ("carStatusData" | vectorOfN(provide(22), CarStatusDataCodec.codec))
  }.as[PacketCarStatusData]
}
