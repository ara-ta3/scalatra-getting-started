val ScalatraVersion = "2.5.0"

organization := "com.ru.waka"

name := "scalatra_getting_started"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.json4s"   %% "json4s-jackson" % "3.5.2",
  "javax.servlet" % "javax.servlet-api" % "3.1.0" % "provided"
)

enablePlugins(JettyPlugin)
