package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.CarSetupDataCodec
import io.apex.f1.packets.PacketCarSetupData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketCarSetupDataCodec {
  val codec: Codec[PacketCarSetupData] = {
    ("header" | PacketHeaderCodec.codec) ::
    ("carSetups" | vectorOfN(provide(22), CarSetupDataCodec.codec))
  }.as[PacketCarSetupData]
}
