package io.apex.f1.data

import io.netty.buffer.ByteBuf

import java.util
import java.util.Arrays

case class CarStatusData(
                          tractionControl: TractionControl,
                          antiLockBrakes: Short,
                          fuelMix: FuelMix,
                          frontBrakeBias: Short,
                          pitLimiterStatus: Short,
                          fuelInTank: Float,
                          fuelCapacity: Float,
                          fuelRemainingLaps: Float,
                          maxRPM: Int,
                          idleRPM: Int,
                          maxGears: Short,
                          drsAllowed: DrsAllowed,
                          drsActivationDistance: Int,
                          tyresWear: Array[Short],
                          actualTyreCompound: ActualTyreCompound,
                          visualTyreCompound: VisualTyreCompound,
                          tyresAgeLaps: Short,
                          tyresDamage: Array[Short],
                          frontLeftWingDamage: Short,
                          frontRightWingDamage: Short,
                          rearWingDamage: Short,
                          drsFault: Short,
                          engineDamage: Short,
                          gearBoxDamage: Short,
                          vehicleFiaFlags: VehicleFiaFlag,
                          ersStoreEnergy: Float,
                          ersDeployMode: ErsDeployMode,
                          ersHarvestedThisLapMGUK: Float,
                          ersHarvestedThisLapMGUH: Float,
                          ersDeployedThisLap: Float
                        ) {


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
//      maxRPM = buffer.readUnsignedShortLE(),
//      idleRPM = buffer.readUnsignedShortLE(),
//      maxGears = buffer.readUnsignedByte(),
//      drsAllowed = DrsAllowed.valueOf(buffer.readUnsignedByte()),
//      drsActivationDistance = buffer.readUnsignedShortLE()
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

  def fillBuffer(buffer: ByteBuf): ByteBuf = {
    buffer.writeByte(tractionControl.getValue())
    buffer.writeByte(antiLockBrakes)
    buffer.writeByte(fuelMix.getValue())
    buffer.writeByte(frontBrakeBias)
    buffer.writeByte(pitLimiterStatus)
    buffer.writeFloatLE(fuelInTank)
    buffer.writeFloatLE(fuelCapacity)
    buffer.writeFloatLE(fuelRemainingLaps)
    buffer.writeShortLE(maxRPM)
    buffer.writeShortLE(idleRPM)
    buffer.writeByte(maxGears)
    buffer.writeByte(drsAllowed.getValue())
    buffer.writeShortLE(drsActivationDistance)
    for (j <- 0 until PacketConstants.TYRES) {
      buffer.writeByte(tyresWear(j))
    }
    buffer.writeByte(actualTyreCompound.getValue())
    buffer.writeByte(visualTyreCompound.getValue())
    buffer.writeByte(tyresAgeLaps)
    for (j <- 0 until PacketConstants.TYRES) {
      buffer.writeByte(tyresDamage(j))
    }
    buffer.writeByte(frontLeftWingDamage)
    buffer.writeByte(frontRightWingDamage)
    buffer.writeByte(rearWingDamage)
    buffer.writeByte(drsFault)
    buffer.writeByte(engineDamage)
    buffer.writeByte(gearBoxDamage)
    buffer.writeByte(vehicleFiaFlags.getValue())
    buffer.writeFloatLE(ersStoreEnergy)
    buffer.writeByte(ersDeployMode.getValue())
    buffer.writeFloatLE(ersHarvestedThisLapMGUK)
    buffer.writeFloatLE(ersHarvestedThisLapMGUH)
    buffer.writeFloatLE(ersDeployedThisLap)
    buffer
  }

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
      s"tyresWear=${Arrays.toString(tyresWear)}," +
      s"actualTyreCompound=$actualTyreCompound," +
      s"visualTyreCompound=$visualTyreCompound," +
      s"tyresAgeLaps=$tyresAgeLaps," +
      s"tyresDamage=${Arrays.toString(tyresDamage)}," +
      s"frontLeftWingDamage=$frontLeftWingDamage," +
      s"frontRightWingDamage=$frontRightWingDamage," +
      s"rearWingDamage=$rearWingDamage," +
      s"drsFault=$drsFault," +
      s"engineDamage=$engineDamage," +
      s"gearBoxDamage=$gearBoxDamage," +
      s"vehicleFiaFlags=$vehicleFiaFlags," +
      s"ersStoreEnergy=$ersStoreEnergy," +
      s"ersDeployMode=$ersDeployMode," +
      s"ersHarvestedThisLapMGUK=$ersHarvestedThisLapMGUK," +
      s"ersHarvestedThisLapMGUH=$ersHarvestedThisLapMGUH," +
      s"ersDeployedThisLap=$ersDeployedThisLap" +
      "]"
}