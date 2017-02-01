/**
 * It does nothing, it returns a relevant value for the test and it records facts about the test. In addition it
 * checks the behaviour of the test. It has the highest coupling between test and production code.
 */
public class AcceptingAuthorizerVerificationMock implements Authorizer {
    public boolean authorizeWasCalled = false;

    public Boolean authorize(String username, String password) {
        authorizeWasCalled = true;
        return true;
    }

    public boolean verify() {
        return authorizeWasCalled;
    }
}