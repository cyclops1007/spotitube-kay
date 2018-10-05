package nl.spotitube.kay;

import javax.naming.AuthenticationException;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


@Path("/playlists")
public class Playlistcheck {

    PlaylistService playlistService = new PlaylistService();

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response playlist(@QueryParam("token") String userToken){
        try {
            return Response.status(Response.Status.OK).entity(playlistService.getPlaylists(userToken)).build();
        }catch (AuthenticationException e) {
            return Response.status(Response.Status.UNAUTHORIZED).build();
        }
    }

//    @DELETE
//    @Path("{id}")
//    public Response playlistDelete(@PathParam("id") int id){
//       // if()
//    }

}
