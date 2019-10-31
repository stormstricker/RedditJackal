package redditjackal.entities;

import redditjackal.requests.AccessToken;
import redditjackal.requests.Link;
import redditjackal.requests.RedditRequest;


import org.json.JSONObject;

import java.nio.charset.StandardCharsets;
import java.util.*;

//import org.apache.commons.codec.binary.Base64;


public class Reddit {
    public AccessToken accessToken;

    private static Reddit reddit;

    public static Reddit getReddit(String username, String password, String appId, String appSecret)  {
        if (reddit == null)  {
            reddit = new Reddit(username, password, appId, appSecret);
        }

        return reddit;
    }

    public static Reddit getReddit() throws NotLoggedInException  {
        if (reddit == null)  {
                throw new NotLoggedInException();
        }
        return reddit;
    }

    private Reddit(String username, String password, String appId, String appSecret)  {
        accessToken = new AccessToken(username, password, appId, appSecret);
        accessToken.renew();
       // accessToken.renew();

        users = new ArrayList<Redditor>();
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

    //SIMPLE GETTERS: START
    public ArrayList<Redditor> getRedditors()  {
        return users;
    }

    public HashMap<String, Subreddit> getActiveSubreddits()  {
        return activeSubreddits;
    }

    //SIMPLE GETTERS: END


    //WRITE METHODS
    public  void postComment(String thing_id, String commentBody) throws Exception  {
        String bodyParameters = "api_type=json&thing_id=" + thing_id + "&text=" + commentBody;
        byte[] bodyData = bodyParameters.getBytes(StandardCharsets.UTF_8 );

        RedditRequest postCommentRequest = new RedditRequest(new java.net.URL(Link.POST_COMMENT), accessToken,
                        RedditRequest.REQUEST_TYPE.WRITE, bodyData);
        String inputString = postCommentRequest.send().getResponse();
        JSONObject jsonObject = new JSONObject(inputString);
        System.out.println(inputString);

    }


}


//ошибки когда постишь коммент: 403: если вместо Bearer - Basic; 401 - Unauthorized - когда Bearer, но access_token неверный
