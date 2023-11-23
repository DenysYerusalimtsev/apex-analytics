package io.apex.f1.enums

enum ZoneFlag(val value: Int) {
  case INVALID_UNKNOWN extends ZoneFlag(-1)
  case NONE extends ZoneFlag(0)
  case GREEN extends ZoneFlag(1)
  case BLUE extends ZoneFlag(2)
  case YELLOW extends ZoneFlag(3)
  case RED extends ZoneFlag(4)
}

object ZoneFlag {
  def valueOf(value: Int): Option[ZoneFlag] =
    ZoneFlag.values.find(_.value == value)
}
