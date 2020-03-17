

ThisBuild / scalaVersion := "2.13.0"
ThisBuild / version := "0.1.0-SNAPSHOT"
ThisBuild / organization := "com.example"
ThisBuild / organizationName := "example"

scalacOptions += "-Ymacro-annotations"

lazy val root = (project in file("."))
  .settings(
    name := "pfp-scala",
    libraryDependencies ++= Seq(
      compilerPlugin(
        "org.typelevel" %% "kind-projector" % "0.11.0" cross CrossVersion.full
      ),
      compilerPlugin(
        "org.augustjune" %% "context-applied" % "0.1.2"
      ),
      "org.typelevel" %% "cats-core" % "2.1.0",
      "org.typelevel" %% "cats-effect" % "2.1.0",
      "dev.profunktor" %% "console4cats" % "0.8.1",
      "org.manatki" %% "derevo-cats" % "0.10.5",
      "org.manatki" %% "derevo-cats-tagless" % "0.10.5",
      "co.fs2" %% "fs2-core" % "2.2.2",
      "com.olegpy" %% "meow-mtl-core" % "0.4.0",
      "com.olegpy" %% "meow-mtl-effects" % "0.4.0",
      "io.estatico" %% "newtype" % "0.4.3",
      "eu.timepit" %% "refined" % "0.9.12",
      "com.github.julien-truffaut" %% "monocle-core" % "2.0.1",
      "com.github.julien-truffaut" %% "monocle-macro" % "2.0.1"
    )
  )

// See https://www.scala-sbt.org/1.x/docs/Using-Sonatype.html for instructions on how to publish to Sonatype.
