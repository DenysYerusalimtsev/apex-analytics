package io.apex.codecs.f1.enums

import io.apex.f1.enums.ReadyStatus
import io.apex.f1.enums.ReadyStatus.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object ReadyStatusCodec {

  val codec: Codec[ReadyStatus] = mappedEnum(
    int8,
    NOT_READY -> 0,
    READY -> 1,
    SPECTATING -> 2)
}
