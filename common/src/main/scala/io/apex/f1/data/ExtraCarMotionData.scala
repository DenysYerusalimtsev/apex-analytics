package io.apex.f1.data

case class ExtraCarMotionData(
                               suspensionPosition: Array[Float],
                               suspensionVelocity: Array[Float],
                               suspensionAcceleration: Array[Float],
                               wheelSpeed: Array[Float],
                               wheelSlip: Array[Float],
                               localVelocityX: Float,
                               localVelocityY: Float,
                               localVelocityZ: Float,
                               angularVelocityX: Float,
                               angularVelocityY: Float,
                               angularVelocityZ: Float,
                               angularAccelerationX: Float,
                               angularAccelerationY: Float,
                               angularAccelerationZ: Float,
                               frontWheelsAngle: Float
                             ) {
  override def toString: String = {
    s"ExtraCarMotionData[suspensionPosition=${suspensionPosition.mkString("[", ", ", "]")}, " +
      s"suspensionVelocity=${suspensionVelocity.mkString("[", ", ", "]")}, " +
      s"suspensionAcceleration=${suspensionAcceleration.mkString("[", ", ", "]")}, " +
      s"wheelSpeed=${wheelSpeed.mkString("[", ", ", "]")}, " +
      s"wheelSlip=${wheelSlip.mkString("[", ", ", "]")}, " +
      s"localVelocityX=$localVelocityX, " +
      s"localVelocityY=$localVelocityY, " +
      s"localVelocityZ=$localVelocityZ, " +
      s"angularVelocityX=$angularVelocityX, " +
      s"angularVelocityY=$angularVelocityY, " +
      s"angularVelocityZ=$angularVelocityZ, " +
      s"angularAccelerationX=$angularAccelerationX, " +
      s"angularAccelerationY=$angularAccelerationY, " +
      s"angularAccelerationZ=$angularAccelerationZ, " +
      s"frontWheelsAngle=$frontWheelsAngle]"
  }
}

object ExtraCarMotionData extends F1Data {
  override def size: Int = 120
}
