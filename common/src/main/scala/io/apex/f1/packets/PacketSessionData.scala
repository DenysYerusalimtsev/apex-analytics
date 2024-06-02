package io.apex.f1.packets

import io.apex.f1.PacketConstants
import io.apex.f1.data.*
import io.apex.f1.enums.*

/** Session Packet
  *
  * The session packet includes details about the current session in progress.
  * Frequency: 2 per second
  */
case class PacketSessionData(
    header: PacketHeader,
    weather: Weather,
    trackTemperature: Short,
    airTemperature: Short,
    totalLaps: Short,
    trackLength: Int,
    sessionType: SessionType,
    trackId: Track,
    formula: Formula,
    sessionTimeLeft: Int,
    sessionDuration: Int,
    pitSpeedLimit: Short,
    gamePaused: Short,
    isSpectating: Short,
    spectatorCarIndex: Short,
    sliProNativeSupport: Short,
    numMarshalZones: Short,
    marshalZones: List[MarshalZone],
    safetyCarStatus: SafetyCarStatus,
    networkGame: Short,
    numWeatherForecastSamples: Short,
    weatherForecastSamples: List[WeatherForecastSample]) {

  override def toString: String = {
    val marshalZonesString = marshalZones.mkString(",")
    val weatherForecastSamplesString = weatherForecastSamples.mkString(",")
    s"Session[$header,weather=$weather,trackTemperature=$trackTemperature,airTemperature=$airTemperature,totalLaps=$totalLaps," +
    s"trackLength=$trackLength,sessionType=$sessionType,trackId=$trackId,formula=$formula,sessionTimeLeft=$sessionTimeLeft," +
    s"sessionDuration=$sessionDuration,pitSpeedLimit=$pitSpeedLimit,gamePaused=$gamePaused,isSpectating=$isSpectating," +
    s"spectatorCarIndex=$spectatorCarIndex,sliProNativeSupport=$sliProNativeSupport,numMarshalZones=$numMarshalZones," +
    s"marshalZones=$marshalZonesString,safetyCarStatus=$safetyCarStatus,networkGame=$networkGame," +
    s"numWeatherForecastSamples=$numWeatherForecastSamples,weatherForecastSamples=$weatherForecastSamplesString]"
  }

  //  def fill(buffer: ByteBuf): PacketSessionData = {
  //    val filledHeader = PacketHeader().fill(buffer)
  //    val filledWeather = Weather.valueOf(buffer.readUnsignedByte())
  //    val filledTrackTemperature = buffer.readByte()
  //    val filledAirTemperature = buffer.readByte()
  //    val filledTotalLaps = buffer.readUnsignedByte()
  //    val filledTrackLength = buffer.readUnsignedShortLE()
  //    val filledSessionType = SessionType.valueOf(buffer.readUnsignedByte())
  //    val filledTrackId = Track.valueOf(PacketConfig.getSeason(), buffer.readByte())
  //    val filledFormula = Formula.valueOf(buffer.readUnsignedByte())
  //    val filledSessionTimeLeft = buffer.readUnsignedShortLE()
  //    val filledSessionDuration = buffer.readUnsignedShortLE()
  //    val filledPitSpeedLimit = buffer.readUnsignedByte()
  //    val filledGamePaused = buffer.readUnsignedByte()
  //    val filledIsSpectating = buffer.readUnsignedByte()
  //    val filledSpectatorCarIndex = buffer.readUnsignedByte()
  //    val filledSliProNativeSupport = buffer.readUnsignedByte()
  //    val filledNumMarshalZones = buffer.readUnsignedByte()
  //    val filledMarshalZones = ListBuffer.fill(filledNumMarshalZones)(MarshalZone().fill(buffer)).toList
  //    val filledSafetyCarStatus = SafetyCarStatus.valueOf(buffer.readUnsignedByte())
  //    val filledNetworkGame = buffer.readUnsignedByte()
  //    val filledNumWeatherForecastSamples = buffer.readUnsignedByte()
  //    val filledWeatherForecastSamples = ListBuffer.fill(filledNumWeatherForecastSamples)(WeatherForecastSample().fill(buffer)).toList
  //
  //    PacketSessionData(
  //      filledHeader, filledWeather, filledTrackTemperature, filledAirTemperature, filledTotalLaps, filledTrackLength,
  //      filledSessionType, filledTrackId, filledFormula, filledSessionTimeLeft, filledSessionDuration, filledPitSpeedLimit,
  //      filledGamePaused, filledIsSpectating, filledSpectatorCarIndex, filledSliProNativeSupport, filledNumMarshalZones,
  //      filledMarshalZones, filledSafetyCarStatus, filledNetworkGame, filledNumWeatherForecastSamples, filledWeatherForecastSamples
  //    )
  //  }
  //
  //  def fillBuffer(packet: PacketSessionData, buffer: ByteBuf): ByteBuf = {
  //    packet.header.fillBuffer(buffer)
  //    buffer.writeByte(packet.weather.getValue())
  //    buffer.writeByte(packet.trackTemperature)
  //    buffer.writeByte(packet.airTemperature)
  //    buffer.writeByte(packet.totalLaps)
  //    buffer.writeShortLE(packet.trackLength)
  //    buffer.writeByte(packet.sessionType.getValue())
  //    buffer.writeByte(packet.trackId.getValue())
  //    buffer.writeByte(packet.formula.getValue())
  //    buffer.writeShortLE(packet.sessionTimeLeft)
  //    buffer.writeShortLE(packet.sessionDuration)
  //    buffer.writeByte(packet.pitSpeedLimit)
  //    buffer.writeByte(packet.gamePaused)
  //    buffer.writeByte(packet.isSpectating)
  //    buffer.writeByte(packet.spectatorCarIndex)
  //    buffer.writeByte(packet.sliProNativeSupport)
  //    buffer.writeByte(packet.numMarshalZones)
  //    packet.marshalZones.foreach(_.fillBuffer(buffer))
  //    buffer.writeByte(packet.safetyCarStatus.getValue())
  //    buffer.writeByte(packet.networkGame)
  //    buffer.writeByte(packet.numWeatherForecastSamples)
  //    packet.weatherForecastSamples.foreach(_.fillBuffer(buffer))
  //    buffer
  //  }
}

object PacketSessionData extends F1Packet {
  // 251
  override def size: Int = PacketHeader.size +
    19 + MarshalZone.size * PacketConstants.MarshalZones + 3 +
    WeatherForecastSample.size * PacketConstants.WeatherForecastSamples
}
