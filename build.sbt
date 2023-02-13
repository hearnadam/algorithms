ThisBuild / scalaVersion := "2.13.10"
ThisBuild / organization := "com.hearnadam"

lazy val algorithms = (project in file(".")).settings(
    name := "Algorithms",
    libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % "test"
  )