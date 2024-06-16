package io.apex.codecs.f1.enums

import io.apex.f1.enums.PenaltyType
import io.apex.f1.enums.PenaltyType.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PenaltyTypeCodec {

  val codec: Codec[PenaltyType] = mappedEnum(
    int8,
    DRIVE_THROUGH -> 0,
    STOP_GO -> 1,
    GRID_PENALTY -> 2,
    PENALTY_REMINDER -> 3,
    TIME_PENALTY -> 4,
    WARNING -> 5,
    DISQUALIFIED -> 6,
    REMOVED_FROM_FORMATION_LAP -> 7,
    PARKED_TOO_LONG_TIMER -> 8,
    TYRE_REGULATIONS -> 9,
    THIS_LAP_INVALIDATED -> 10,
    THIS_AND_NEXT_LAP_INVALIDATED -> 11,
    THIS_LAP_INVALIDATED_WITHOUT_REASON -> 12,
    THIS_AND_NEXT_LAP_INVALIDATED_WITHOUT_REASON -> 13,
    THIS_AND_PREVIOUS_LAP_INVALIDATED -> 14,
    THIS_AND_PREVIOUS_LAP_INVALIDATED_WITHOUT_REASON -> 15,
    RETIRED -> 16,
    BLACK_FLAG_TIMER -> 17)
}
