import sbt._, Keys._

/**
 * For projects that are not to be published.
 */
object NoPublish extends AutoPlugin {
  override def requires = plugins.JvmPlugin

  override def projectSettings = Seq(
    publishArtifact := false,
    publish := {},
    publishLocal := {}
  )
}

object Publish extends AutoPlugin {
  import bintray.BintrayKeys._

  override def trigger = allRequirements
}
