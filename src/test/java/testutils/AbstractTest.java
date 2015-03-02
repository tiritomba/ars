package testutils;

import org.junit.Before;
import org.mockito.MockitoAnnotations;

public abstract class AbstractTest {

    @Before
    public void initMocks() {
        MockitoAnnotations.initMocks(this);
    }
}
