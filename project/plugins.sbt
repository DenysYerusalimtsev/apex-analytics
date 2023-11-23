resolvers ++= Resolver.sonatypeOssRepos("releases")

addDependencyTreePlugin

// Test Coverage & Sonar
addSbtPlugin("org.scoverage" % "sbt-scoverage" % "2.0.7")
addSbtPlugin("com.sonar-scala" % "sbt-sonar" % "2.3.0")

// Packager for Akka Applications
addSbtPlugin("com.github.sbt" %% "sbt-native-packager" % "1.9.16")

// Protocol buffers codegenerator
libraryDependencies += "com.thesamet.scalapb" %% "compilerplugin" % "0.11.11"
addSbtPlugin("com.thesamet" % "sbt-protoc" % "1.0.6")

// JMH benchmark
addSbtPlugin("pl.project13.scala" % "sbt-jmh" % "0.4.3")

// scalaxb XML codegenerator
addSbtPlugin("org.scalaxb" % "sbt-scalaxb" % "1.9.0")
