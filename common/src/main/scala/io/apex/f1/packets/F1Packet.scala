package io.apex.f1.packets

trait F1Packet {
  @inline def size: Int
}

//  var header: PacketHeader = new PacketHeader()
//
//
//  def fill(buffer: ByteBuf): Packet = {
//    this.header.fill(buffer)
//    this
//  }
//
//  def fillBuffer(buffer: ByteBuf): ByteBuf = this.header.fillBuffer(buffer)
//
//  override def toString: String = this.header.toString


