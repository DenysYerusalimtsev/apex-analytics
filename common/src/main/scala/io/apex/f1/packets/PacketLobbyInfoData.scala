package io.apex.f1.packets

import io.apex.f1.PacketConstants
import io.apex.f1.data.*

/** Lobby Info Packet
  *
  * This packet details the players currently in a multiplayer lobby. It details
  * each player’s selected car, any AI involved in the game and also the ready
  * status of each of the participants.
  * Frequency: Two every second when in the lobby
  */
case class PacketLobbyInfoData(
    header: PacketHeader,
    numPlayers: Int,
    lobbyInfoData: List[LobbyInfoData]) {

  override def toString: String = {
    s"LobbyInfo[$header,numPlayers=$numPlayers,lobbyInfoData=${lobbyInfoData.mkString(",")}]"
  }
}
//  def fill(buffer: ByteBuf): PacketLobbyInfoData = {
//    val filledHeader = PacketHeader().fill(buffer)
//    val filledNumPlayers = buffer.readUnsignedByte()
//    val filledLobbyInfoData = List.fill(filledNumPlayers)(LobbyInfoData().fill(buffer))
//    PacketLobbyInfoData(filledHeader, filledNumPlayers, filledLobbyInfoData)
//  }
//
//  def fillBuffer(packet: PacketLobbyInfoData, buffer: ByteBuf): ByteBuf = {
//    packet.header.fillBuffer(buffer)
//    buffer.writeByte(packet.numPlayers)
//    packet.lobbyInfoData.foreach(_.fillBuffer(buffer))
//    buffer
//  }

object PacketLobbyInfoData extends F1Packet {
  // 1169
  override def size: Int =
    PacketHeader.size + 1 + LobbyInfoData.size * PacketConstants.LobbyPlayers
}
