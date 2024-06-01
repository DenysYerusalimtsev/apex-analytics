package io.apex.f1.data

import io.apex.f1.enums.*

case class Penalty(
    penaltyType: PenaltyType,
    infringementType: InfringementType,
    vehicleIdx: Short,
    otherVehicleIdx: Short,
    time: Short,
    lapNum: Short,
    placesGained: Short) {
//  def fill(buffer: ByteBuf): Penalty = {
//    val penaltyType = PenaltyType.valueOf(buffer.readUnsignedByte())
//    val infringementType = InfringementType.valueOf(buffer.readUnsignedByte())
//    val vehicleIdx = buffer.readUnsignedByte()
//    val otherVehicleIdx = buffer.readUnsignedByte()
//    val time = buffer.readUnsignedByte()
//    val lapNum = buffer.readUnsignedByte()
//    val placesGained = buffer.readUnsignedByte()
//
//    Penalty(penaltyType, infringementType, vehicleIdx, otherVehicleIdx, time, lapNum, placesGained)
//  }
//
//  def fillBuffer(penalty: Penalty, buffer: ByteBuf): ByteBuf = {
//    buffer
//      .writeByte(penalty.penaltyType.getValue)
//      .writeByte(penalty.infringementType.getValue)
//      .writeByte(penalty.vehicleIdx)
//      .writeByte(penalty.otherVehicleIdx)
//      .writeByte(penalty.time)
//      .writeByte(penalty.lapNum)
//      .writeByte(penalty.placesGained)
//  }

  override def toString: String = {
    s"Penalty[penaltyType=$penaltyType,infringementType=$infringementType," +
    s"vehicleIdx=$vehicleIdx,otherVehicleIdx=$otherVehicleIdx,time=$time," +
    s"lapNum=$lapNum,placesGained=$placesGained]"
  }
}
