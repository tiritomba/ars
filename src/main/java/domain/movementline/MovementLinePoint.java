package domain.movementline;

import domain.train.route.RoutePartEndPoint;

public class MovementLinePoint {

    private final RoutePartEndPoint infrastructureElement;

    public MovementLinePoint(RoutePartEndPoint routePartEndPoint) {
        infrastructureElement = routePartEndPoint;
    }

    public RoutePartEndPoint getInfrastructureElement() {
        return infrastructureElement;
    }
}
