package redditjackal.entities;

import redditjackal.exceptions.WrongCredentialsException;
import redditjackal.requests.AccessToken;
import redditjackal.requests.Link;
import redditjackal.requests.RedditRequest;


import org.json.JSONObject;

import java.util.*;

//import org.apache.commons.codec.binary.Base64;


public class Reddit {
    private AccessToken accessToken;

    public Reddit(String username, String password, String appId, String appSecret) throws WrongCredentialsException  {
        accessToken = new AccessToken(username, password, appId, appSecret);
        accessToken.renew();
        users = new ArrayList<>();
        activeSubreddits = new HashMap<>();
    }

    public AccessToken getAccessToken()  {return accessToken;}

    private ArrayList<Redditor> users;
    private HashMap<String, Subreddit> activeSubreddits;

    public static void main(String[] args) throws Exception  {

    }


    //API
    public Subreddit getSubreddit(String name)  {return new Subreddit(this, name);}

    public Redditor getRedditor(String username)  {
        return new Redditor(this, username);
    }

    public BotOwner getMe()  {return new BotOwner(this, accessToken.getUsername());}

    //SIMPLE GETTERS: START
    public ArrayList<Redditor> getRedditors()  {
        return users;
    }

    public HashMap<String, Subreddit> getActiveSubreddits()  {
        return activeSubreddits;
    }

    //SIMPLE GETTERS: END


    //POST METHODS
    public  void postComment(String thing_id, String commentBody) throws Exception  {
        String params = "api_type=json&thing_id=" + thing_id + "&text=" + commentBody;

        RedditRequest postCommentRequest = new RedditRequest(new java.net.URL(Link.POST_COMMENT), accessToken,
                        RedditRequest.REQUEST_TYPE.POST, params);
        String inputString = postCommentRequest.send().getResponse();
        System.out.println(inputString);
    }
}


//ошибки когда постишь коммент: 403: если вместо Bearer - Basic; 401 - Unauthorized - когда Bearer, но access_token неверный
