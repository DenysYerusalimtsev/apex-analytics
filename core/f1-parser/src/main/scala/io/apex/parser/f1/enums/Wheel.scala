package io.apex.parser.f1.enums

enum Wheel(val value: Int) {
  case REAR_LEFT extends Wheel(0)
  case REAR_RIGHT extends Wheel(1)
  case FRONT_LEFT extends Wheel(2)
  case FRONT_RIGHT extends Wheel(3)
}

object Wheel {
  def valueOf(value: Int): Option[Wheel] =
    Wheel.values.find(_.value == value)
}

