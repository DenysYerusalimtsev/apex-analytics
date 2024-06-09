package io.apex.codecs.f1.data

import io.apex.f1.data.CarDamageData
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object CarDamageDataCodec {
  val codec: Codec[CarDamageData] = {
    ("tyresWear" | listOfN(provide(4), float)) ::
    ("tyresDamage" | listOfN(provide(4), uint8)) ::
    ("brakesDamage" | listOfN(provide(4), uint8)) ::
    ("frontLeftWingDamage" | uint8) ::
    ("frontRightWingDamage" | uint8) ::
    ("rearWingDamage" | uint8) ::
    ("floorDamage" | uint8) ::
    ("diffuserDamage" | uint8) ::
    ("sidepodDamage" | uint8) ::
    ("drsFault" | uint8) ::
    ("ersFault" | uint8) ::
    ("gearBoxDamage" | uint8) ::
    ("engineDamage" | uint8) ::
    ("engineMGUHWear" | uint8) ::
    ("engineESWear" | uint8) ::
    ("engineCEWear" | uint8) ::
    ("engineICEWear" | uint8) ::
    ("engineMGUKWear" | uint8) ::
    ("engineTCWear" | uint8) ::
    ("engineBlown" | uint8) ::
    ("engineSeized" | uint8)
  }.as[CarDamageData]
}
