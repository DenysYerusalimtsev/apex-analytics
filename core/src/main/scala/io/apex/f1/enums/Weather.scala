package io.apex.f1.enums

enum Weather(val value: Int) {
  case CLEAR extends Weather(0)
  case LIGHT_CLOUD extends Weather(1)
  case OVERCAST extends Weather(2)
  case LIGHT_RAIN extends Weather(3)
  case HEAVY_RAIN extends Weather(4)
  case STORM extends Weather(5)
}

object Weather {
  def valueOf(value: Int): Option[Weather] =
    Weather.values.find(_.value == value)
}
