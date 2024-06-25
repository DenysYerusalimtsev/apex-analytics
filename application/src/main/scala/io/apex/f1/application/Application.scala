package io.apex.f1.application

import cats.effect.{ExitCode, IO, IOApp}
import com.typesafe.config.{Config, ConfigFactory}
import io.apex.f1.application.api.Routes
import org.apache.pekko.actor.typed.ActorSystem
import org.apache.pekko.event.Logging
import org.apache.pekko.http.scaladsl.Http

import scala.concurrent.ExecutionContextExecutor

object Application extends IOApp {
  def main(args: Array[String]): Unit = {
    given system: ActorSystem[Any] = ActorSystem()
    given executionContext: ExecutionContextExecutor = system.executionContext

    val config = ConfigFactory.load()

    val routes = new Routes(telemetryProcessor).routes
    Http().newServerAt(config.getString("http.host"), config.getInt("http.port")).bindFlow(routes)
  }
}
