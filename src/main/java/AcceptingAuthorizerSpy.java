public class AcceptingAuthorizerSpy implements Authorizer {
    public boolean authorizeWasCalled = false;

    public Boolean authorize(String username, String password) {
        authorizeWasCalled = true;
        return true;
    }
}