package io.apex.f1.data

import io.netty.buffer.ByteBuf
import io.ppatierno.formula1.PacketConfig
import io.ppatierno.formula1.PacketUtils
import io.ppatierno.formula1.enums.{Nationality, ReadyStatus, Team}

case class LobbyInfoData(
                          aiControlled: Short,
                          teamId: Team,
                          nationality: Nationality,
                          name: String,
                          readyStatus: ReadyStatus
                        ) {
  val SIZE: Int = 52
  val NAME_LENGTH: Int = 48

  def fill(buffer: ByteBuf): LobbyInfoData = {
    val aiControlled = buffer.readUnsignedByte()
    val teamId = Team.valueOf(PacketConfig.getSeason, buffer.readUnsignedByte())
    val nationality = Nationality.valueOf(buffer.readUnsignedByte())
    val name = PacketUtils.readString(buffer, LobbyInfoData.NAME_LENGTH)
    val readyStatus = ReadyStatus.valueOf(buffer.readUnsignedByte())

    LobbyInfoData(aiControlled, teamId, nationality, name, readyStatus)
  }

  def fillBuffer(lobbyInfoData: LobbyInfoData, buffer: ByteBuf): ByteBuf = {
    buffer
      .writeByte(lobbyInfoData.aiControlled)
      .writeByte(lobbyInfoData.teamId.getValue)
      .writeByte(lobbyInfoData.nationality.getValue)
      .writeBytes(PacketUtils.writeString(lobbyInfoData.name, LobbyInfoData.NAME_LENGTH))
      .writeByte(lobbyInfoData.readyStatus.getValue)
  }
}
