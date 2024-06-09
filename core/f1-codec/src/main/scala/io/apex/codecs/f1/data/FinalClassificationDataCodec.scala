package io.apex.codecs.f1.data

import io.apex.f1.data.FinalClassificationData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object FinalClassificationDataCodec {
  val codec: Codec[FinalClassificationData] = {
    ("position" | uint8) ::
    ("numLaps" | uint8) ::
    ("gridPosition" | uint8) ::
    ("points" | uint8) ::
    ("numPitStops" | uint8) ::
    ("resultStatus" | uint8) ::
    ("bestLapTimeInMS" | uint32) ::
    ("totalRaceTime" | double) ::
    ("penaltiesTime" | uint8) ::
    ("numPenalties" | uint8) ::
    ("numTyreStints" | uint8) ::
    ("tyreStintsActual" | vectorOfN(provide(8), uint8)) ::
    ("tyreStintsVisual" | vectorOfN(provide(8), uint8)) ::
    ("tyreStintsEndLaps" | vectorOfN(provide(8), uint8))
  }.as[FinalClassificationData]
}
