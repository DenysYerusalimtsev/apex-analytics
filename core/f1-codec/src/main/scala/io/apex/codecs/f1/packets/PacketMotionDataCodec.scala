package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.CarMotionDataCodec
import io.apex.f1.packets.{PacketHeader, PacketMotionData}
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketMotionDataCodec {
  val packetMotionDataCodec: Codec[PacketMotionData] = (
    ("header" | PacketHeaderCodec.codec) ::
      ("carMotionData" | listOfN(provide(22), CarMotionDataCodec.codec)) ::
      ("suspensionPosition" | listOfN(provide(4), float)) ::
      ("suspensionVelocity" | listOfN(provide(4), float)) ::
      ("suspensionAcceleration" | listOfN(provide(4), float)) ::
      ("wheelSpeed" | listOfN(provide(4), float)) ::
      ("wheelSlip" | listOfN(provide(4), float)) ::
      ("localVelocityX" | float) ::
      ("localVelocityY" | float) ::
      ("localVelocityZ" | float) ::
      ("angularVelocityX" | float) ::
      ("angularVelocityY" | float) ::
      ("angularVelocityZ" | float) ::
      ("angularAccelerationX" | float) ::
      ("angularAccelerationY" | float) ::
      ("angularAccelerationZ" | float) ::
      ("frontWheelsAngle" | float)
  ).as[PacketMotionData]
}
