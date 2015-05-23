package domain.movementline;

import domain.train.route.RoutePart;
import domain.train.route.RoutePartEndPoint;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import testutils.AbstractTest;

import static com.google.common.collect.Lists.newArrayList;
import static org.mockito.Mockito.when;

public class MovementLinePointsTest extends AbstractTest {

    MovementLinePoints movementLinePoints;

    @Mock
    MovementLinePoint mlPoint;

    @Mock
    RoutePart routePart1, routePart2, routePartEndingOnDeadEnd;

    @Mock
    RoutePartEndPoint toSignal1, toSignal2, deadEnd;

    @Before
    public void setup() {
        movementLinePoints = new MovementLinePoints();
    }

    @Test
    public void givenOneRoutePart_thenTheMovementLinePointsContainsTheToSignalOfThePart() throws Exception {
        when(routePart1.endPoint()).thenReturn(toSignal1);
        movementLinePoints.addPointsForRoutePart(routePart1);

        Assert.assertEquals(newArrayList(toSignal1), movementLinePoints.getSequenceOfPoints());
    }

    @Test
    public void givenTwoRouteParts_thenTheMovementLinePointsContainsTheToSignalsOfTheParts() throws Exception {
        when(routePart1.endPoint()).thenReturn(toSignal1);
        when(routePart2.endPoint()).thenReturn(toSignal2);
        movementLinePoints.addPointsForRoutePart(routePart1);
        movementLinePoints.addPointsForRoutePart(routePart2);

        Assert.assertEquals(newArrayList(toSignal1, toSignal2), movementLinePoints.getSequenceOfPoints());
    }

    @Test
    public void givenRoutePartEndingOnDeadEnd_thenTheMovementLinePointsContainsTheDeadEnd() throws Exception {
        when(routePartEndingOnDeadEnd.endPoint()).thenReturn(deadEnd);
        movementLinePoints.addPointsForRoutePart(routePartEndingOnDeadEnd);

        Assert.assertEquals(newArrayList(deadEnd), movementLinePoints.getSequenceOfPoints());
    }

}