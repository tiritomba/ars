package domain.train;

import java.util.List;

public class MovementLine {

    private TrainUuid trainUuid;
    private List routePoints;

    protected MovementLine() {}

    private MovementLine(TrainUuid trainUuid, List routePoints) {
        this.trainUuid = trainUuid;
        this.routePoints = routePoints;
    }

    public TrainUuid getTrainUuid() {
        return trainUuid;
    }

    public boolean isPresent() {
        return true;
    }

    public List getRoutePoints() {
        return routePoints;
    }

    public static class Builder {
        private TrainUuid trainUuid;
        private List routePoints;

        public MovementLine build() {
            if (trainUuid == null) {
                return new NonExistingMovementLine();
            }
            else {
                return new MovementLine(trainUuid, routePoints);
            }
        }

        public Builder withTrainUuid(TrainUuid trainUuid) {
            this.trainUuid = trainUuid;
            return this;
        }

        public Builder withRoutePoints(List routePoints) {
            this.routePoints = routePoints;
            return this;
        }
    }
}
