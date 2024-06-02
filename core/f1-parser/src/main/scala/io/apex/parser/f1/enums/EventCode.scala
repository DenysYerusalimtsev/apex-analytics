package io.apex.parser.f1.enums

enum EventCode(val value: String) {
  case SESSION_STARTED extends EventCode("SSTA")
  case SESSION_ENDED extends EventCode("SEND")
  case FASTEST_LAP extends EventCode("FTLP")
  case RETIREMENT extends EventCode("RTMT")
  case DRS_ENABLED extends EventCode("DRSE")
  case DRS_DISABLED extends EventCode("DRSD")
  case TEAM_MATE_IN_PITS extends EventCode("TMPT")
  case CHEQUERED_FLAG extends EventCode("CHQF")
  case RACE_WINNER extends EventCode("RCWN")
  case PENALTY_ISSUED extends EventCode("PENA")
  case SPEED_TRAP_TRIGGERED extends EventCode("SPTP")
}
