package io.apex.codecs.f1.enums

import io.apex.f1.enums.Weather
import io.apex.f1.enums.Weather.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object WeatherCodec {
  val codec: Codec[Weather] = {
    mappedEnum(
      uint8,
      Weather.CLEAR -> 0,
      Weather.LIGHT_CLOUD -> 1,
      Weather.OVERCAST -> 2,
      Weather.LIGHT_RAIN -> 3,
      Weather.HEAVY_RAIN -> 4,
      Weather.STORM -> 5)
  }
}
