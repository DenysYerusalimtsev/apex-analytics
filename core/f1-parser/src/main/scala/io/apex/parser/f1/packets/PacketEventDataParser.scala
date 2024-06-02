package io.apex.parser.f1.packets

import io.apex.f1.data.*
import io.apex.f1.enums.*
import io.apex.f1.packets.PacketEventData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketEventDataParser {
  val codec: Codec[PacketEventData] = {
    ("header" | PacketHeaderCodec.codec) ::
    ("eventStringCode" | fixedSizeBytes(4, bytes)) ::
    ("eventDetails" | EventDataDetailsParser.codec)
  }.as[PacketEventData]
}
