package io.apex.f1.packets

import io.netty.buffer.ByteBuf

/**
 * Base class for all packets
 */
trait Packet {

  var header: PacketHeader = new PacketHeader()

  def size: Int

  def fill(buffer: ByteBuf): Packet = {
    this.header.fill(buffer)
    this
  }

  def fillBuffer(buffer: ByteBuf): ByteBuf = this.header.fillBuffer(buffer)

  override def toString: String = this.header.toString
}

