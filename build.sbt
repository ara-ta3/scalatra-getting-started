val ScalatraVersion = "2.7.1"

organization := "com.ru.waka"

name := "scalatra_getting_started"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.13.4"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.scalatra" %% "scalatra-swagger" % ScalatraVersion,
  "org.json4s"   %% "json4s-jackson" % "3.6.10",
  "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided"
)

enablePlugins(JettyPlugin)
