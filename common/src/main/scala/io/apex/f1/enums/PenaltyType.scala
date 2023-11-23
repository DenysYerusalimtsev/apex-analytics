package io.apex.f1.enums

enum PenaltyType(val value: Int) {
  case DRIVE_THROUGH extends PenaltyType(0)
  case STOP_GO extends PenaltyType(1)
  case GRID_PENALTY extends PenaltyType(2)
  case PENALTY_REMINDER extends PenaltyType(3)
  case TIME_PENALTY extends PenaltyType(4)
  case WARNING extends PenaltyType(5)
  case DISQUALIFIED extends PenaltyType(6)
  case REMOVED_FROM_FORMATION_LAP extends PenaltyType(7)
  case PARKED_TOO_LONG_TIMER extends PenaltyType(8)
  case TYRE_REGULATIONS extends PenaltyType(9)
  case THIS_LAP_INVALIDATED extends PenaltyType(10)
  case THIS_AND_NEXT_LAP_INVALIDATED extends PenaltyType(11)
  case THIS_LAP_INVALIDATED_WITHOUT_REASON extends PenaltyType(12)
  case THIS_AND_NEXT_LAP_INVALIDATED_WITHOUT_REASON extends PenaltyType(13)
  case THIS_AND_PREVIOUS_LAP_INVALIDATED extends PenaltyType(14)
  case THIS_AND_PREVIOUS_LAP_INVALIDATED_WITHOUT_REASON extends PenaltyType(15)
  case RETIRED extends PenaltyType(16)
  case BLACK_FLAG_TIMER extends PenaltyType(17)
}

object PenaltyType {
  def valueOf(value: Int): Option[PenaltyType] =
    PenaltyType.values.find(_.value == value)
}