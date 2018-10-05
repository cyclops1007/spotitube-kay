package nl.spotitube.kay;

import javax.naming.AuthenticationException;

public class PlaylistService {

    private String playlists = "{\n" +
            "  \"playlists\" :[\n" +
            "               {\n" +
            "                  \"id\"    : 1,\n" +
            "                  \"name\"  : \"Death metal\",\n" +
            "                  \"owner\" : true,\n" +
            "                  \"tracks\": []\n" +
            "               },\n" +
            "               {\n" +
            "                  \"id\"    : 2,\n" +
            "                  \"name\"  : \"Pop\",\n" +
            "                  \"owner\" : false,\n" +
            "                  \"tracks\": []\n" +
            "               }\n" +
            "              ],\n" +
            "  \"length\"  :123445}";

    public PlaylistService() {
    }

    public String getPlaylists(String userTokens)throws AuthenticationException{
        if("1234-1234-1234".equals(userTokens)){
            return playlists;
        }
        else{
            throw new AuthenticationException("Wrong Token");
        }
    }
}
