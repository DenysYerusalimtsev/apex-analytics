package io.apex.f1.data

import io.netty.buffer.ByteBuf

case class TeamMateInPits(vehicleIdx: Short) {
  def fill(buffer: ByteBuf): TeamMateInPits = {
    val vehicleIdx = buffer.readUnsignedByte()
    TeamMateInPits(vehicleIdx)
  }

  def fillBuffer(teamMateInPits: TeamMateInPits, buffer: ByteBuf): ByteBuf = {
    buffer.writeByte(teamMateInPits.vehicleIdx)
  }

  override def toString: String = {
    s"TeamMateInPits[vehicleIdx=$vehicleIdx]"
  }
}
