ThisBuild / scalaVersion := $scala_version$

lazy val root = (project in file("."))
  .enablePlugins(ScalaJSPlugin)
  .settings(
    name := "$name;format="normalize"$",
    mainClass := Some("$package$.JSLauncher"),
    scalaJSUseMainModuleInitializer := true,

    libraryDependencies ++= Dependencies.frontendDeps.value,

    // Target files for Scala.js plugin
    Compile / fastOptJS / artifactPath := generatedDir / "minimal.js",
    Compile / fullOptJS / artifactPath := generatedDir / "minimal.js",
    Compile / packageJSDependencies / artifactPath := generatedDir / "minimal-deps.js",
    Compile / packageMinifiedJSDependencies / artifactPath := generatedDir / "minimal-deps.js",
  )

