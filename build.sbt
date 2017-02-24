name := "deep-learning-from-scratch"

version := "0.1"

scalaVersion in Global := "2.12.1"

libraryDependencies in Global ++= Seq(
  "org.scalatest" %% "scalatest" % "3.0.1" % "test"
)

lazy val ch3 = project in file("ch3")

