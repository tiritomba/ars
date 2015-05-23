package application;

import domain.train.TrainId;

public interface TrainUpdatedEventService {
    void registerTrainUpdatedEvent(TrainId trainId);
}
