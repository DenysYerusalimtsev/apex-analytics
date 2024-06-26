package io.apex.codecs.f1.data

import io.apex.codecs.f1.enums.*
import io.apex.f1.data.Penalty
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PenaltyCodec {
  val codec: Codec[Penalty] = (
    ("penaltyType" | PenaltyTypeCodec.codec) ::
      ("infringementType" | InfringementTypeCodec.codec) ::
      ("vehicleIdx" | uint8) ::
      ("otherVehicleIdx" | uint8) ::
      ("time" | uint8) ::
      ("lapNum" | uint8) ::
      ("placesGained" | uint8)
  ).as[Penalty]
}
