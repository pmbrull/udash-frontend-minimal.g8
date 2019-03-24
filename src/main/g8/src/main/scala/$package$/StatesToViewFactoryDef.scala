package $package$

import io.udash._
import $package$.views._

class StatesToViewFactoryDef extends ViewFactoryRegistry[RoutingState] {
  def matchStateToResolver(state: RoutingState): ViewFactory[_ <: RoutingState] = state match {
    case RootState => RootViewFactory
    case LandingPageState => LandingPageViewFactory
    case _ => ErrorViewFactory
  }
}
