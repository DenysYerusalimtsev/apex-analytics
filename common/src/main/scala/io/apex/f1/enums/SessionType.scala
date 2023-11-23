package io.apex.f1.enums

enum SessionType(val value: Int) {
  case UNKNOWN extends SessionType(0)
  case P1 extends SessionType(1)
  case P2 extends SessionType(2)
  case P3 extends SessionType(3)
  case SHORT_P extends SessionType(4)
  case Q1 extends SessionType(5)
  case Q2 extends SessionType(6)
  case Q3 extends SessionType(7)
  case SHORT_Q extends SessionType(8)
  case OSQ extends SessionType(9)
  case R extends SessionType(10)
  case R2 extends SessionType(11)
  case TIME_TRIAL extends SessionType(12)
}

object SessionType {
  def valueOf(value: Int): Option[SessionType] =
    SessionType.values.find(_.value == value)
}

