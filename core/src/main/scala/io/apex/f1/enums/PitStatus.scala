package io.apex.f1.enums

enum PitStatus(val value: Int) {
  case NONE extends PitStatus(0)
  case PITTING extends PitStatus(1)
  case IN_PIT_AREA extends PitStatus(2)
}

object PitStatus {
  def valueOf(value: Int): Option[PitStatus] =
    PitStatus.values.find(_.value == value)
}