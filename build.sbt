import sbt.Keys.run
import sbtassembly.AssemblyPlugin.autoImport.assemblyMergeStrategy

ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / scalaVersion := "3.3.1"
ThisBuild / useCoursier := false

ThisBuild / scalacOptions ++= {
  CrossVersion.partialVersion(scalaVersion.value) match {
    case Some((3, _))       => Seq("-Ykind-projector:underscores")
    case Some((2, 12 | 13)) => Seq("-Xsource:3", "-P:kind-projector:underscore-placeholders")
  }
}
val pekkoCore = Seq(
  "org.apache.pekko" %% "pekko-actor-typed" % V.pekko % Test,
  "org.apache.pekko" %% "pekko-stream-typed" % V.pekko % Test,
  "org.apache.pekko" %% "pekko-testkit" % V.pekko % Test,
  "org.apache.pekko" %% "pekko-actor-testkit-typed" % V.pekko % Test,
  "org.apache.pekko" %% "pekko-stream-testkit" % V.pekko % Test)

val pekkoHttp = Seq(
  "org.apache.pekko" %% "pekko-http" % V.pekko_http,
  "com.github.pjfanning" %% "pekko-http-jsoniter-scala" % V.pekko_jsoniter,
  "org.apache.pekko" %% "pekko-http-testkit" % V.pekko_http % Test)

val pekkoCluster = Seq(
  "org.apache.pekko" %% "pekko-cluster-sharding-typed" % V.pekko,
  "org.apache.pekko" %% "pekko-discovery" % V.pekko,
  "org.apache.pekko" %% "pekko-management" % V.pekko_management,
  "org.apache.pekko" %% "pekko-management-cluster-http" % V.pekko_management,
  // "org.apache.pekko" %% "pekko-http-spray-json" % pekkoHttpVersion, // todo: remove
  "org.apache.pekko" %% "pekko-management-cluster-bootstrap" % V.pekko_management,
  "org.apache.pekko" %% "pekko-discovery-kubernetes-api" % V.pekko_management)

val pekkoKafka = Seq(
  "org.apache.pekko" %% "pekko-connectors-kafka" % V.pekko_kafka)

val sttpClient = Seq(
  "com.softwaremill.sttp.client4" %% "core" % V.sttp,
  "com.softwaremill.sttp.client4" %% "okhttp-backend" % V.sttp,
  "com.softwaremill.sttp.client4" %% "slf4j-backend" % V.sttp,
  "com.softwaremill.sttp.client4" %% "jsoniter" % V.sttp,
  "com.github.plokhotnyuk.jsoniter-scala" %% "jsoniter-scala-macros" % V.jsoniter % "provided")

val logging = Seq(
  "ch.qos.logback" % "logback-classic" % V.logback)

val catsEffect = Seq(
  "org.typelevel" %% "cats-effect" % V.cats_effect,
  "org.typelevel" %% "cats-effect-testing-scalatest" % V.cats_effect_testing % Test)

lazy val root = (project in file("."))
  .settings(
    name := "apex-analytics")

addCommandAlias("testFast", "testOnly -- -l org.scalatest.tags.Slow")

lazy val commonDependencies = Seq(("org.scalatest" %% "scalatest" % "3.2.15" % Test))

lazy val commonSettings = Seq(
  scalacOptions ++= Seq(
    "-Ypartial-unification",
    "-feature",
    "-language:implicitConversions,higherKinds,existentials"),
  // we need to remove Maven Central cause that is proxied by Azure Artifactory already
  externalResolvers -= Resolver.mavenCentral,
  externalResolvers ++= Seq(
    "confluent" at "https://packages.confluent.io/maven",
    "apache" at "https://repo.maven.apache.org/maven2"),
  //  credentials += Credentials(Path.userHome / ".sbt" / ".credentials"),
  updateOptions := updateOptions.value.withLatestSnapshots(false),
  Test / testOptions += Tests.Argument("-oDF"),
  // do not build scala-docs when packaging via sbt native packager
  Compile / packageDoc / mappings := Nil)

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

lazy val `application` = (project in file("application"))
  .settings(
    name := "application",
    commonSettings,
    libraryDependencies ++= commonDependencies ++ pekkoCore ++ pekkoHttp ++
    pekkoCluster ++ catsEffect ++ Seq())
  .dependsOn(`common`, `f1-codec`)

lazy val `core` = (project in file("core"))
  .settings(
    name := "core",
    commonSettings,
    libraryDependencies ++= commonDependencies ++ Seq())

lazy val `common` = (project in file("common"))
  .settings(
    name := "common",
    commonSettings,
    libraryDependencies ++= commonDependencies ++ Seq(
      "org.scodec" % "scodec-core_3" % "2.3.0"))

lazy val `f1-codec` = (project in file("core/f1-codec"))
  .settings(
    name := "f1-codec",
    commonSettings,
    libraryDependencies ++= commonDependencies ++ Seq())
  .dependsOn(`common`)
