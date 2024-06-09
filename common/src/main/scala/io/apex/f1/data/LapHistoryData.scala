package io.apex.f1.data

case class LapHistoryData(
    lapTimeInMS: Long,
    sector1TimeInMS: Int,
    sector2TimeInMS: Int,
    sector3TimeInMS: Int,
    lapValidBitFlags: Int) {

  override def toString: String = {
    s"LapHistoryData[lapTimeInMS=$lapTimeInMS, sector1TimeInMS=$sector1TimeInMS, " +
    s"sector2TimeInMS=$sector2TimeInMS, sector3TimeInMS=$sector3TimeInMS, " +
    s"lapValidBitFlags=$lapValidBitFlags]"
  }
}

object LapHistoryData extends F1Data {
  override def size: Int = 11
}
