package io.apex.f1.enums

enum SurfaceType(val value: Int) {
  case TARMAC extends SurfaceType(0)
  case RUMBLE_STRIP extends SurfaceType(1)
  case CONCRETE extends SurfaceType(2)
  case ROCK extends SurfaceType(3)
  case GRAVEL extends SurfaceType(4)
  case MUD extends SurfaceType(5)
  case SAND extends SurfaceType(6)
  case GRASS extends SurfaceType(7)
  case WATER extends SurfaceType(8)
  case COBBLESTONE extends SurfaceType(9)
  case METAL extends SurfaceType(10)
  case RIDGED extends SurfaceType(11)
}

object SurfaceType {
  def valueOf(value: Int): Option[SurfaceType] =
    SurfaceType.values.find(_.value == value)
}
