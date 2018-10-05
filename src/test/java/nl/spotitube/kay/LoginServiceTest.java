package nl.spotitube.kay;

import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import javax.security.auth.login.LoginException;

public class LoginServiceTest {

    private LoginService sut; // System UnderTest

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Before
    public void setUp()throws Exception{
        sut = new LoginService();
    }

    @Test
    public void testIfLoginSuccess()throws LoginException {
        Account account = new Account("","");
        UserTokens token = new UserTokens("","");

    }

}
