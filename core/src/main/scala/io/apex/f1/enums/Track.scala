package io.apex.f1.enums

sealed trait Track

object Track {

  def valueOf(season: Int, value: Int): Option[Track] =
    season match {
      case 2020 => Track2020.valueOf(value)
      case 2021 => Track2021.valueOf(value)
      case 2022 => Track2022.valueOf(value)
      case _ => throw new IllegalArgumentException(s"Season $season not supported")
    }
}

enum Track2020(val value: Int) extends Track {
  case MELBOURNE extends Track2020(0)
  case PAUL_RICARD extends Track2020(1)
  case SHANGHAI extends Track2020(2)
  case SAKHIR_BAHRAIN extends Track2020(3)
  case CATALUNYA extends Track2020(4)
  case MONACO extends Track2020(5)
  case MONTREAL extends Track2020(6)
  case SILVERSTONE extends Track2020(7)
  case HOCKENHEIM extends Track2020(8)
  case HUNGARORING extends Track2020(9)
  case SPA extends Track2020(10)
  case MONZA extends Track2020(11)
  case SINGAPORE extends Track2020(12)
  case SUZUKA extends Track2020(13)
  case ABU_DHABI extends Track2020(14)
  case TEXAS extends Track2020(15)
  case BRAZIL extends Track2020(16)
  case AUSTRIA extends Track2020(17)
  case SOCHI extends Track2020(18)
  case MEXICO extends Track2020(19)
  case BAKU_AZERBAIJAN extends Track2020(20)
  case SAKHIR_SHORT extends Track2020(21)
  case SILVERSTONE_SHORT extends Track2020(22)
  case TEXAS_SHORT extends Track2020(23)
  case SUZUKA_SHORT extends Track2020(24)
  case HANOI extends Track2020(25)
  case ZANDVOORT extends Track2020(26)
}

object Track2020 {
  def valueOf(value: Int): Option[Track2020] =
    Track2020.values.find(_.value == value)
}

enum Track2021(val value: Int) extends Track {
  case MELBOURNE extends Track2021(0)
  case PAUL_RICARD extends Track2021(1)
  case SHANGHAI extends Track2021(2)
  case SAKHIR_BAHRAIN extends Track2021(3)
  case CATALUNYA extends Track2021(4)
  case MONACO extends Track2021(5)
  case MONTREAL extends Track2021(6)
  case SILVERSTONE extends Track2021(7)
  case HOCKENHEIM extends Track2021(8)
  case HUNGARORING extends Track2021(9)
  case SPA extends Track2021(10)
  case MONZA extends Track2021(11)
  case SINGAPORE extends Track2021(12)
  case SUZUKA extends Track2021(13)
  case ABU_DHABI extends Track2021(14)
  case TEXAS extends Track2021(15)
  case BRAZIL extends Track2021(16)
  case AUSTRIA extends Track2021(17)
  case SOCHI extends Track2021(18)
  case MEXICO extends Track2021(19)
  case BAKU_AZERBAIJAN extends Track2021(20)
  case SAKHIR_SHORT extends Track2021(21)
  case SILVERSTONE_SHORT extends Track2021(22)
  case TEXAS_SHORT extends Track2021(23)
  case SUZUKA_SHORT extends Track2021(24)
  case HANOI extends Track2021(25)
  case ZANDVOORT extends Track2021(26)
  case IMOLA extends Track2021(27)
  case PORTIMÃO extends Track2021(28)
  case JEDDAH extends Track2021(29)
}

object Track2021 {
  def valueOf(value: Int): Option[Track2021] =
    Track2021.values.find(_.value == value)
}

enum Track2022(val value: Int) extends Track {
  case MELBOURNE extends Track2022(0)
  case PAUL_RICARD extends Track2022(1)
  case SHANGHAI extends Track2022(2)
  case SAKHIR_BAHRAIN extends Track2022(3)
  case CATALUNYA extends Track2022(4)
  case MONACO extends Track2022(5)
  case MONTREAL extends Track2022(6)
  case SILVERSTONE extends Track2022(7)
  case HOCKENHEIM extends Track2022(8)
  case HUNGARORING extends Track2022(9)
  case SPA extends Track2022(10)
  case MONZA extends Track2022(11)
  case SINGAPORE extends Track2022(12)
  case SUZUKA extends Track2022(13)
  case ABU_DHABI extends Track2022(14)
  case TEXAS extends Track2022(15)
  case BRAZIL extends Track2022(16)
  case AUSTRIA extends Track2022(17)
  case SOCHI extends Track2022(18)
  case MEXICO extends Track2022(19)
  case BAKU_AZERBAIJAN extends Track2022(20)
  case SAKHIR_SHORT extends Track2022(21)
  case SILVERSTONE_SHORT extends Track2022(22)
  case TEXAS_SHORT extends Track2022(23)
  case SUZUKA_SHORT extends Track2022(24)
  case HANOI extends Track2022(25)
  case ZANDVOORT extends Track2022(26)
  case IMOLA extends Track2022(27)
  case PORTIMÃO extends Track2022(28)
  case JEDDAH extends Track2022(29)
  case MIAMI extends Track2022(30)
}

object Track2022 {
  def valueOf(value: Int): Option[Track2022] =
    Track2022.values.find(_.value == value)
}