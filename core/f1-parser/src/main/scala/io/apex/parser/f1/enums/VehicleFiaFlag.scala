package io.apex.parser.f1.enums

enum VehicleFiaFlag(val value: Int) {
  case INVALID_UNKNOWN extends VehicleFiaFlag(-1)
  case NONE extends VehicleFiaFlag(0)
  case GREEN extends VehicleFiaFlag(1)
  case BLUE extends VehicleFiaFlag(2)
  case YELLOW extends VehicleFiaFlag(3)
  case RED extends VehicleFiaFlag(4)
}

object VehicleFiaFlag {
  def valueOf(value: Int): Option[VehicleFiaFlag] =
    VehicleFiaFlag.values.find(_.value == value)
}
