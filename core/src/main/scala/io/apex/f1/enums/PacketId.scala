package io.apex.f1.enums

enum PacketId(val value: Int) {
  case MOTION extends PacketId(0)
  case SESSION extends PacketId(1)
  case LAP_DATA extends PacketId(2)
  case EVENT extends PacketId(3)
  case PARTICIPANTS extends PacketId(4)
  case CAR_SETUPS extends PacketId(5)
  case CAR_TELEMETRY extends PacketId(6)
  case CAR_STATUS extends PacketId(7)
  case FINAL_CLASSIFICATION extends PacketId(8)
  case LOBBY_INFO extends PacketId(9)
}

object PacketId {
  def valueOf(value: Int): Option[PacketId] =
    PacketId.values.find(_.value == value)
}
