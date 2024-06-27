package io.apex.f1.data

case class CarMotionData(
    worldPositionX: Float,
    worldPositionY: Float,
    worldPositionZ: Float,
    worldVelocityX: Float,
    worldVelocityY: Float,
    worldVelocityZ: Float,
    worldForwardDirX: Short,
    worldForwardDirY: Short,
    worldForwardDirZ: Short,
    worldRightDirX: Short,
    worldRightDirY: Short,
    worldRightDirZ: Short,
    gForceLateral: Float,
    gForceLongitudinal: Float,
    gForceVertical: Float,
    yaw: Float,
    pitch: Float,
    roll: Float) {
  //  def fill(buffer: ByteBuf): CarMotionData =
  //    CarMotionData(
  //      worldPositionX = buffer.readFloatLE(),
  //      worldPositionY = buffer.readFloatLE(),
  //      worldPositionZ = buffer.readFloatLE(),
  //      worldVelocityX = buffer.readFloatLE(),
  //      worldVelocityY = buffer.readFloatLE(),
  //      worldVelocityZ = buffer.readFloatLE(),
  //      worldForwardDirX = PacketUtils.normalizedVectorToFloat(buffer.readShortLE()),
  //      worldForwardDirY = PacketUtils.normalizedVectorToFloat(buffer.readShortLE()),
  //      worldForwardDirZ = PacketUtils.normalizedVectorToFloat(buffer.readShortLE()),
  //      worldRightDirX = PacketUtils.normalizedVectorToFloat(buffer.readShortLE()),
  //      worldRightDirY = PacketUtils.normalizedVectorToFloat(buffer.readShortLE()),
  //      worldRightDirZ = PacketUtils.normalizedVectorToFloat(buffer.readShortLE()),
  //      gForceLateral = buffer.readFloatLE(),
  //      gForceLongitudinal = buffer.readFloatLE(),
  //      gForceVertical = buffer.readFloatLE(),
  //      yaw = buffer.readFloatLE(),
  //      pitch = buffer.readFloatLE(),
  //      roll = buffer.readFloatLE())

//  def fillBuffer(buffer: ByteBuf): ByteBuf = {
//    buffer.writeFloatLE(worldPositionX)
//    buffer.writeFloatLE(worldPositionY)
//    buffer.writeFloatLE(worldPositionZ)
//    buffer.writeFloatLE(worldVelocityX)
//    buffer.writeFloatLE(worldVelocityY)
//    buffer.writeFloatLE(worldVelocityZ)
//    buffer.writeShortLE(PacketUtils.floatToNormalizedVector(worldForwardDirX))
//    buffer.writeShortLE(PacketUtils.floatToNormalizedVector(worldForwardDirY))
//    buffer.writeShortLE(PacketUtils.floatToNormalizedVector(worldForwardDirZ))
//    buffer.writeShortLE(PacketUtils.floatToNormalizedVector(worldRightDirX))
//    buffer.writeShortLE(PacketUtils.floatToNormalizedVector(worldRightDirY))
//    buffer.writeShortLE(PacketUtils.floatToNormalizedVector(worldRightDirZ))
//    buffer.writeFloatLE(gForceLateral)
//    buffer.writeFloatLE(gForceLongitudinal)
//    buffer.writeFloatLE(gForceVertical)
//    buffer.writeFloatLE(yaw)
//    buffer.writeFloatLE(pitch)
//    buffer.writeFloatLE(roll)
//    buffer
//  }

  override def toString: String = {
    s"CarMotionData[worldPositionX=$worldPositionX,worldPositionY=$worldPositionY,worldPositionZ=$worldPositionZ," +
    s"worldVelocityX=$worldVelocityX,worldVelocityY=$worldVelocityY,worldVelocityZ=$worldVelocityZ," +
    s"worldForwardDirX=$worldForwardDirX,worldForwardDirY=$worldForwardDirY,worldForwardDirZ=$worldForwardDirZ," +
    s"worldRightDirX=$worldRightDirX,worldRightDirY=$worldRightDirY,worldRightDirZ=$worldRightDirZ," +
    s"gForceLateral=$gForceLateral,gForceLongitudinal=$gForceLongitudinal,gForceVertical=$gForceVertical," +
    s"yaw=$yaw,pitch=$pitch,roll=$roll]"
  }
}

object CarMotionData extends F1Data {
  override def size: Int = 60
}
