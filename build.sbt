organization := "io.amnesialab"

name := "amnesialab-doc"

val Scala211 = "2.11.9"

scalaVersion := Scala211

crossScalaVersions := Seq(Scala211)

libraryDependencies ++= Seq(
  "io.amnesialab" %% "amnesialab" % "6.2",
  "io.amnesialab" %% "amnesialab-scalaz" % "6.2",
  "io.amnesialab" %% "amnesialab-cats" % "6.2",
  "io.amnesialab" %% "amnesialab-monocle" % "6.2"
)
