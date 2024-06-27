package io.apex.f1.data

import io.apex.f1.enums.*

  case class CarTelemetryData(
    speed: Int,
    throttle: Float,
    steer: Float,
    brake: Float,
    clutch: Short,
    gear: Short,
    engineRPM: Int,
    drs: Short,
    revLightsPercent: Short,
    brakesTemperature: List[Int],
    tyresSurfaceTemperature: List[Short],
    tyresInnerTemperature: Array[Short],
    engineTemperature: Int,
    tyresPressure: List[Float],
    surfaceType: List[SurfaceType]) {
  //  def fillBuffer(buffer: ByteBuf): ByteBuf = {
  //    buffer.writeShortLE(speed)
  //    buffer.writeFloatLE(throttle)
  //    buffer.writeFloatLE(steer)
  //    buffer.writeFloatLE(brake)
  //    buffer.writeByte(clutch)
  //    buffer.writeByte(gear)
  //    buffer.writeShortLE(engineRPM)
  //    buffer.writeByte(drs)
  //    buffer.writeByte(revLightsPercent)
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      buffer.writeShortLE(brakesTemperature(j))
  //    }
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      buffer.writeByte(tyresSurfaceTemperature(j))
  //    }
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      buffer.writeByte(tyresInnerTemperature(j))
  //    }
  //    buffer.writeShortLE(engineTemperature)
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      buffer.writeFloatLE(tyresPressure(j))
  //    }
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      buffer.writeByte(surfaceType(j).getValue)
  //    }
  //    buffer
  //  }

  override def toString: String = {
    "CarTelemetryData[speed=" + speed +
    ",throttle=" + throttle +
    ",steer=" + steer +
    ",brake=" + brake +
    ",clutch=" + clutch +
    ",gear=" + gear +
    ",engineRPM=" + engineRPM +
    ",drs=" + drs +
    ",revLightsPercent=" + revLightsPercent +
    ",brakesTemperature=" + brakesTemperature.mkString(", ") +
    ",tyresSurfaceTemperature=" + tyresSurfaceTemperature.mkString(", ") +
    ",tyresInnerTemperature=" + tyresInnerTemperature.mkString(", ") +
    ",engineTemperature=" + engineTemperature +
    ",tyresPressure=" + tyresPressure.mkString(", ") +
    ",surfaceType=" + surfaceType.mkString(",") +
    "]"
  }
}

object CarTelemetryData extends F1Data {
  override def size: Int = 58
}
