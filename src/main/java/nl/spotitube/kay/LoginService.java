package nl.spotitube.kay;

import javax.security.auth.login.LoginException;

public class LoginService {

    public LoginService(){}

    public UserTokens login(Account account) throws LoginException {
        if("kay".equals(account.getUser()) && "password".equals(account.getPassword())){
            return new UserTokens("1234-1234-1234", "Kay Verhaegh");
        }else {
            throw new LoginException("Wrong credentials");
        }
    }
}
