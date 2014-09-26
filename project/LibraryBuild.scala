import sbt._
import sbt.Keys._

import org.scalastyle.sbt.ScalastylePlugin


object LibraryBuild extends Build {

  lazy val library = Project(
    id = "Library",
    base = file("."),
    settings = Project.defaultSettings ++ ScalastylePlugin.Settings ++ Seq(
      name := "Library",
      organization := "edu.mjkay",
      version := "0.1-SNAPSHOT",
      scalaVersion := "2.11.2",
      // add other settings here
      libraryDependencies ++= Seq(
        "org.scalatest" % "scalatest_2.11" % "2.2.1" % "test" withSources() withJavadoc(),
        "org.scalacheck" %% "scalacheck" % "1.11.5" % "test" withSources() withJavadoc()
      )
    )
  )
}
