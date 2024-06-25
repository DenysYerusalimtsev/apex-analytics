package io.apex.f1.application.api

import io.apex.f1.application.TelemetryProcessor
import org.apache.pekko.actor.ActorRef
import org.apache.pekko.actor.typed.ActorSystem
import org.apache.pekko.http.scaladsl.model.*
import org.apache.pekko.http.scaladsl.server.*
import org.apache.pekko.http.scaladsl.server.Directives.*

class Routes(telemetryProcessor: ActorRef[TelemetryProcessor.Command])(implicit
    system: ActorSystem[_]) {

  def routes: Route =
    path("start") {
      get {
        telemetryProcessor ! TelemetryProcessor.StartProcessing
        complete("Processing started")
      }
    } ~
    path("stop") {
      get {
        telemetryProcessor ! ProcessorManager.StopProcessing
        complete("Processing stopped")
      }
    }
}
