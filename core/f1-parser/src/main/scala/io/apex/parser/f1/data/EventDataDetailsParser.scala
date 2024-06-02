package io.apex.parser.f1.data

import io.apex.f1.data.EventDataDetails
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object EventDataDetailsParser {
  val codec: Codec[EventDataDetails] = {
    ("header" | PacketHeaderCodec.codec) ::
    ("fastestLap" | FastestLapParser.codec) ::
    ("retirement" | RetirementParser.codec) ::
    ("teamMateInPits" | TeamMateInPitsParser.codec) ::
    ("raceWinner" | RaceWinnerParser.codec) ::
    ("penalty" | PenaltyParser.codec) ::
    ("speedTrap" | SpeedTrapParser.codec)
  }.as[EventDataDetails]
}
