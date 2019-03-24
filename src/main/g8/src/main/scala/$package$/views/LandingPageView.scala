package $package$.views

import io.udash.ContainerView

class LandingPageView extends ContainerView {
  import scalatags.JsDom.all._

  override def getTemplate: Modifier = div(
    h2("Welcome to the landing page!")
  )
}
