package io.apex.f1.packets

import io.apex.f1.data.CarDamageData

case class PacketCarDamageData(
    header: PacketHeader,
    carDamageData: Vector[CarDamageData]) {

  override def toString: String = {
    val carDamageDataString = carDamageData.map(_.toString).mkString(", ")
    s"PacketCarDamageData[header=${header.toString}, carDamageData=[$carDamageDataString]]"
  }
}

object PacketCarDamageData extends F1Packet {
  // 948
  override def size: Int = PacketHeader.size + 22 * CarDamageData.size
}
