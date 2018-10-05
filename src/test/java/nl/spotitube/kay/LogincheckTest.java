package nl.spotitube.kay;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.runners.MockitoJUnitRunner;

import javax.security.auth.login.LoginException;
import javax.ws.rs.core.Response;


import static org.junit.Assert.*;

//MOCKITO NEEDED
//Library genaamt cxf wordt door tomcat gebruikt
@RunWith(MockitoJUnitRunner.class)
public class LogincheckTest {

@Mock
    private LoginService loginService;

@InjectMocks
    private Logincheck sut;

    @Test
    public void testStatusOkOnLoginSuccess()throws LoginException {
        UserTokens token = new UserTokens("","");
        Mockito.when(loginService.login(Mockito.any())).thenReturn(token);
        Account account = new Account("","");
        Response loginResponse = sut.login(account);

        assertEquals(Response.Status.OK.getStatusCode(), loginResponse.getStatus());
        assertEquals(token, loginResponse.getEntity());

    }

    @Test
    public void testStatusUnauthorizedOnLoginFail()throws LoginException {

    }

}