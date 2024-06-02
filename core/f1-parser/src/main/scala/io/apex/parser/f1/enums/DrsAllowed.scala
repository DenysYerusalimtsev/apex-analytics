package io.apex.parser.f1.enums

enum DrsAllowed(val value: Int) {
  case UNKNOWN extends DrsAllowed(-1)
  case NOT_ALLOWED extends DrsAllowed(0)
  case ALLOWED extends DrsAllowed(1)
}

object DrsAllowed:
  def valueOf(value: Int): Option[DrsAllowed] =
    DrsAllowed.values.find(_.value == value)
