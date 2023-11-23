package io.apex.f1.data

case class FastestLap(vehicleIdx: Short, lapTime: Float) {
  override def toString: String = s"FastestLap[vehicleIdx=$vehicleIdx, lapTime=$lapTime]"
}