package domain.movementline;

import domain.train.route.RoutePart;
import domain.train.route.RoutePartEndPoint;

import java.util.ArrayList;

public class MovementLinePoints {
    private ArrayList<MovementLinePoint> routePoints;

    public MovementLinePoints() {
        routePoints = new ArrayList<>();
    }

    public ArrayList<RoutePartEndPoint> getSequenceOfPoints() {
        return convertRoutePointsToSequenceOfPoints();
    }

    public void addPointsForRoutePart(RoutePart routePart) {
        routePoints.add(new MovementLinePoint(routePart.endPoint()));
    }

    private ArrayList<RoutePartEndPoint> convertRoutePointsToSequenceOfPoints() {
        ArrayList<RoutePartEndPoint> pointSequence = new ArrayList<>();
        for (MovementLinePoint mlPoint : routePoints) {
            pointSequence.add(mlPoint.getInfrastructureElement());
        }
        return pointSequence;
    }
}
