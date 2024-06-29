package io.apex.codecs.f1.packets

import io.apex.codecs.f1.enums.*
import io.apex.f1.packets.PacketHeader
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketHeaderCodec {
  val codec: Codec[PacketHeader] =
    fixedSizeBytes(
      PacketHeader.size,
      ("packetFormat" | uint16) ::
      ("gameMajorVersion" | uint8) ::
      ("gameMinorVersion" | uint8) ::
      ("packetVersion" | uint8) ::
      ("packetId" | PacketIdCodec.codec) ::
      ("sessionUid" | int64) ::
      ("sessionTime" | float) ::
      ("frameIdentifier" | uint32) ::
      ("playerCarIndex" | uint8) ::
      ("secondaryPlayerCarIndex" | uint8)).as[PacketHeader]
}
