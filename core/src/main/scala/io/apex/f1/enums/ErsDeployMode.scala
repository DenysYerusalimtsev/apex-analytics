package io.apex.f1.enums

enum ErsDeployMode(val value: Int) {
  case NONE extends ErsDeployMode(0)
  case MEDIUM extends ErsDeployMode(1)
  case OVERTAKE extends ErsDeployMode(2)
  case HOTLAP extends ErsDeployMode(3)
}

object ErsDeployMode {
  def valueOf(value: Int): Option[ErsDeployMode] =
    ErsDeployMode.values.find(_.value == value)
}