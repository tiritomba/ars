package domain.movementline;

import domain.train.route.RoutePartEndPoint;
import org.junit.Test;
import org.mockito.Mock;
import testutils.AbstractTest;

import static org.junit.Assert.assertEquals;

public class MovementLinePointTest extends AbstractTest {

    @Mock
    RoutePartEndPoint endPoint;

    @Test
    public void givenASignal_createAMovementLinePoint() throws Exception {
        MovementLinePoint mlPoint = new MovementLinePoint(endPoint);

        assertEquals(endPoint, mlPoint.getInfrastructureElement());
    }
}