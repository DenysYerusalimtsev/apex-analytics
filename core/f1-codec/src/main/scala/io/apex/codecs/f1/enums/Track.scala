package io.apex.codecs.f1.enums

import io.apex.f1.enums.*
import io.apex.f1.enums.Track2020.*
import io.apex.f1.enums.Track2021.*
import io.apex.f1.enums.Track2022.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object Track2020Codec {
  val codec2020: Codec[Track2020] = {
    mappedEnum(
      int8,
      Track2020.MELBOURNE -> 0,
      Track2020.PAUL_RICARD -> 1,
      Track2020.SHANGHAI -> 2,
      Track2020.SAKHIR_BAHRAIN -> 3,
      Track2020.CATALUNYA -> 4,
      Track2020.MONACO -> 5,
      Track2020.MONTREAL -> 6,
      Track2020.SILVERSTONE -> 7,
      Track2020.HOCKENHEIM -> 8,
      Track2020.HUNGARORING -> 9,
      Track2020.SPA -> 10,
      Track2020.MONZA -> 11,
      Track2020.SINGAPORE -> 12,
      Track2020.SUZUKA -> 13,
      Track2020.ABU_DHABI -> 14,
      Track2020.TEXAS -> 15,
      Track2020.BRAZIL -> 16,
      Track2020.AUSTRIA -> 17,
      Track2020.SOCHI -> 18,
      Track2020.MEXICO -> 19,
      Track2020.BAKU_AZERBAIJAN -> 20,
      Track2020.SAKHIR_SHORT -> 21,
      Track2020.SILVERSTONE_SHORT -> 22,
      Track2020.TEXAS_SHORT -> 23,
      Track2020.SUZUKA_SHORT -> 24,
      Track2020.HANOI -> 25,
      Track2020.ZANDVOORT -> 26)
  }
}

object Track2021Codec {
  val codec2021: Codec[Track2021] = {
    mappedEnum(
      int8,
      Track2021.MELBOURNE -> 0,
      Track2021.PAUL_RICARD -> 1,
      Track2021.SHANGHAI -> 2,
      Track2021.SAKHIR_BAHRAIN -> 3,
      Track2021.CATALUNYA -> 4,
      Track2021.MONACO -> 5,
      Track2021.MONTREAL -> 6,
      Track2021.SILVERSTONE -> 7,
      Track2021.HOCKENHEIM -> 8,
      Track2021.HUNGARORING -> 9,
      Track2021.SPA -> 10,
      Track2021.MONZA -> 11,
      Track2021.SINGAPORE -> 12,
      Track2021.SUZUKA -> 13,
      Track2021.ABU_DHABI -> 14,
      Track2021.TEXAS -> 15,
      Track2021.BRAZIL -> 16,
      Track2021.AUSTRIA -> 17,
      Track2021.SOCHI -> 18,
      Track2021.MEXICO -> 19,
      Track2021.BAKU_AZERBAIJAN -> 20,
      Track2021.SAKHIR_SHORT -> 21,
      Track2021.SILVERSTONE_SHORT -> 22,
      Track2021.TEXAS_SHORT -> 23,
      Track2021.SUZUKA_SHORT -> 24,
      Track2021.HANOI -> 25,
      Track2021.ZANDVOORT -> 26,
      Track2021.IMOLA -> 27,
      Track2021.PORTIMÃO -> 28,
      Track2021.JEDDAH -> 29)
  }
}

object Track2022Codec {
  val codec2022: Codec[Track2022] = {
    mappedEnum(
      int8,
      Track2022.MELBOURNE -> 0,
      Track2022.PAUL_RICARD -> 1,
      Track2022.SHANGHAI -> 2,
      Track2022.SAKHIR_BAHRAIN -> 3,
      Track2022.CATALUNYA -> 4,
      Track2022.MONACO -> 5,
      Track2022.MONTREAL -> 6,
      Track2022.SILVERSTONE -> 7,
      Track2022.HOCKENHEIM -> 8,
      Track2022.HUNGARORING -> 9,
      Track2022.SPA -> 10,
      Track2022.MONZA -> 11,
      Track2022.SINGAPORE -> 12,
      Track2022.SUZUKA -> 13,
      Track2022.ABU_DHABI -> 14,
      Track2022.TEXAS -> 15,
      Track2022.BRAZIL -> 16,
      Track2022.AUSTRIA -> 17,
      Track2022.SOCHI -> 18,
      Track2022.MEXICO -> 19,
      Track2022.BAKU_AZERBAIJAN -> 20,
      Track2022.SAKHIR_SHORT -> 21,
      Track2022.SILVERSTONE_SHORT -> 22,
      Track2022.TEXAS_SHORT -> 23,
      Track2022.SUZUKA_SHORT -> 24,
      Track2022.HANOI -> 25,
      Track2022.ZANDVOORT -> 26,
      Track2022.IMOLA -> 27,
      Track2022.PORTIMÃO -> 28,
      Track2022.JEDDAH -> 29,
      Track2022.MIAMI -> 30)
  }
}
