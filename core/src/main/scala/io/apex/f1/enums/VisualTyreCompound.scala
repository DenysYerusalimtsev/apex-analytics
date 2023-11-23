package io.apex.f1.enums

enum VisualTyreCompound(val value: Int) {
  case UNKNOWN extends VisualTyreCompound(0)
  case F1_SOFT extends VisualTyreCompound(16)
  case F1_MEDIUM extends VisualTyreCompound(17)
  case F1_HARD extends VisualTyreCompound(18)
  case F1_INTER extends VisualTyreCompound(7)
  case F1_WET extends VisualTyreCompound(8)
  case F1_CLASSIC_DRY extends VisualTyreCompound(9)
  case F1_CLASSIC_WET extends VisualTyreCompound(10)
  case F2_SUPER_SOFT extends VisualTyreCompound(11)
  case F2_SOFT extends VisualTyreCompound(12)
  case F2_MEDIUM extends VisualTyreCompound(13)
  case F2_HARD extends VisualTyreCompound(14)
  case F2_WET extends VisualTyreCompound(15)
}

object VisualTyreCompound {
  def valueOf(value: Int): Option[VisualTyreCompound] =
    VisualTyreCompound.values.find(_.value == value)
}

