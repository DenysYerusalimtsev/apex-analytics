package io.apex.codecs.f1.enums

import io.apex.f1.enums.EventCode
import io.apex.f1.enums.EventCode.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object EventCodeCodec {
  val codec: Codec[EventCode] = mappedEnum(
    fixedSizeBytes(4, ascii),
    SessionStarted -> "SSTA",
    SessionEnded -> "SEND",
    FastestLap -> "FTLP",
    Retirement -> "RTMT",
    DrsEnabled -> "DRSE",
    DrsDisabled -> "DRSD",
    TeamMateInPits -> "TMPT",
    ChequeredFlag -> "CHQF",
    RaceWinner -> "RCWN",
    PenaltyIssued -> "PENA",
    SpeedTrapTriggered -> "SPTP"
  )
}