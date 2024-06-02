package io.apex.parser.f1.enums

enum ActualTyreCompound(val value: Int) {
  case Unknown extends ActualTyreCompound(0)
  case F1C5 extends ActualTyreCompound(16)
  case F1C4 extends ActualTyreCompound(17)
  case F1C3 extends ActualTyreCompound(18)
  case F1C2 extends ActualTyreCompound(19)
  case F1C1 extends ActualTyreCompound(20)
  case F1Inter extends ActualTyreCompound(7)
  case F1Wet extends ActualTyreCompound(8)
  case F1ClassicDry extends ActualTyreCompound(9)
  case F1ClassicWet extends ActualTyreCompound(10)
  case F2SuperSoft extends ActualTyreCompound(11)
  case F2Soft extends ActualTyreCompound(12)
  case F2Medium extends ActualTyreCompound(13)
  case F2Hard extends ActualTyreCompound(14)
  case F2Wet extends ActualTyreCompound(15)
}

object ActualTyreCompound {
  def valueOf(value: Int): Option[ActualTyreCompound] =
    ActualTyreCompound.values.find(_.value == value)
}
