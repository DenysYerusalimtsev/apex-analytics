package io.apex.codecs.f1.enums

import io.apex.f1.enums.ResultStatus
import io.apex.f1.enums.ResultStatus.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object ResultStatusCodec {

  // Codec for ResultStatus
  val codec: Codec[ResultStatus] = mappedEnum(
    int8,
    INVALID -> 0,
    INACTIVE -> 1,
    ACTIVE -> 2,
    FINISHED -> 3,
    DISQUALIFIED -> 4,
    NOT_CLASSIFIED -> 5,
    RETIRED -> 6)
}
