/**
 * Fakes are like simulator, they simulate the behaviour of the real object.
 */
public class AuthorizerFake implements Authorizer {
    @Override
    public Boolean authorize(final String username, final String password) {
        return null;
    }
}
