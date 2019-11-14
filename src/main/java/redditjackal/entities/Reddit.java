package redditjackal.entities;

import redditjackal.exceptions.RedditorNotFoundException;
import redditjackal.exceptions.WrongCredentialsException;
import redditjackal.requests.AccessToken;
import redditjackal.requests.Link;
import redditjackal.requests.RedditRequest;


import org.json.JSONObject;

import java.util.*;

//import org.apache.commons.codec.binary.Base64;


public class Reddit {
    private AccessToken accessToken;
    private BotOwner admin;

    private static Map<String, Redditor> cashedRedditors = new HashMap<>();
    public static Map<String, Redditor> getCashedRedditors() {
        return cashedRedditors;
    }

    public static Map<String, Subreddit> cachedSubreddits = new HashMap<>();
    public static Map<String, Subreddit> getCachedSubreddits()  {return cachedSubreddits;}

    public Reddit(String username, String password, String appId, String appSecret) throws WrongCredentialsException  {
        accessToken = new AccessToken(username, password, appId, appSecret);
        accessToken.renew();
        users = new ArrayList<>();
        activeSubreddits = new HashMap<>();
        try  {
            admin = new BotOwner(this, accessToken.getUsername());
        }
        catch (RedditorNotFoundException e)  {
            throw new WrongCredentialsException();
        }
    }

    public AccessToken getAccessToken()  {return accessToken;}

    private ArrayList<Redditor> users;
    private HashMap<String, Subreddit> activeSubreddits;

    public static void main(String[] args) throws Exception  {

    }


    //API
    public Subreddit getSubreddit(String name)  {
        if (cachedSubreddits.containsKey(name))  {
            return cachedSubreddits.get(name);
        }
        else  {
            Subreddit result = new Subreddit(this, name);
            cachedSubreddits.put(name, result);
            return result;
        }
    }

    public Redditor getRedditor(String username) throws RedditorNotFoundException {
        if (cashedRedditors.containsKey(username))  {
            return cashedRedditors.get(username);
        }
        else  {
            Redditor result = new Redditor(this, username);
            cashedRedditors.put(username, result);
            return result;
        }
    }

    public BotOwner getMe() {return admin;}

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
