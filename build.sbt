val ScalatraVersion = "2.7.0"

organization := "com.ru.waka"

name := "scalatra_getting_started"

version := "0.1.0-SNAPSHOT"

scalaVersion := "2.12.5"

libraryDependencies ++= Seq(
  "org.scalatra" %% "scalatra" % ScalatraVersion,
  "org.scalatra" %% "scalatra-json" % ScalatraVersion,
  "org.scalatra" %% "scalatra-swagger" % ScalatraVersion,
  "org.json4s"   %% "json4s-jackson" % "3.6.9",
  "javax.servlet" % "javax.servlet-api" % "4.0.1" % "provided"
)

enablePlugins(JettyPlugin)
