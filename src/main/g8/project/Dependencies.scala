import org.scalajs.sbtplugin.ScalaJSPlugin.autoImport._
import org.portablescala.sbtplatformdeps.PlatformDepsPlugin.autoImport._
import sbt._

object Dependencies {
  val udashCoreVersion = "$udash_version$"
  val udashJQueryVersion = "$udash_jquery_version$"

  val frontendDeps = Def.setting(Seq[ModuleID](
    "io.udash" %%% "udash-core-frontend" % udashCoreVersion,
    "io.udash" %%% "udash-css-frontend" % udashCoreVersion,
    "io.udash" %%% "udash-jquery" % udashJQueryVersion
  ))
}