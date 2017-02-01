/**
 * A dummy does nothing, returns 'nothing' and no one cares about it.
 */
public class DummyAuthorizer implements Authorizer {
    public Boolean authorize(String username, String password) {
        return null;
    }
}
