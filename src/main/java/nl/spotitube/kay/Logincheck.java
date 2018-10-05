package nl.spotitube.kay;

import javax.security.auth.login.LoginException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/login")
public class Logincheck {

    LoginService loginService = new LoginService();

    @POST
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public Response login(Account account){
        try{
            return Response.status(Response.Status.OK).entity(loginService.login(account)).build();
        }catch (LoginException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }

}
