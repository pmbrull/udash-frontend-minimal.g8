package $package$

import io.udash._

sealed abstract class RoutingState(val parentState: Option[ContainerRoutingState]) extends State {
  type HierarchyRoot = RoutingState

  def url(implicit application: Application[RoutingState]): String = "#" + application.matchState(this).value
}

sealed abstract class ContainerRoutingState(parentState: Option[ContainerRoutingState]) extends RoutingState(parentState) with ContainerState
sealed abstract class FinalRoutingState(parentState: Option[ContainerRoutingState]) extends RoutingState(parentState) with FinalState

object RootState extends ContainerRoutingState(None)
object ErrorState extends FinalRoutingState(Some(RootState))
case object LandingPageState extends FinalRoutingState(Some(RootState))
