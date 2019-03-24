package $package$.views

import io.udash._
import $package$.RootState

object RootViewFactory extends StaticViewFactory[RootState.type](() => new RootView)

class RootView extends ContainerView {
  import scalatags.JsDom.all._

  override val getTemplate: Modifier =
    div(
      h1("Minimal"),
      childViewContainer
    )
}
