package io.apex.f1.data

case class CarDamageData(
    tyresWear: Array[Float],
    tyresDamage: Array[Int],
    brakesDamage: Array[Int],
    frontLeftWingDamage: Int,
    frontRightWingDamage: Int,
    rearWingDamage: Int,
    floorDamage: Int,
    diffuserDamage: Int,
    sidepodDamage: Int,
    drsFault: Int,
    ersFault: Int,
    gearBoxDamage: Int,
    engineDamage: Int,
    engineMGUHWear: Int,
    engineESWear: Int,
    engineCEWear: Int,
    engineICEWear: Int,
    engineMGUKWear: Int,
    engineTCWear: Int,
    engineBlown: Int,
    engineSeized: Int) {
  override def toString: String = {
    s"CarDamageData[tyresWear=${tyresWear.mkString("[", ", ", "]")}, tyresDamage=${tyresDamage.mkString("[", ", ", "]")}," +
    s"brakesDamage=${brakesDamage.mkString("[", ", ", "]")}, frontLeftWingDamage=$frontLeftWingDamage, " +
    s"frontRightWingDamage=$frontRightWingDamage, rearWingDamage=$rearWingDamage, floorDamage=$floorDamage, " +
    s"diffuserDamage=$diffuserDamage, sidepodDamage=$sidepodDamage, drsFault=$drsFault, ersFault=$ersFault, " +
    s"gearBoxDamage=$gearBoxDamage, engineDamage=$engineDamage, engineMGUHWear=$engineMGUHWear, " +
    s"engineESWear=$engineESWear, engineCEWear=$engineCEWear, engineICEWear=$engineICEWear, " +
    s"engineMGUKWear=$engineMGUKWear, engineTCWear=$engineTCWear, engineBlown=$engineBlown, engineSeized=$engineSeized]"
  }
}

object CarDamageData extends F1Data {
  override def size: Int = 39
}
