package domain.movementline;

import domain.train.route.RoutePartEndPoint;
import sun.reflect.generics.reflectiveObjects.NotImplementedException;

public class MovementLinePoint {

    private final RoutePartEndPoint infrastructureElement;

    public MovementLinePoint(RoutePartEndPoint routePartEndPoint) {
        infrastructureElement = routePartEndPoint;
    }

    public RoutePartEndPoint getInfrastructureElement() {
        throw new NotImplementedException();
    }
}
