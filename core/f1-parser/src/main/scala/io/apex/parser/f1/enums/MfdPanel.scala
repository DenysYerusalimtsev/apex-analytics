package io.apex.parser.f1.enums

enum MfdPanel(val value: Int) {
  case CAR_SETUP extends MfdPanel(0)
  case PITS extends MfdPanel(1)
  case DAMAGE extends MfdPanel(2)
  case ENGINE extends MfdPanel(3)
  case TEMPERATURES extends MfdPanel(4)
  case MFD_CLOSED extends MfdPanel(255)
}

object MfdPanel {
  def valueOf(value: Int): Option[MfdPanel] =
    MfdPanel.values.find(_.value == value)
}

