import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class LoginScreenTest {

    @Test
    public void testSuccessfullLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("john", "password123"));
    }

    @Test
    public void testFailedLogin() {
        LoginScreen loginScreen = new LoginScreen();
        assertTrue(loginScreen.login("john", "wrongpassword"));
    }

}
