name := "scalatest-aa-examples"

version := "1.0"

scalaVersion := "2.12.3"

libraryDependencies ++= Seq(
  "org.scalacheck" %% "scalacheck" % "1.13.4" % "test",
  "org.scalatest" %% "scalatest" % "3.0.1" % "test",
  "org.scalactic" %% "scalactic" % "3.0.1" % "test",
  "org.mockito" % "mockito-all" % "1.8.4" % "test"
)

scalacOptions += "-deprecation"
