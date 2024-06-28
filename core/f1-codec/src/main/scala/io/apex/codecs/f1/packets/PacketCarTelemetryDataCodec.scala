package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.CarTelemetryDataCodec
import io.apex.codecs.f1.enums.MfdPanelCodec
import io.apex.f1.packets.PacketCarTelemetryData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketCarTelemetryDataCodec {
  val codec: Codec[PacketCarTelemetryData] = (
    ("header" | PacketHeaderCodec.codec) ::
      ("carTelemetryData" | listOfN(provide(22), CarTelemetryDataCodec.codec)) ::
      ("mfdPanelIndex" | MfdPanelCodec.codec) ::
      ("mfdPanelIndexSecondaryPlayer" | MfdPanelCodec.codec) ::
      ("suggestedGear" | int8)
  ).as[PacketCarTelemetryData]
}
