name := "$name;format="normalize"$"

inThisBuild(Seq(
  version := "0.7.0-SNAPSHOT",
  scalaVersion := "$scala_version$",
  scalacOptions ++= Seq(
    "-feature",
    "-deprecation",
    "-unchecked",
    "-language:implicitConversions",
    "-language:existentials",
    "-language:dynamics",
    "-Xfuture",
    "-Xfatal-warnings",
    "-Xlint:_,-missing-interpolator,-adapted-args"
  ),
))

val generatedDir = file("generated")

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    mainClass := Some("$package$.JSLauncher"),
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Dependencies.frontendDeps.value,

    // Target files for Scala.js plugin
    Compile / fastOptJS / artifactPath := generatedDir / "minimal.js",
    Compile / fullOptJS / artifactPath := generatedDir / "minimal.js",
    Compile / packageJSDependencies / artifactPath := generatedDir / "minimal-deps.js",
    Compile / packageMinifiedJSDependencies / artifactPath := generatedDir / "minimal-deps.js",
  )

