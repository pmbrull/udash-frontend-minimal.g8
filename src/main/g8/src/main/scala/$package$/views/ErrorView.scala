package $package$.views

import io.udash._
import $package$.ErrorState

object ErrorViewFactory extends StaticViewFactory[ErrorState.type](() => new ErrorView)

class ErrorView extends FinalView {
  import scalatags.JsDom.all._

  override val getTemplate: Modifier =
    h3("URL not found!")
}
