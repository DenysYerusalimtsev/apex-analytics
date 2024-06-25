package io.apex.codecs.f1.data

import io.apex.codecs.f1.enums.*
import io.apex.f1.data.CarStatusData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object CarStatusDataCodec {
  val codec: Codec[CarStatusData] = (
    ("tractionControl" | uint8) ::
      ("antiLockBrakes" | uint8) ::
      ("fuelMix" | FuelMixCodec.codec) ::
      ("frontBrakeBias" | uint8) ::
      ("pitLimiterStatus" | uint8) ::
      ("fuelInTank" | float) ::
      ("fuelCapacity" | float) ::
      ("fuelRemainingLaps" | float) ::
      ("maxRPM" | uint16) ::
      ("idleRPM" | uint16) ::
      ("maxGears" | uint8) ::
      ("drsAllowed" | DrsAllowedCodec.codec) ::
      ("drsActivationDistance" | uint16) ::
      ("actualTyreCompound" | ActualTyreCompoundCodec.codec) ::
      ("visualTyreCompound" | VisualTyreCompoundCodec.codec) ::
      ("tyresAgeLaps" | uint8) ::
      ("vehicleFiaFlags" | VehicleFiaFlagCodec.codec) ::
      ("ersStoreEnergy" | float) ::
      ("ersDeployMode" | ErsDeployModeCodec.codec) ::
      ("ersHarvestedThisLapMGUK" | float) ::
      ("ersHarvestedThisLapMGUH" | float) ::
      ("ersDeployedThisLap" | float) ::
      ("networkPaused" | uint8)
  ).as[CarStatusData]
}
