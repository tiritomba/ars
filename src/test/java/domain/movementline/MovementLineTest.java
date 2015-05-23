package domain.movementline;

import com.google.common.collect.Lists;
import domain.train.TrainId;
import org.junit.Test;
import org.mockito.Mock;
import testutils.AbstractTest;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

    public class MovementLineTest extends AbstractTest {

    private final String TRAINUUID = "abcde";

    @Mock
    TrainId trainId;

    @Mock
    MovementLinePoint movementLinePoint1, movementLinePoint2;

    @Test
    public void emptyMovementLineNotPresent() {
        MovementLine movementLine = new MovementLine.Builder().build();

        assertThat(movementLine.isPresent()).isFalse();
    }

    @Test
    public void movementLineContainingARoutePointIsPresent() {
        when(trainId.toString()).thenReturn(TRAINUUID);

        MovementLine movementLine = new MovementLine.Builder().withTrainUuid(trainId)
                .withRoutePoints(Lists.newArrayList(movementLinePoint1))
                .build();

        assertThat(movementLine.isPresent()).isTrue();
    }

    @Test
    public void movementLineContainingExactlyOneRoutePoint() {
        when(trainId.toString()).thenReturn(TRAINUUID);

        MovementLine movementLine = new MovementLine.Builder().withTrainUuid(trainId)
                .withRoutePoints(Lists.newArrayList(movementLinePoint1))
                .build();

        assertThat(movementLine.getTrainId().toString()).isEqualTo(TRAINUUID);
        assertThat(movementLine.getMovementLinePoints()).containsExactly(movementLinePoint1);
    }

    @Test
    public void movementLineWithMultipleRoutePoints() {
        when(trainId.toString()).thenReturn(TRAINUUID);

        MovementLine movementLine = new MovementLine.Builder().withTrainUuid(trainId)
                .withRoutePoints(Lists.newArrayList(movementLinePoint1, movementLinePoint2))
                .build();

        assertThat(movementLine.getTrainId().toString()).isEqualTo(TRAINUUID);
        assertThat(movementLine.getMovementLinePoints()).containsExactly(movementLinePoint1, movementLinePoint2);
    }

}