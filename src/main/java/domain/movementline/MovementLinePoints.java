package domain.movementline;

import domain.train.route.RoutePart;

import java.util.ArrayList;

public class MovementLinePoints {
    private ArrayList<MovementLinePoint> routePoints;

    public MovementLinePoints() {
        routePoints = new ArrayList<>();
    }

    public ArrayList<MovementLinePoint> getSequenceOfPoints() {
        return routePoints;
    }

    public void addPointsForRoutePart(RoutePart routePart) {
        routePoints.add(new MovementLinePoint(routePart.endPoint()));
    }

}
