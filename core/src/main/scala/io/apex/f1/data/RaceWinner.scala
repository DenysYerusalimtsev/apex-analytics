package io.apex.f1.data

import io.netty.buffer.ByteBuf

case class RaceWinner(vehicleIdx: Short) {
  def fill(buffer: ByteBuf): RaceWinner = {
    val vehicleIdx = buffer.readUnsignedByte()
    RaceWinner(vehicleIdx)
  }

  def fillBuffer(raceWinner: RaceWinner, buffer: ByteBuf): ByteBuf = {
    buffer.writeByte(raceWinner.vehicleIdx)
  }

  override def toString: String = {
    s"RaceWinner[vehicleIdx=$vehicleIdx]"
  }
}
