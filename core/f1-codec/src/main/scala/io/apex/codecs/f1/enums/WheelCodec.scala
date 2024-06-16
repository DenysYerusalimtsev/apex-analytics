package io.apex.codecs.f1.enums

import io.apex.f1.enums.Wheel
import io.apex.f1.enums.Wheel.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object WheelCodec {
  val codec: Codec[Wheel] = {
    mappedEnum(
      uint8,
      Wheel.REAR_LEFT -> 0,
      Wheel.REAR_RIGHT -> 1,
      Wheel.FRONT_LEFT -> 2,
      Wheel.FRONT_RIGHT -> 3)
  }
}
