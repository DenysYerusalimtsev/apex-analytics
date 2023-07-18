import sbt.Keys.run
import sbtassembly.AssemblyPlugin.autoImport.assemblyMergeStrategy
import pl.project13.scala.sbt.JmhPlugin

ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "3.2.2"

lazy val root = (project in file("."))
  .settings(
    name := "apex-analytics"
  )


addCommandAlias("testFast", "testOnly -- -l org.scalatest.tags.Slow")

lazy val commonDependencies = Seq("org.scalatest" %% "scalatest" % "3.1.0" % Test)

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-Ypartial-unification",
    "-feature",
    "-language:implicitConversions,higherKinds,existentials"),
  // we need to remove Maven Central cause that is proxied by Azure Artifactory already
  externalResolvers -= Resolver.mavenCentral,
  externalResolvers ++= Seq(
    "azure" at "https://cnhi.pkgs.visualstudio.com/GeoSpatialStorage/_packaging/GeoSpatialStorage/maven/v1",
    // since Azure Artifactory can proxy only Maven Central we still need to explicitly set the rest
    "osgeo" at "https://repo.osgeo.org/repository/release",
    "confluent" at "https://packages.confluent.io/maven",
    "apache" at "https://repo.maven.apache.org/maven2"),
  credentials += Credentials(Path.userHome / ".sbt" / ".credentials"),
  updateOptions := updateOptions.value.withLatestSnapshots(false),
  addCompilerPlugin("org.typelevel" % "kind-projector" % "0.13.2" cross CrossVersion.full),
  publishTo := Some("azure" at "https://cnhi.pkgs.visualstudio.com/GeoSpatialStorage/_packaging/GeoSpatialStorage/maven/v1"),
  Test / testOptions += Tests.Argument("-oDF"),
  // do not build scala-docs when packaging via sbt native packager
  Compile / packageDoc / mappings := Nil
)

lazy val defaultMergeStrategy = assembly / assemblyMergeStrategy := {
  case PathList("META-INF", "native-image", "io.netty", _*)   => MergeStrategy.first
  case PathList("META-INF", "native", _*)                     => MergeStrategy.first
  case PathList("META-INF", "versions", _*)                   => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".kotlin_module" => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".properties"    => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".proto"         => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".jnilib"        => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith "plugin.xml"     => MergeStrategy.first
  case PathList(ps @ _*) if ps.last endsWith ".jai"           => MergeStrategy.concat
  case PathList(ps @ _*) if ps.last endsWith ".jaiext"        => MergeStrategy.concat
  case "application.conf"                                     => MergeStrategy.concat
  case "module-info.class"                                    => MergeStrategy.discard
  case other: Any                                             => MergeStrategy.defaultMergeStrategy(other)
}

// We need to add provided dependencies back so we could execute tests
lazy val providedAsRunnable = Seq(
  Compile / run := Defaults
    .runTask(Compile / fullClasspath, Compile / run / mainClass, Compile / run / runner)
    .evaluated,
  Compile / runMain := Defaults
    .runMainTask(Compile / fullClasspath, Compile / run / runner)
    .evaluated)

lazy val notAssembleScala =
  assembly / assemblyOption := (assembly / assemblyOption).value.withIncludeScala(false)

lazy val forkTests =
  Seq(
    Test / fork := true,
    Test / javaOptions ++= Seq(
      "-Xmx640M",
      "-XX:MaxMetaspaceSize=320M",
      "-XX:MinHeapFreeRatio=10",
      "-XX:MaxHeapFreeRatio=20"))
