package io.apex.codecs.f1.data

import io.apex.codecs.f1.packets.PacketHeaderCodec
import io.apex.f1.data.EventDataDetails
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object EventDataDetailsCodec {
  val codec: Codec[EventDataDetails] = (
    ("header" | PacketHeaderCodec.codec) ::
      ("fastestLap" | FastestLapCodec.codec) ::
      ("retirement" | RetirementCodec.codec) ::
      ("teamMateInPits" | TeamMateInPitsCodec.codec) ::
      ("raceWinner" | RaceWinnerCodec.codec) ::
      ("penalty" | PenaltyCodec.codec) ::
      ("speedTrap" | SpeedTrapCodec.codec)
  ).as[EventDataDetails]
}
