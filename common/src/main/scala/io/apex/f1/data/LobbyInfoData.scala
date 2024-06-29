package io.apex.f1.data

import io.apex.f1.enums.*

case class LobbyInfoData(
    aiControlled: Int,
    teamId: Team,
    nationality: Nationality,
    name: String,
    carNumber: Int,
    readyStatus: ReadyStatus) {

  //  def fill(buffer: ByteBuf): LobbyInfoData = {
  //    val aiControlled = buffer.readUnsignedByte()
  //    val teamId = Team.valueOf(PacketConfig.getSeason, buffer.readUnsignedByte())
  //    val nationality = Nationality.valueOf(buffer.readUnsignedByte())
  //    val name = PacketUtils.readString(buffer, LobbyInfoData.NAME_LENGTH)
  //    val readyStatus = ReadyStatus.valueOf(buffer.readUnsignedByte())
  //
  //    LobbyInfoData(aiControlled, teamId, nationality, name, readyStatus)
  //  }
  //
  //  def fillBuffer(lobbyInfoData: LobbyInfoData, buffer: ByteBuf): ByteBuf = {
  //    buffer
  //      .writeByte(lobbyInfoData.aiControlled)
  //      .writeByte(lobbyInfoData.teamId.getValue)
  //      .writeByte(lobbyInfoData.nationality.getValue)
  //      .writeBytes(PacketUtils.writeString(lobbyInfoData.name, LobbyInfoData.NAME_LENGTH))
  //      .writeByte(lobbyInfoData.readyStatus.getValue)
  //  }
}

object LobbyInfoData extends F1Data {
  override def size: Int = 52

  def nameLength: Int = 48
}
