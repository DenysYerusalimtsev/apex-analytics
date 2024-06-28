package io.apex.f1.data

case class SpeedTrap(
    vehicleIdx: Int,
    speed: Float,
    isOverallFastestInSession: Int,
    isDriverFastestInSession: Int,
    fastestVehicleIdxInSession: Int,
    fastestSpeedInSession: Float) {
//  def fill(buffer: ByteBuf): SpeedTrap = {
//    val vehicleIdx = buffer.readUnsignedByte()
//    val speed = buffer.readFloatLE()
//    SpeedTrap(vehicleIdx, speed)
//  }
//
//  def fillBuffer(speedTrap: SpeedTrap, buffer: ByteBuf): ByteBuf = {
//    buffer.writeByte(speedTrap.vehicleIdx)
//    buffer.writeFloatLE(speedTrap.speed)
//  }

  override def toString: String = {
    s"SpeedTrapData[vehicleIdx=$vehicleIdx, speed=$speed, isOverallFastestInSession=$isOverallFastestInSession, " +
    s"isDriverFastestInSession=$isDriverFastestInSession, fastestVehicleIdxInSession=$fastestVehicleIdxInSession, fastestSpeedInSession=$fastestSpeedInSession]"
  }
}
