package io.apex.f1.data

case class TyreStintHistoryData(
    endLap: Int,
    tyreActualCompound: Int,
    tyreVisualCompound: Int) {

  override def toString: String = {
    s"TyreStintHistoryData[endLap=$endLap, tyreActualCompound=$tyreActualCompound, " +
    s"tyreVisualCompound=$tyreVisualCompound]"
  }
}

object TyreStintHistoryData extends F1Data {

  override def size: Int = 3
}
