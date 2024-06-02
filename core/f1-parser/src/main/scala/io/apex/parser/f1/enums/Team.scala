package io.apex.parser.f1.enums

sealed trait Team

object Team {

  def valueOf(season: Int, value: Int): Option[Team] =
    season match {
      case 2020 => Team2020.valueOf(value)
      case 2021 => Team2021.valueOf(value)
      case 2022 => Team2022.valueOf(value)
      case _ => throw new IllegalArgumentException(s"Season $season not supported")
    }
}

enum Team2020(val value: Int) extends Team {
  case MERCEDES extends Team2020(0)
  case FERRARI extends Team2020(1)
  case RED_BULL_RACING extends Team2020(2)
  case WILLIAMS extends Team2020(3)
  case RACING_POINT extends Team2020(4)
  case RENAULT extends Team2020(5)
  case ALPHA_TAURI extends Team2020(6)
  case HAAS extends Team2020(7)
  case MCLAREN extends Team2020(8)
  case ALFA_ROMEO extends Team2020(9)
  case MCLAREN_1988 extends Team2020(10)
  case MCLAREN_1991 extends Team2020(11)
  case WILLIAM_1992 extends Team2020(12)
  case FERRARI_1995 extends Team2020(13)
  case WILLIAMS_1996 extends Team2020(14)
  case MCLAREN_1998 extends Team2020(15)
  case FERRARI_2002 extends Team2020(16)
  case FERRARI_2004 extends Team2020(17)
  case RENAULT_2006 extends Team2020(18)
  case FERRARI_2007 extends Team2020(19)
  case MCLAREN_2008 extends Team2020(20)
  case RED_BULL_2010 extends Team2020(21)
  case FERRARI_1976 extends Team2020(22)
  case ART_GRAND_PRIX extends Team2020(23)
  case CAMPOS_VEXATEC_RACING extends Team2020(24)
  case CARLIN extends Team2020(25)
  case CHAROUZ_RACING_SYSTEM extends Team2020(26)
  case DAMS extends Team2020(27)
  case RUSSIAN_TIME extends Team2020(28)
  case MP_MOTORSPORT extends Team2020(29)
  case PERTAMINA extends Team2020(30)
  case MCLAREN_1990 extends Team2020(31)
  case TRIDENT extends Team2020(32)
  case BWT_ARDEN extends Team2020(33)
  case MCLAREN_1976 extends Team2020(34)
  case LOTUS_1972 extends Team2020(35)
  case FERRARI_1979 extends Team2020(36)
  case MCLAREN_1982 extends Team2020(37)
  case WILLIAMS_2003 extends Team2020(38)
  case BRAWN_2009 extends Team2020(39)
  case LOTUS_1978 extends Team2020(40)
  case F1_GENERIC_CAR extends Team2020(41)
  case ART_GP_19 extends Team2020(42)
  case CAMPOS_19 extends Team2020(43)
  case CARLIN_19 extends Team2020(44)
  case SAUBER_JUNIOR_CHAROUZ_19 extends Team2020(45)
  case DAMS_19 extends Team2020(46)
  case UNI_VIRTUOSI_19 extends Team2020(47)
  case MP_MOTORSPORT_19 extends Team2020(48)
  case PREMA_19 extends Team2020(49)
  case TRIDENT_19 extends Team2020(50)
  case ARDEN_19 extends Team2020(51)
  case BENETTON_1994 extends Team2020(53)
  case BENETTON_1995 extends Team2020(54)
  case FERRARI_2000 extends Team2020(55)
  case JORDAN_1991 extends Team2020(56)
}

object Team2020 {
  def valueOf(value: Int): Option[Team2020] =
    Team2020.values.find(_.value == value)
}

