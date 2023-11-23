package io.apex.f1.enums

enum FuelMix(val value: Int) {
  case LEAN extends FuelMix(0)
  case STANDARD extends FuelMix(1)
  case RICH extends FuelMix(2)
  case MAX extends FuelMix(3)
}

object FuelMix {
  def valueOf(value: Int): Option[FuelMix] =
    FuelMix.values.find(_.value == value)
}