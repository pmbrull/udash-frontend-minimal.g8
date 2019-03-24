package $package$.views

import io.udash.StaticViewFactory
import $package$.LandingPageState

object LandingPageViewFactory extends StaticViewFactory[LandingPageState.type](() => new LandingPageView)
