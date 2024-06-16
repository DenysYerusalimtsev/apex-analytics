package io.apex.codecs.f1.enums

import io.apex.f1.enums.SurfaceType
import io.apex.f1.enums.SurfaceType.*
import scodec.*
import scodec.bits.*
import scodec.codecs.*

object SurfaceType {

  val codec: Codec[SurfaceType] = mappedEnum(
    uint8,
    TARMAC -> 0,
    RUMBLE_STRIP -> 1,
    CONCRETE -> 2,
    ROCK -> 3,
    GRAVEL -> 4,
    MUD -> 5,
    SAND -> 6,
    GRASS -> 7,
    WATER -> 8,
    COBBLESTONE -> 9,
    METAL -> 10,
    RIDGED -> 11)
}
