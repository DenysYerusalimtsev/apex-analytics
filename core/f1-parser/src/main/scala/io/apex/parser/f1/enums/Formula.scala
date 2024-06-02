package io.apex.parser.f1.enums

enum Formula(val value: Int) {
  case F1_MODERN extends Formula(0)
  case F1_CLASSIC extends Formula(1)
  case F2 extends Formula(2)
  case F1_GENERIC extends Formula(3)
}

object Formula {
  def valueOf(value: Int): Option[Formula] =
    Formula.values.find(_.value == value)
}
