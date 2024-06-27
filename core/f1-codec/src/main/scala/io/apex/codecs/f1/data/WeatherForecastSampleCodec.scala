package io.apex.codecs.f1.data

import io.apex.codecs.f1.enums.{SessionTypeCodec, WeatherCodec}
import io.apex.f1.data.WeatherForecastSample
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object WeatherForecastSampleCodec extends Codec[WeatherForecastSample] {

  val codec: Codec[WeatherForecastSample] = (
    ("sessionType" | SessionTypeCodec.codec) ::
      ("timeOffset" | uint8) ::
      ("weather" | WeatherCodec.codec) ::
      ("trackTemperature" | int8) ::
      ("trackTemperatureChange" | int8) ::
      ("airTemperature" | int8) ::
      ("airTemperatureChange" | int8) ::
      ("rainPercentage" | uint8)
  ).as[WeatherForecastSample]
}
