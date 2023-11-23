package io.apex.f1.data

case class CarSetupData(
                         frontWing: Short,
                         rearWing: Short,
                         onThrottle: Short,
                         offThrottle: Short,
                         frontCamber: Float,
                         rearCamber: Float,
                         frontToe: Float,
                         rearToe: Float,
                         frontSuspension: Short,
                         rearSuspension: Short,
                         frontAntiRollBar: Short,
                         rearAntiRollBar: Short,
                         frontSuspensionHeight: Short,
                         rearSuspensionHeight: Short,
                         brakePressure: Short,
                         brakeBias: Short,
                         rearLeftTyrePressure: Float,
                         rearRightTyrePressure: Float,
                         frontLeftTyrePressure: Float,
                         frontRightTyrePressure: Float,
                         ballast: Short,
                         fuelLoad: Float
                       ) {
  //  def fill(buffer: ByteBuf): CarSetupData =
  //    CarSetupData(
  //      frontWing = buffer.readUnsignedByte(),
  //      rearWing = buffer.readUnsignedByte(),
  //      onThrottle = buffer.readUnsignedByte(),
  //      offThrottle = buffer.readUnsignedByte(),
  //      frontCamber = buffer.readFloatLE(),
  //      rearCamber = buffer.readFloatLE(),
  //      frontToe = buffer.readFloatLE(),
  //      rearToe = buffer.readFloatLE(),
  //      frontSuspension = buffer.readUnsignedByte(),
  //      rearSuspension = buffer.readUnsignedByte(),
  //      frontAntiRollBar = buffer.readUnsignedByte(),
  //      rearAntiRollBar = buffer.readUnsignedByte(),
  //      frontSuspensionHeight = buffer.readUnsignedByte(),
  //      rearSuspensionHeight = buffer.readUnsignedByte(),
  //      brakePressure = buffer.readUnsignedByte(),
  //      brakeBias = buffer.readUnsignedByte(),
  //      rearLeftTyrePressure = buffer.readFloatLE(),
  //      rearRightTyrePressure = buffer.readFloatLE(),
  //      frontLeftTyrePressure = buffer.readFloatLE(),
  //      frontRightTyrePressure = buffer.readFloatLE(),
  //      ballast = buffer.readUnsignedByte(),
  //      fuelLoad = buffer.readFloatLE())
  //
  //  def fillBuffer(buffer: ByteBuf): ByteBuf = {
  //    buffer.writeByte(frontWing)
  //    buffer.writeByte(rearWing)
  //    buffer.writeByte(onThrottle)
  //    buffer.writeByte(offThrottle)
  //    buffer.writeFloatLE(frontCamber)
  //    buffer.writeFloatLE(rearCamber)
  //    buffer.writeFloatLE(frontToe)
  //    buffer.writeFloatLE(rearToe)
  //    buffer.writeByte(frontSuspension)
  //    buffer.writeByte(rearSuspension)
  //    buffer.writeByte(frontAntiRollBar)
  //    buffer.writeByte(rearAntiRollBar)
  //    buffer.writeByte(frontSuspensionHeight)
  //    buffer.writeByte(rearSuspensionHeight)
  //    buffer.writeByte(brakePressure)
  //    buffer.writeByte(brakeBias)
  //    buffer.writeFloatLE(rearLeftTyrePressure)
  //    buffer.writeFloatLE(rearRightTyrePressure)
  //    buffer.writeFloatLE(frontLeftTyrePressure)
  //    buffer.writeFloatLE(frontRightTyrePressure)
  //    buffer.writeByte(ballast)
  //    buffer.writeFloatLE(fuelLoad)
  //    buffer
  //  }

  override def toString: String = {
    s"CarSetupData[frontWing=$frontWing,rearWing=$rearWing,onThrottle=$onThrottle,offThrottle=$offThrottle," +
      s"frontCamber=$frontCamber,rearCamber=$rearCamber,frontToe=$frontToe,rearToe=$rearToe," +
      s"frontSuspension=$frontSuspension,rearSuspension=$rearSuspension," +
      s"frontAntiRollBar=$frontAntiRollBar,rearAntiRollBar=$rearAntiRollBar," +
      s"frontSuspensionHeight=$frontSuspensionHeight,rearSuspensionHeight=$rearSuspensionHeight," +
      s"brakePressure=$brakePressure,brakeBias=$brakeBias," +
      s"rearLeftTyrePressure=$rearLeftTyrePressure,rearRightTyrePressure=$rearRightTyrePressure," +
      s"frontLeftTyrePressure=$frontLeftTyrePressure,frontRightTyrePressure=$frontRightTyrePressure," +
      s"ballast=$ballast,fuelLoad=$fuelLoad]"
  }
}

object CarSetupData extends F1Data {
  override def size: Int = 49
}
