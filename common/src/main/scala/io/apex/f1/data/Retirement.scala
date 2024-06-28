package io.apex.f1.data

case class Retirement(vehicleIdx: Int) {
//  def fill(buffer: ByteBuf): Retirement = {
//    val vehicleIdx = buffer.readUnsignedByte()
//    Retirement(vehicleIdx)
//  }
//
//  def fillBuffer(retirement: Retirement, buffer: ByteBuf): ByteBuf = {
//    buffer.writeByte(retirement.vehicleIdx)
//  }

  override def toString: String = {
    s"Retirement[vehicleIdx=$vehicleIdx]"
  }
}
