package io.apex.codecs.f1.enums

import io.apex.f1.enums.ErsDeployMode
import io.apex.f1.enums.ErsDeployMode.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object ErsDeployMode {
  val codec: Codec[ErsDeployMode] = mappedEnum(
    int8,
    NONE -> 0,
    MEDIUM -> 1,
    OVERTAKE -> 2,
    HOTLAP -> 3)
}
