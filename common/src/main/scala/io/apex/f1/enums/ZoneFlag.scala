package io.apex.f1.enums

enum ZoneFlag(val value: Int) {
  case InvalidUnknown extends ZoneFlag(-1)
  case None extends ZoneFlag(0)
  case Green extends ZoneFlag(1)
  case Blue extends ZoneFlag(2)
  case Yellow extends ZoneFlag(3)
  case Red extends ZoneFlag(4)
}

object ZoneFlag {
  def valueOf(value: Int): Option[ZoneFlag] =
    ZoneFlag.values.find(_.value == value)
}
