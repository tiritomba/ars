package domain.movementline;

import domain.train.route.RoutePartEndPoint;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import testutils.AbstractTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class MovementLinePointTest extends AbstractTest {

    @Mock
    RoutePartEndPoint signal;

    @Before
    public void setUp() throws Exception {

    }

    @Test
    public void givenASignal_createAMovementLinePoint() throws Exception {

        when(signal.isSignal()).thenReturn(true);
        MovementLinePoint mlPoint = new MovementLinePoint(signal);

        assertEquals(signal, mlPoint.getInfrastructureElement());
    }
}