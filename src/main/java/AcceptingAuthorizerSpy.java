/**
 * Does nothing and returns something useful for the test. The spy also remembers how and if it was called.
 */
public class AcceptingAuthorizerSpy implements Authorizer {
    public boolean authorizeWasCalled = false;

    public Boolean authorize(String username, String password) {
        authorizeWasCalled = true;
        return true;
    }
}