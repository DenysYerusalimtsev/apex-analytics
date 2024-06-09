package io.apex.codecs.f1.data

import io.apex.f1.data.WeatherForecastSample
import io.apex.f1.enums.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object WeatherForecastSampleCodec extends Codec[WeatherForecastSample] {

  val codec: Codec[WeatherForecastSample] = {
    ("sessionType" | uint8) ::
    ("timeOffset" | uint8) ::
    ("weather" | uint8) ::
    ("trackTemperature" | int8) ::
    ("trackTemperatureChange" | int8) ::
    ("airTemperature" | int8) ::
    ("airTemperatureChange" | int8) ::
    ("rainPercentage" | uint8)
  }.as[WeatherForecastSample]
}
