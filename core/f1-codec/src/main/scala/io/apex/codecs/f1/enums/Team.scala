package io.apex.codecs.f1.enums

import io.apex.f1.enums.*
import io.apex.f1.enums.Team2020.*
import io.apex.f1.enums.Team2021.*
import io.apex.f1.enums.Team2022.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*



object Team2020Codec {
  val codec2020: Codec[Team2020] = mappedEnum(
    uint8, // Codec for the integer value
    Team2020.MERCEDES -> 0,
    Team2020.FERRARI -> 1,
    Team2020.RED_BULL_RACING -> 2,
    Team2020.WILLIAMS -> 3,
    Team2020.RACING_POINT -> 4,
    Team2020.RENAULT -> 5,
    Team2020.ALPHA_TAURI -> 6,
    Team2020.HAAS -> 7,
    Team2020.MCLAREN -> 8,
    Team2020.ALFA_ROMEO -> 9,
    Team2020.MCLAREN_1988 -> 10,
    Team2020.MCLAREN_1991 -> 11,
    Team2020.WILLIAM_1992 -> 12,
    Team2020.FERRARI_1995 -> 13,
    Team2020.WILLIAMS_1996 -> 14,
    Team2020.MCLAREN_1998 -> 15,
    Team2020.FERRARI_2002 -> 16,
    Team2020.FERRARI_2004 -> 17,
    Team2020.RENAULT_2006 -> 18,
    Team2020.FERRARI_2007 -> 19,
    Team2020.MCLAREN_2008 -> 20,
    Team2020.RED_BULL_2010 -> 21,
    Team2020.FERRARI_1976 -> 22,
    Team2020.ART_GRAND_PRIX -> 23,
    Team2020.CAMPOS_VEXATEC_RACING -> 24,
    Team2020.CARLIN -> 25,
    Team2020.CHAROUZ_RACING_SYSTEM -> 26,
    Team2020.DAMS -> 27,
    Team2020.RUSSIAN_TIME -> 28,
    Team2020.MP_MOTORSPORT -> 29,
    Team2020.PERTAMINA -> 30,
    Team2020.MCLAREN_1990 -> 31,
    Team2020.TRIDENT -> 32,
    Team2020.BWT_ARDEN -> 33,
    Team2020.MCLAREN_1976 -> 34,
    Team2020.LOTUS_1972 -> 35,
    Team2020.FERRARI_1979 -> 36,
    Team2020.MCLAREN_1982 -> 37,
    Team2020.WILLIAMS_2003 -> 38,
    Team2020.BRAWN_2009 -> 39,
    Team2020.LOTUS_1978 -> 40,
    Team2020.F1_GENERIC_CAR -> 41,
    Team2020.ART_GP_19 -> 42,
    Team2020.CAMPOS_19 -> 43,
    Team2020.CARLIN_19 -> 44,
    Team2020.SAUBER_JUNIOR_CHAROUZ_19 -> 45,
    Team2020.DAMS_19 -> 46,
    Team2020.UNI_VIRTUOSI_19 -> 47,
    Team2020.MP_MOTORSPORT_19 -> 48,
    Team2020.PREMA_19 -> 49,
    Team2020.TRIDENT_19 -> 50,
    Team2020.ARDEN_19 -> 51,
    Team2020.BENETTON_1994 -> 53,
    Team2020.BENETTON_1995 -> 54,
    Team2020.FERRARI_2000 -> 55,
    Team2020.JORDAN_1991 -> 56)
}

