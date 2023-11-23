package io.apex.f1.enums

enum TractionControl(val value: Int) {
  case OFF extends TractionControl(0)
  case MEDIUM extends TractionControl(1)
  case HIGH extends TractionControl(2)
}

object TractionControl {
  def valueOf(value: Int): Option[TractionControl] =
    TractionControl.values.find(_.value == value)
}
