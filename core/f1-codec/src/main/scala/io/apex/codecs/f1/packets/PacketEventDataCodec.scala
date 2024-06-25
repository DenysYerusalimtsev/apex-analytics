package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.EventDataDetailsCodec
import io.apex.f1.data.*
import io.apex.f1.enums.*
import io.apex.f1.packets.PacketEventData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketEventDataCodec {
  val codec: Codec[PacketEventData] = {
    ("header" | PacketHeaderCodec.codec) ::
    ("eventStringCode" | fixedSizeBytes(4, bytes)) ::
    ("eventDetails" | EventDataDetailsCodec.codec)
  }.as[PacketEventData]
}
