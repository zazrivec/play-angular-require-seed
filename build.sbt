import PlayKeys._
import com.typesafe.sbt.web.SbtWeb.autoImport.WebJs._

lazy val root = (project in file(".")).enablePlugins(PlayScala)

name := "play-angular-require-seed"

version := "2.3.0-RC2"

scalaVersion := "2.10.4"

libraryDependencies ++= Seq(
  // WebJars dependencies
  "org.webjars" % "requirejs" % "2.1.11-1",
  "org.webjars" % "underscorejs" % "1.6.0-3",
  "org.webjars" % "jquery" % "1.11.1",
  "org.webjars" % "bootstrap" % "3.1.1-1" exclude("org.webjars", "jquery"),
  "org.webjars" % "angularjs" % "1.2.16-2" exclude("org.webjars", "jquery")
)

// sbt-web

pipelineStages := Seq(rjs, digest/*, gzip*/)

// RequireJS, https://github.com/sbt/sbt-rjs#sbt-rjs

//RjsKeys.mainModule := "main"

//RjsKeys.webJarModuleIds := Set("requirejs", "underscorejs", "jquery", "bootstrap", "angular", "angular-route", "angular-cookies", "jsRoutes")


// Cannot use a simple build.js

//val pathMap = Map("jsRoutes" -> j"empty:") ++ (RjsKeys.buildProfile.value.get("paths").getOrElse(Seq.empty[String]))

//val paths = pathMap.toJS

//RjsKeys.buildProfile := Map("paths" -> paths) // ++  RjsKeys.webJarModuleIds.value.map(m => m -> j"empty:").toMap.toJS

// The main config file
// See http://requirejs.org/docs/optimization.html#mainConfigFile
//requireJsShim := "build.js"
