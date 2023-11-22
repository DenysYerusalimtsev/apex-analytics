package io.apex.f1.enums

enum ActualTyreCompound(val value: Int):
  case UNKNOWN extends ActualTyreCompound(0)
  case F1_C5 extends ActualTyreCompound(16)
  case F1_C4 extends ActualTyreCompound(17)
  case F1_C3 extends ActualTyreCompound(18)
  case F1_C2 extends ActualTyreCompound(19)
  case F1_C1 extends ActualTyreCompound(20)
  case F1_INTER extends ActualTyreCompound(7)
  case F1_WET extends ActualTyreCompound(8)
  case F1_CLASSIC_DRY extends ActualTyreCompound(9)
  case F1_CLASSIC_WET extends ActualTyreCompound(10)
  case F2_SUPER_SOFT extends ActualTyreCompound(11)
  case F2_SOFT extends ActualTyreCompound(12)
  case F2_MEDIUM extends ActualTyreCompound(13)
  case F2_HARD extends ActualTyreCompound(14)
  case F2_WET extends ActualTyreCompound(15)

object ActualTyreCompound {
  def valueOf(value: Int): Option[ActualTyreCompound] =
    ActualTyreCompound.values.find(_.value == value)
}
