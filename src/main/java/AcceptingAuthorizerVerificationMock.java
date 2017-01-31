public class AcceptingAuthorizerVerificationMock implements Authorizer {
    public boolean authorizeWasCalled = false;

    public Boolean authorize(String username, String password) {
        authorizeWasCalled = true;
        return true;
    }

    public boolean verify() {
        return authorizedWasCalled;
    }
}