package domain.movementline;

import domain.train.TrainId;

import java.util.List;

public class MovementLine {

    private TrainId trainId;
    private List<MovementLinePoint> movementLinePoints;

    protected MovementLine() {}

    private MovementLine(TrainId trainId, List routePoints) {
        this.trainId = trainId;
        this.movementLinePoints = routePoints;
    }

    public TrainId getTrainId() {
        return trainId;
    }

    public boolean isPresent() {
        return true;
    }

    public List getMovementLinePoints() {
        return movementLinePoints;
    }

    public static class Builder {
        private TrainId trainId;
        private List routePoints;

        public MovementLine build() {
            if (trainId == null) {
                return new NonExistingMovementLine();
            }
            else {
                return new MovementLine(trainId, routePoints);
            }
        }

        public Builder withTrainUuid(TrainId trainId) {
            this.trainId = trainId;
            return this;
        }

        public Builder withRoutePoints(List routePoints) {
            this.routePoints = routePoints;
            return this;
        }
    }
}
