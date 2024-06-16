package io.apex.codecs.f1.enums

import io.apex.f1.enums.VehicleFiaFlag
import io.apex.f1.enums.VehicleFiaFlag.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object VehicleFiaFlagCodec {
  val codec: Codec[VehicleFiaFlag] = {
    mappedEnum(
      int32,
      VehicleFiaFlag.INVALID_UNKNOWN -> -1,
      VehicleFiaFlag.NONE -> 0,
      VehicleFiaFlag.GREEN -> 1,
      VehicleFiaFlag.BLUE -> 2,
      VehicleFiaFlag.YELLOW -> 3,
      VehicleFiaFlag.RED -> 4)
  }
}
