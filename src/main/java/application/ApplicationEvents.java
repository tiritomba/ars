package application;

import domain.trainupdate.TrainUpdatedEvent;

public interface ApplicationEvents {

    void trainWasUpdatedEvent(TrainUpdatedEvent event);
}
