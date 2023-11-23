package io.apex.f1.data

import io.netty.buffer.ByteBuf

case class SpeedTrap(vehicleIdx: Short, speed: Float) {
  def fill(buffer: ByteBuf): SpeedTrap = {
    val vehicleIdx = buffer.readUnsignedByte()
    val speed = buffer.readFloatLE()
    SpeedTrap(vehicleIdx, speed)
  }

  def fillBuffer(speedTrap: SpeedTrap, buffer: ByteBuf): ByteBuf = {
    buffer.writeByte(speedTrap.vehicleIdx)
    buffer.writeFloatLE(speedTrap.speed)
  }

  override def toString: String = {
    s"SpeedTrap[vehicleIdx=$vehicleIdx, speed=$speed]"
  }
}