object Team2021Codec {
  val codec2021: Codec[Team2021] = mappedEnum(
    uint8, // Codec for the integer value
    Team2021.MERCEDES -> 0,
    Team2021.FERRARI -> 1,
    Team2021.RED_BULL_RACING -> 2,
    Team2021.WILLIAMS -> 3,
    Team2021.ASTON_MARTIN -> 4,
    Team2021.ALPINE -> 5,
    Team2021.ALPHA_TAURI -> 6,
    Team2021.HAAS -> 7,
    Team2021.MCLAREN -> 8,
    Team2021.ALFA_ROMEO -> 9,
    Team2021.ART_GP_19 -> 42,
    Team2021.CAMPOS_19 -> 43,
    Team2021.CARLIN_19 -> 44,
    Team2021.SAUBER_JUNIOR_CHAROUZ_19 -> 45,
    Team2021.DAMS_19 -> 46,
    Team2021.UNI_VIRTUOSI_19 -> 47,
    Team2021.MP_MOTORSPORT_19 -> 48,
    Team2021.PREMA_19 -> 49,
    Team2021.TRIDENT_19 -> 50,
    Team2021.ARDEN_19 -> 51,
    Team2021.ART_GP_20 -> 70,
    Team2021.CAMPOS_20 -> 71,
    Team2021.CARLIN_20 -> 72,
    Team2021.CHAROUZ_20 -> 73,
    Team2021.DAMS_20 -> 74,
    Team2021.UNI_VIRTUOSI_20 -> 75,
    Team2021.MP_MOTORSPORT_20 -> 76,
    Team2021.PREMA_20 -> 77,
    Team2021.TRIDENT_20 -> 78,
    Team2021.BWT_20 -> 79,
    Team2021.HITECH_20 -> 80,
    Team2021.MERCEDES_2020 -> 85,
    Team2021.FERRARI_2020 -> 86,
    Team2021.RED_BULL_2020 -> 87,
    Team2021.WILLIAMS_2020 -> 88,
    Team2021.RACING_POINT_2020 -> 89,
    Team2021.RENAULT_2020 -> 90,
    Team2021.ALPHA_TAURI_2020 -> 91,
    Team2021.HAAS_2020 -> 92,
    Team2021.MCLAREN_2020 -> 93,
    Team2021.ALFA_ROMEO_2020 -> 94,
    Team2021.PREMA_21 -> 106,
    Team2021.UNI_VIRTUOSI_21 -> 107,
    Team2021.CARLIN_21 -> 108,
    Team2021.HITECH_21 -> 109,
    Team2021.ART_GP_21 -> 110,
    Team2021.MP_MOTORSPORT_21 -> 111,
    Team2021.CHAROUZ_21 -> 112,
    Team2021.DAMS_21 -> 113,
    Team2021.CAMPOS_21 -> 114,
    Team2021.BWT_21 -> 115,
    Team2021.TRIDENT_21 -> 116)
}

object Team2022 {
  val codec2022: Codec[Team2022] = mappedEnum(
    uint8, // Codec for the integer value
    Team2022.MERCEDES -> 0,
    Team2022.FERRARI -> 1,
    Team2022.RED_BULL_RACING -> 2,
    Team2022.WILLIAMS -> 3,
    Team2022.ASTON_MARTIN -> 4,
    Team2022.ALPINE -> 5,
    Team2022.ALPHA_TAURI -> 6,
    Team2022.HAAS -> 7,
    Team2022.MCLAREN -> 8,
    Team2022.ALFA_ROMEO -> 9,
    Team2022.MERCEDES_2020 -> 85,
    Team2022.FERRARI_2020 -> 86,
    Team2022.RED_BULL_2020 -> 87,
    Team2022.WILLIAMS_2020 -> 88,
    Team2022.RACING_POINT_2020 -> 89,
    Team2022.RENAULT_2020 -> 90,
    Team2022.ALPHA_TAURI_2020 -> 91,
    Team2022.HAAS_2020 -> 92,
    Team2022.MCLAREN_2020 -> 93,
    Team2022.ALFA_ROMEO_2020 -> 94,
    Team2022.ASTON_MARTIN_DB11_V12 -> 95,
    Team2022.ASTON_MARTIN_VANTAGE_F1_EDITION -> 96,
    Team2022.ASTON_MARTIN_VAMTAGE_SAFETY_CAR -> 97,
    Team2022.FERRARI_F8_TRIBUTO -> 98,
    Team2022.FERRARI_ROMA -> 99,
    Team2022.MCLAREN_720S -> 100,
    Team2022.MCLAREN_ARTURA -> 101,
    Team2022.MERCEDES_AMG_GT_BLACK_SERIES_SAFETY_CAR -> 102,
    Team2022.MERCEDES_AMG_GTR_PRO -> 103,
    Team2022.F1_CUSTOM_TEAM -> 104,
    Team2022.PREMA_21 -> 106,
    Team2022.UNI_VIRTUOSI_21 -> 107,
    Team2022.CARLIN_21 -> 108,
    Team2022.HITECH_21 -> 109,
    Team2022.ART_GP_21 -> 110,
    Team2022.MP_MOTORSPORT_21 -> 111,
    Team2022.CHAROUZ_21 -> 112,
    Team2022.DAMS_21 -> 113,
    Team2022.CAMPOS_21 -> 114,
    Team2022.BWT_21 -> 115,
    Team2022.TRIDENT_21 -> 116,
    Team2022.MERCEDES_AMG_GT_BLACK_SERIES -> 117
  )
}