enum Team2021(val value: Int) extends Team {
  case MERCEDES extends Team2021(0)
  case FERRARI extends Team2021(1)
  case RED_BULL_RACING extends Team2021(2)
  case WILLIAMS extends Team2021(3)
  case ASTON_MARTIN extends Team2021(4)
  case ALPINE extends Team2021(5)
  case ALPHA_TAURI extends Team2021(6)
  case HAAS extends Team2021(7)
  case MCLAREN extends Team2021(8)
  case ALFA_ROMEO extends Team2021(9)
  case ART_GP_19 extends Team2021(42)
  case CAMPOS_19 extends Team2021(43)
  case CARLIN_19 extends Team2021(44)
  case SAUBER_JUNIOR_CHAROUZ_19 extends Team2021(45)
  case DAMS_19 extends Team2021(46)
  case UNI_VIRTUOSI_19 extends Team2021(47)
  case MP_MOTORSPORT_19 extends Team2021(48)
  case PREMA_19 extends Team2021(49)
  case TRIDENT_19 extends Team2021(50)
  case ARDEN_19 extends Team2021(51)
  case ART_GP_20 extends Team2021(70)
  case CAMPOS_20 extends Team2021(71)
  case CARLIN_20 extends Team2021(72)
  case CHAROUZ_20 extends Team2021(73)
  case DAMS_20 extends Team2021(74)
  case UNI_VIRTUOSI_20 extends Team2021(75)
  case MP_MOTORSPORT_20 extends Team2021(76)
  case PREMA_20 extends Team2021(77)
  case TRIDENT_20 extends Team2021(78)
  case BWT_20 extends Team2021(79)
  case HITECH_20 extends Team2021(80)
  case MERCEDES_2020 extends Team2021(85)
  case FERRARI_2020 extends Team2021(86)
  case RED_BULL_2020 extends Team2021(87)
  case WILLIAMS_2020 extends Team2021(88)
  case RACING_POINT_2020 extends Team2021(89)
  case RENAULT_2020 extends Team2021(90)
  case ALPHA_TAURI_2020 extends Team2021(91)
  case HAAS_2020 extends Team2021(92)
  case MCLAREN_2020 extends Team2021(93)
  case ALFA_ROMEO_2020 extends Team2021(94)
  case PREMA_21 extends Team2021(106)
  case UNI_VIRTUOSI_21 extends Team2021(107)
  case CARLIN_21 extends Team2021(108)
  case HITECH_21 extends Team2021(109)
  case ART_GP_21 extends Team2021(110)
  case MP_MOTORSPORT_21 extends Team2021(111)
  case CHAROUZ_21 extends Team2021(112)
  case DAMS_21 extends Team2021(113)
  case CAMPOS_21 extends Team2021(114)
  case BWT_21 extends Team2021(115)
  case TRIDENT_21 extends Team2021(116)
}

object Team2021 {
  def valueOf(value: Int): Option[Team2021] =
    Team2021.values.find(_.value == value)
}

enum Team2022(val value: Int) extends Team {
  case MERCEDES extends Team2022(0)
  case FERRARI extends Team2022(1)
  case RED_BULL_RACING extends Team2022(2)
  case WILLIAMS extends Team2022(3)
  case ASTON_MARTIN extends Team2022(4)
  case ALPINE extends Team2022(5)
  case ALPHA_TAURI extends Team2022(6)
  case HAAS extends Team2022(7)
  case MCLAREN extends Team2022(8)
  case ALFA_ROMEO extends Team2022(9)
  case MERCEDES_2020 extends Team2022(85)
  case FERRARI_2020 extends Team2022(86)
  case RED_BULL_2020 extends Team2022(87)
  case WILLIAMS_2020 extends Team2022(88)
  case RACING_POINT_2020 extends Team2022(89)
  case RENAULT_2020 extends Team2022(90)
  case ALPHA_TAURI_2020 extends Team2022(91)
  case HAAS_2020 extends Team2022(92)
  case MCLAREN_2020 extends Team2022(93)
  case ALFA_ROMEO_2020 extends Team2022(94)
  case ASTON_MARTIN_DB11_V12 extends Team2022(95)
  case ASTON_MARTIN_VANTAGE_F1_EDITION extends Team2022(96)
  case ASTON_MARTIN_VAMTAGE_SAFETY_CAR extends Team2022(97)
  case FERRARI_F8_TRIBUTO extends Team2022(98)
  case FERRARI_ROMA extends Team2022(99)
  case MCLAREN_720S extends Team2022(100)
  case MCLAREN_ARTURA extends Team2022(101)
  case MERCEDES_AMG_GT_BLACK_SERIES_SAFETY_CAR extends Team2022(102)
  case MERCEDES_AMG_GTR_PRO extends Team2022(103)
  case F1_CUSTOM_TEAM extends Team2022(104)
  case PREMA_21 extends Team2022(106)
  case UNI_VIRTUOSI_21 extends Team2022(107)
  case CARLIN_21 extends Team2022(108)
  case HITECH_21 extends Team2022(109)
  case ART_GP_21 extends Team2022(110)
  case MP_MOTORSPORT_21 extends Team2022(111)
  case CHAROUZ_21 extends Team2022(112)
  case DAMS_21 extends Team2022(113)
  case CAMPOS_21 extends Team2022(114)
  case BWT_21 extends Team2022(115)
  case TRIDENT_21 extends Team2022(116)
  case MERCEDES_AMG_GT_BLACK_SERIES extends Team2022(117)
}

object Team2022 {
  def valueOf(value: Int): Option[Team2022] =
    Team2022.values.find(_.value == value)
}