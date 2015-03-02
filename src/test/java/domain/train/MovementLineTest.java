package domain.train;

import com.google.common.collect.Lists;
import org.junit.Test;
import org.mockito.Mock;
import testutils.AbstractTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

public class MovementLineTest extends AbstractTest {

    private final String TRAINUUID = "abcde";

    @Mock
    TrainUuid trainUuid;

    @Mock
    RoutePoint routePoint1, routePoint2;

    @Test
    public void emptyMovementLineNotPresent() {
        MovementLine movementLine = new MovementLine.Builder().build();

        assertThat(movementLine.isPresent()).isFalse();
    }

    @Test
    public void movementLineContainingOneRoutePoint() {
        when(trainUuid.toString()).thenReturn(TRAINUUID);

        MovementLine movementLine = new MovementLine.Builder().withTrainUuid(trainUuid)
                                                                .withRoutePoints(Lists.newArrayList(routePoint1))
                                                                .build();

        assertThat(movementLine.isPresent()).isTrue();
        assertThat(movementLine.getTrainUuid().toString()).isEqualTo(TRAINUUID);
        assertThat(movementLine.getRoutePoints()).containsExactly(routePoint1);
    }

    @Test
    public void movementLineWithMultipleRoutePoints() {
        when(trainUuid.toString()).thenReturn(TRAINUUID);

        MovementLine movementLine = new MovementLine.Builder().withTrainUuid(trainUuid)
                .withRoutePoints(Lists.newArrayList(routePoint1, routePoint2))
                .build();

        assertThat(movementLine.isPresent()).isTrue();
        assertThat(movementLine.getTrainUuid().toString()).isEqualTo(TRAINUUID);
        assertThat(movementLine.getRoutePoints()).containsExactly(routePoint1, routePoint2);
    }

}