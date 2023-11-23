package io.apex.f1.enums

enum ResultStatus(val value: Int) {
  case INVALID extends ResultStatus(0)
  case INACTIVE extends ResultStatus(1)
  case ACTIVE extends ResultStatus(2)
  case FINISHED extends ResultStatus(3)
  case DISQUALIFIED extends ResultStatus(4)
  case NOT_CLASSIFIED extends ResultStatus(5)
  case RETIRED extends ResultStatus(6)
}

object ResultStatus {
  def valueOf(value: Int): Option[ResultStatus] =
    ResultStatus.values.find(_.value == value)
}