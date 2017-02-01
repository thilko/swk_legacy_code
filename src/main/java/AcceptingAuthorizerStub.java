/**
 * A stub does nothing but returns a fixed value which is relevant in the test context. It has a slightly higher
 * coupling to tests.
 */
public class AcceptingAuthorizerStub {
        public Boolean authorize(String username, String password) {
            return true;
        }
}
