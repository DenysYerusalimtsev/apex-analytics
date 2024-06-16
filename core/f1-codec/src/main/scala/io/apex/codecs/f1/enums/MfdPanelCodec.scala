package io.apex.codecs.f1.enums

import io.apex.f1.enums.MfdPanel
import io.apex.f1.enums.MfdPanel.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object MfdPanelCodec {

  val codec: Codec[MfdPanel] = mappedEnum(
    int8,
    CAR_SETUP -> 0,
    PITS -> 1,
    DAMAGE -> 2,
    ENGINE -> 3,
    TEMPERATURES -> 4,
    MFD_CLOSED -> 255)
}
