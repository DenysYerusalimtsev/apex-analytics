package io.apex.parser.f1.enums

enum ReadyStatus(val value: Int) {
  case NOT_READY extends ReadyStatus(0)
  case READY extends ReadyStatus(1)
  case SPECTATING extends ReadyStatus(2)
}

object ReadyStatus {
  def valueOf(value: Int): Option[ReadyStatus] =
    ReadyStatus.values.find(_.value == value)
}