package io.apex.f1.packets

import io.apex.f1.PacketConstants
import io.apex.f1.data.*

/** Car Status Packet
  *
  * This packet details car statuses for all the cars in the race. It includes
  * values such as the damage readings on the car.
  * Frequency: Rate as specified in menus
  */
case class F1PacketCarStatusData$(
    header: F1PacketHeader$,
    carStatusData: List[CarStatusData]) {

  // 1344

  override def toString: String = {
    val carStatusDataString = carStatusData.map(_.toString).mkString(",")
    s"CarStatus[$header, carStatusData=[$carStatusDataString]]"
  }

  //  def fill(buffer: ByteBuf): PacketCarStatusData = {
  //    val filledHeader = header.fill(buffer)
  //    val filledCarStatusData = ListBuffer[CarStatusData]()
  //    for (_ <- 0 until PacketConstants.CARS) {
  //      filledCarStatusData += CarStatusData().fill(buffer)
  //    }
  //    PacketCarStatusData(filledHeader, filledCarStatusData.toList)
  //  }
  //
  //  def fillBuffer(buffer: ByteBuf): ByteBuf = {
  //    header.fillBuffer(buffer)
  //    carStatusData.foreach(_.fillBuffer(buffer))
  //    buffer
  //  }
}

object F1PacketCarStatusData$ extends F1Packet {
  override def size: Int = F1PacketHeader$.size + CarSetupData.size * PacketConstants.CARS;

}
