package io.apex.f1.enums

enum DriverStatus(val value: Int) {
  case IN_GARAGE extends DriverStatus(0)
  case FLYING_LAP extends DriverStatus(1)
  case IN_LAP extends DriverStatus(2)
  case OUT_LAP extends DriverStatus(3)
  case ON_TRACK extends DriverStatus(4)
}

object DriverStatus:
  def valueOf(value: Int): Option[DriverStatus] =
    DriverStatus.values.find(_.value == value)
