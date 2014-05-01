import play.Project._

name := "play-angular-require-seed"

version := "2.2.3"

libraryDependencies ++= Seq(
  // WebJars infrastructure
  "org.webjars" % "webjars-locator" % "0.14",
  "org.webjars" %% "webjars-play" % "2.2.2",
  // WebJars dependencies
  "org.webjars" % "underscorejs" % "1.6.0-1",
  "org.webjars" % "jquery" % "1.11.0-1",
  "org.webjars" % "bootstrap" % "3.1.1-1" exclude("org.webjars", "jquery"),
  "org.webjars" % "angularjs" % "1.2.16" exclude("org.webjars", "jquery")
)

playScalaSettings

resolvers += "typesafe" at "http://repo.typesafe.com/typesafe/repo"

// This tells Play to optimize this file and its dependencies
requireJs += "main.js"

// The main config file
// See http://requirejs.org/docs/optimization.html#mainConfigFile
requireJsShim := "build.js"

// To completely override the optimization process, use this config option:
//requireNativePath := Some("node r.js -o name=main out=javascript-min/main.min.js")
