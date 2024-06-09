package io.apex.f1.enums

enum EventCode(val value: String) {
  case SessionStarted extends EventCode("SSTA")
  case SessionEnded extends EventCode("SEND")
  case FastestLap extends EventCode("FTLP")
  case Retirement extends EventCode("RTMT")
  case DrsEnabled extends EventCode("DRSE")
  case DrsDisabled extends EventCode("DRSD")
  case TeamMateInPits extends EventCode("TMPT")
  case ChequeredFlag extends EventCode("CHQF")
  case RaceWinner extends EventCode("RCWN")
  case PenaltyIssued extends EventCode("PENA")
  case SpeedTrapTriggered extends EventCode("SPTP")
}
