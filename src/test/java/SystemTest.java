import org.junit.Test;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class SystemTest {
    @Test
    public void newlyCreatedSystem_hasNoLoggedInUsers() {
        System system = new System(new DummyAuthorizer());
        assertThat(system.loginCount(), is(0));
    }
}
