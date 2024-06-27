package io.apex.f1.data

import io.apex.f1.enums.*

import java.util.Arrays

case class CarStatusData(
    tractionControl: TractionControl,
    antiLockBrakes: Int,
    fuelMix: FuelMix,
    frontBrakeBias: Int,
    pitLimiterStatus: Int,
    fuelInTank: Float,
    fuelCapacity: Float,
    fuelRemainingLaps: Float,
    maxRPM: Int,
    idleRPM: Int,
    maxGears: Int,
    drsAllowed: DrsAllowed,
    drsActivationDistance: Int,
//    tyresWear: List[Int],
    actualTyreCompound: ActualTyreCompound,
    visualTyreCompound: VisualTyreCompound,
    tyresAgeLaps: Int,
//    tyresDamage: List[Int],
//    frontLeftWingDamage: Int,
//    frontRightWingDamage: Int,
//    rearWingDamage: Int,
//    drsFault: Int,
//    engineDamage: Int,
//    gearBoxDamage: Int,
    vehicleFiaFlags: VehicleFiaFlag,
    ersStoreEnergy: Float,
    ersDeployMode: ErsDeployMode,
    ersHarvestedThisLapMGUK: Float,
    ersHarvestedThisLapMGUH: Float,
    ersDeployedThisLap: Float,
    networkPaused: Int) {

  //  def fill(buffer: ByteBuf): CarStatusData = {
  //    CarStatusData(
  //      tractionControl = TractionControl.valueOf(buffer.readUnsignedByte()),
  //      antiLockBrakes = buffer.readUnsignedByte(),
  //      fuelMix = FuelMix.valueOf(buffer.readUnsignedByte()),
  //      frontBrakeBias = buffer.readUnsignedByte(),
  //      pitLimiterStatus = buffer.readUnsignedByte(),
  //      fuelInTank = buffer.readFloatLE(),
  //      fuelCapacity = buffer.readFloatLE(),
  //      fuelRemainingLaps = buffer.readFloatLE(),
  //      maxRPM = buffer.readUnsignedIntLE(),
  //      idleRPM = buffer.readUnsignedIntLE(),
  //      maxGears = buffer.readUnsignedByte(),
  //      drsAllowed = DrsAllowed.valueOf(buffer.readUnsignedByte()),
  //      drsActivationDistance = buffer.readUnsignedIntLE()
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      tyresWear(j) = buffer.readUnsignedByte()
  //    }
  //    ,
  //    actualTyreCompound = ActualTyreCompound.valueOf(buffer.readUnsignedByte())
  //    ,
  //    visualTyreCompound = VisualTyreCompound.valueOf(buffer.readUnsignedByte())
  //    ,
  //    tyresAgeLaps = buffer.readUnsignedByte()
  //    ,
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      tyresDamage(j) = buffer.readUnsignedByte()
  //    }
  //    ,
  //    frontLeftWingDamage = buffer.readUnsignedByte()
  //    ,
  //    frontRightWingDamage = buffer.readUnsignedByte()
  //    ,
  //    rearWingDamage = buffer.readUnsignedByte()
  //    ,
  //    drsFault = buffer.readUnsignedByte()
  //    ,
  //    engineDamage = buffer.readUnsignedByte()
  //    ,
  //    gearBoxDamage = buffer.readUnsignedByte()
  //    ,
  //    vehicleFiaFlags = VehicleFiaFlag.valueOf(buffer.readByte())
  //    ,
  //    ersStoreEnergy = buffer.readFloatLE()
  //    ,
  //    ersDeployMode = ErsDeployMode.valueOf(buffer.readUnsignedByte())
  //    ,
  //    ersHarvestedThisLapMGUK = buffer.readFloatLE()
  //    ,
  //    ersHarvestedThisLapMGUH = buffer.readFloatLE()
  //    ,
  //    ersDeployedThisLap = buffer.readFloatLE()
  //    ),
  //
  //  }

//  def fillBuffer(buffer: ByteBuf): ByteBuf = {
  //    buffer.writeByte(tractionControl.getValue())
  //    buffer.writeByte(antiLockBrakes)
  //    buffer.writeByte(fuelMix.getValue())
  //    buffer.writeByte(frontBrakeBias)
  //    buffer.writeByte(pitLimiterStatus)
  //    buffer.writeFloatLE(fuelInTank)
  //    buffer.writeFloatLE(fuelCapacity)
  //    buffer.writeFloatLE(fuelRemainingLaps)
  //    buffer.writeIntLE(maxRPM)
  //    buffer.writeIntLE(idleRPM)
  //    buffer.writeByte(maxGears)
  //    buffer.writeByte(drsAllowed.getValue())
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      buffer.writeByte(tyresWear(j))
  //    }
  //    buffer.writeByte(actualTyreCompound.getValue())
  //    buffer.writeByte(visualTyreCompound.getValue())
  //    buffer.writeByte(tyresAgeLaps)
  //    for (j <- 0 until PacketConstants.TYRES) {
  //      buffer.writeByte(tyresDamage(j))
  //    }
  //    buffer.writeByte(frontLeftWingDamage)
  //    buffer.writeByte(frontRightWingDamage)
  //    buffer.writeByte(rearWingDamage)
  //    buffer.writeByte(drsFault)
  //    buffer.writeByte(engineDamage)
  //    buffer.writeByte(gearBoxDamage)
  //    buffer.writeByte(vehicleFiaFlags.getValue())
  //    buffer.writeFloatLE(ersStoreEnergy)
  //    buffer.writeByte(ersDeployMode.getValue())
  //    buffer.writeFloatLE(ersHarvestedThisLapMGUK)
  //    buffer.writeFloatLE(ersHarvestedThisLapMGUH)
  //    buffer.writeFloatLE(ersDeployedThisLap)
  //    buffer
  //  }

  override def toString: String =
    s"CarStatusData[tractionControl=$tractionControl," +
    s"antiLockBrakes=$antiLockBrakes," +
    s"fuelMix=$fuelMix," +
    s"frontBrakeBias=$frontBrakeBias," +
    s"pitLimiterStatus=$pitLimiterStatus," +
    s"fuelInTank=$fuelInTank," +
    s"fuelCapacity=$fuelCapacity," +
    s"fuelRemainingLaps=$fuelRemainingLaps," +
    s"maxRPM=$maxRPM," +
    s"idleRPM=$idleRPM," +
    s"maxGears=$maxGears," +
    s"drsAllowed=$drsAllowed," +
    s"drsActivationDistance=$drsActivationDistance," +
//    s"tyresWear=${tyresWear.mkString(" , ")}," +
    s"actualTyreCompound=$actualTyreCompound," +
    s"visualTyreCompound=$visualTyreCompound," +
    s"tyresAgeLaps=$tyresAgeLaps," +
//    s"tyresDamage=${tyresDamage.mkString(", ")}," +
//    s"frontLeftWingDamage=$frontLeftWingDamage," +
//    s"frontRightWingDamage=$frontRightWingDamage," +
//    s"rearWingDamage=$rearWingDamage," +
//    s"drsFault=$drsFault," +
//    s"engineDamage=$engineDamage," +
//    s"gearBoxDamage=$gearBoxDamage," +
    s"vehicleFiaFlags=$vehicleFiaFlags," +
    s"ersStoreEnergy=$ersStoreEnergy," +
    s"ersDeployMode=$ersDeployMode," +
    s"ersHarvestedThisLapMGUK=$ersHarvestedThisLapMGUK," +
    s"ersHarvestedThisLapMGUH=$ersHarvestedThisLapMGUH," +
    s"ersDeployedThisLap=$ersDeployedThisLap" +
    "]"
}

object CarStatusData extends F1Data {
  override def size: Int = 60
}
