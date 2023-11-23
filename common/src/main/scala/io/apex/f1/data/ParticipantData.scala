package io.apex.f1.data

import io.apex.f1.enums._


case class ParticipantData(
                            aiControlled: Short,
                            driverId: Driver,
                            teamId: Team,
                            raceNumber: Short,
                            nationality: Nationality,
                            name: String,
                            yourTelemetry: Short
                          ) {
  val SIZE: Int = 54
  val NAME_LENGTH: Int = 48

//  def fill(buffer: ByteBuf): ParticipantData = {
//    val aiControlled = buffer.readUnsignedByte()
//    val driverId = Driver.vaslueOf(PacketConfig.getSeason(), buffer.readUnsignedByte())
//    val teamId = Team.valueOf(PacketConfig.getSeason(), buffer.readUnsignedByte())
//    val raceNumber = buffer.readUnsignedByte()
//    val nationality = Nationality.valueOf(buffer.readUnsignedByte())
//    val name = PacketUtils.readString(buffer, NAME_LENGTH)
//    val yourTelemetry = buffer.readUnsignedByte()
//
//    ParticipantData(aiControlled, driverId, teamId, raceNumber, nationality, name, yourTelemetry)
//  }
//
//  def fillBuffer(participantData: ParticipantData, buffer: ByteBuf): ByteBuf = {
//    buffer
//      .writeByte(participantData.aiControlled)
//      .writeByte(participantData.driverId.getValue)
//      .writeByte(participantData.teamId.getValue)
//      .writeByte(participantData.raceNumber)
//      .writeByte(participantData.nationality.getValue)
//      .writeBytes(PacketUtils.writeString(participantData.name, NAME_LENGTH))
//      .writeByte(participantData.yourTelemetry)
//  }

  override def toString: String = {
    s"ParticipantData[aiControlled=$aiControlled,driverId=$driverId,teamId=$teamId," +
      s"raceNumber=$raceNumber,nationality=$nationality,name=$name,yourTelemetry=$yourTelemetry]"
  }
}
