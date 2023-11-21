package io.apex.f1.data

case class EventDataDetails(
                             fastestLap: FastestLap,
                             retirement: Retirement,
                             teamMateInPits: TeamMateInPits,
                             raceWinner: RaceWinner,
                             penalty: Penalty,
                             speedTrap: SpeedTrap
                           ) {
  override def toString: String = {
    s"EventDataDetails[fastestLap=$fastestLap, retirement=$retirement, teamMateInPits=$teamMateInPits, raceWinner=$raceWinner, penalty=$penalty, speedTrap=$speedTrap]"
  }
}
