package io.apex.f1.data

import io.apex.f1.packets.Packet

case class EventDataDetails(
                             fastestLap: FastestLap,
                             retirement: Retirement,
                             teamMateInPits: TeamMateInPits,
                             raceWinner: RaceWinner,
                             penalty: Penalty,
                             speedTrap: SpeedTrap
                           ) {
  override def toString: String = {
    s"EventDataDetails[fastestLap=$fastestLap, " +
      s"retirement=$retirement, " +
      s"teamMateInPits=$teamMateInPits, " +
      s"raceWinner=$raceWinner, " +
      s"penalty=$penalty, " +
      s"speedTrap=$speedTrap]"
  }
}

object EventDataDetails extends Packet {
  override def size: Int = 7
}