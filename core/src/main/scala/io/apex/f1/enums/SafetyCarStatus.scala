package io.apex.f1.enums

enum SafetyCarStatus(val value: Int) {
  case NO_SAFETY_CAR extends SafetyCarStatus(0)
  case FULL_SAFETY_CAR extends SafetyCarStatus(1)
  case VIRTUAL_SAFETY_CAR extends SafetyCarStatus(2)
}

object SafetyCarStatus {
  def valueOf(value: Int): Option[SafetyCarStatus] =
    SafetyCarStatus.values.find(_.value == value)
}
