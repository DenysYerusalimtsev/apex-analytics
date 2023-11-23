package io.apex.f1.enums

enum Sector(val value: Int) {
  case SECTOR1 extends Sector(0)
  case SECTOR2 extends Sector(1)
  case SECTOR3 extends Sector(2)
}

object Sector {
  def valueOf(value: Int): Option[Sector] =
    Sector.values.find(_.value == value)
}

