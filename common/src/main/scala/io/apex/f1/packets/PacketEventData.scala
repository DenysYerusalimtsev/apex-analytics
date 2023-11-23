package io.apex.f1.packets

import io.apex.f1.data.*
import io.apex.f1.enums.*

/**
 * Event Packet
 *
 * This packet gives details of events that happen during the course of a session.
 * Frequency: When the event occurs
 */
case class PacketEventData(
                            header: PacketHeader,
                            eventCode: EventCode,
                            eventDataDetails: EventDataDetails
                          ) {

  override def toString: String = {
    s"Event[$header, eventStringCode=$eventCode, eventDataDetails=$eventDataDetails]"
  }

  //  def fill(buffer: ByteBuf): PacketEventData = {
  //    val filledHeader = PacketHeader().fill(buffer)
  //    val eventCodeValue = PacketUtils.readString(buffer, 4)
  //    val filledEventCode = EventCode.valueFrom(eventCodeValue)
  //    val filledEventDataDetails = filledEventCode match {
  //      case EventCode.SESSION_STARTED =>
  //        // Handle SESSION_STARTED event
  //        new EventDataDetails()
  //      case EventCode.SESSION_ENDED =>
  //        // Handle SESSION_ENDED event
  //        new EventDataDetails()
  //      case EventCode.FASTEST_LAP =>
  //        val fastestLap = FastestLap().fill(buffer)
  //        new EventDataDetails(fastestLap)
  //      case EventCode.RETIREMENT =>
  //        val retirement = Retirement().fill(buffer)
  //        new EventDataDetails(retirement)
  //      case EventCode.DRS_ENABLED =>
  //        // Handle DRS_ENABLED event
  //        new EventDataDetails()
  //      case EventCode.DRS_DISABLED =>
  //        // Handle DRS_DISABLED event
  //        new EventDataDetails()
  //      case EventCode.TEAM_MATE_IN_PITS =>
  //        val teamMateInPits = TeamMateInPits().fill(buffer)
  //        new EventDataDetails(teamMateInPits)
  //      case EventCode.CHEQUERED_FLAG =>
  //        // Handle CHEQUERED_FLAG event
  //        new EventDataDetails()
  //      case EventCode.RACE_WINNER =>
  //        val raceWinner = RaceWinner().fill(buffer)
  //        new EventDataDetails(raceWinner)
  //      case EventCode.PENALTY_ISSUED =>
  //        val penalty = Penalty().fill(buffer)
  //        new EventDataDetails(penalty)
  //      case EventCode.SPEED_TRAP_TRIGGERED =>
  //        val speedTrap = SpeedTrap().fill(buffer)
  //        new EventDataDetails(speedTrap)
  //      case _ =>
  //        throw new IllegalArgumentException(s"EventCode=$filledEventCode not supported")
  //    }
  //    PacketEventData(filledHeader, filledEventCode, filledEventDataDetails)
  //  }
  //
  //  def fillBuffer(packet: PacketEventData, buffer: ByteBuf): ByteBuf = {
  //    packet.header.fillBuffer(buffer)
  //    PacketUtils.writeString(packet.eventCode.getValue, buffer, 4)
  //    packet.eventCode match {
  //      case EventCode.SESSION_STARTED =>
  //      // Handle SESSION_STARTED event
  //      case EventCode.SESSION_ENDED =>
  //      // Handle SESSION_ENDED event
  //      case EventCode.FASTEST_LAP =>
  //        packet.eventDataDetails.getFastestLap.fillBuffer(buffer)
  //      case EventCode.RETIREMENT =>
  //        packet.eventDataDetails.getRetirement.fillBuffer(buffer)
  //      case EventCode.DRS_ENABLED =>
  //      // Handle DRS_ENABLED event
  //      case EventCode.DRS_DISABLED =>
  //      // Handle DRS_DISABLED event
  //      case EventCode.TEAM_MATE_IN_PITS =>
  //        packet.eventDataDetails.getTeamMateInPits.fillBuffer(buffer)
  //      case EventCode.CHEQUERED_FLAG =>
  //      // Handle CHEQUERED_FLAG event
  //      case EventCode.RACE_WINNER =>
  //        packet.eventDataDetails.getRaceWinner.fillBuffer(buffer)
  //      case EventCode.PENALTY_ISSUED =>
  //        packet.eventDataDetails.getPenalty.fillBuffer(buffer)
  //      case EventCode.SPEED_TRAP_TRIGGERED =>
  //        packet.eventDataDetails.getSpeedTrap.fillBuffer(buffer)
  //      case _ =>
  //        throw new IllegalArgumentException(s"EventCode=${packet.eventCode} not supported")
  //    }
  //    buffer
  //  }
}

object PacketEventData extends Packet {
  override def size: Int = PacketHeader.size + 4 + EventDataDetails.size
}
