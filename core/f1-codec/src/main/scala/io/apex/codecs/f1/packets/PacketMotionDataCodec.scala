package io.apex.codecs.f1.packets

import io.apex.f1.packets.PacketMotionData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketMotionDataCodec {
  implicit val packetMotionDataCodec: Codec[PacketMotionData] = {
    ("header" | Codec[PacketHeader]) ::
    ("carMotionData" | vectorOfN(provide(22), Codec[CarMotionData])) ::
    ("suspensionPosition" | vectorOfN(provide(4), float)) ::
    ("suspensionVelocity" | vectorOfN(provide(4), float)) ::
    ("suspensionAcceleration" | vectorOfN(provide(4), float)) ::
    ("wheelSpeed" | vectorOfN(provide(4), float)) ::
    ("wheelSlip" | vectorOfN(provide(4), float)) ::
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
  }.as[PacketMotionData]
}
