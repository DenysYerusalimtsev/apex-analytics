package io.apex.codecs.f1.packets

import io.apex.codecs.f1.data.FinalClassificationDataCodec
import io.apex.f1.packets.PacketFinalClassificationData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object PacketFinalClassificationDataCodec {
  val codec: Codec[PacketFinalClassificationData] = (
    ("header" | PacketHeaderCodec.codec) ::
      ("numCars" | uint8) ::
      ("classificationData" | listOfN(provide(22), FinalClassificationDataCodec.codec))
  ).as[PacketFinalClassificationData]
}
