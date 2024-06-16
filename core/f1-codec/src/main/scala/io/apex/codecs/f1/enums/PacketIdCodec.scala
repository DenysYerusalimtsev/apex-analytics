package io.apex.codecs.f1.enums

import io.apex.f1.enums.PacketId
import io.apex.f1.enums.PacketId.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketIdCodec {

  val codec: Codec[PacketId] = mappedEnum(
    int8,
    MOTION -> 0,
    SESSION -> 1,
    LAP_DATA -> 2,
    EVENT -> 3,
    PARTICIPANTS -> 4,
    CAR_SETUPS -> 5,
    CAR_TELEMETRY -> 6,
    CAR_STATUS -> 7,
    FINAL_CLASSIFICATION -> 8,
    LOBBY_INFO -> 9)
}
