package io.apex.f1.data

import io.netty.buffer.ByteBuf

case class Retirement(vehicleIdx: Short) {
  def fill(buffer: ByteBuf): Retirement = {
    val vehicleIdx = buffer.readUnsignedByte()
    Retirement(vehicleIdx)
  }

  def fillBuffer(retirement: Retirement, buffer: ByteBuf): ByteBuf = {
    buffer.writeByte(retirement.vehicleIdx)
  }

  override def toString: String = {
    s"Retirement[vehicleIdx=$vehicleIdx]"
  }
}
