package redditjackal.entities;

import redditjackal.exceptions.RedditorNotFoundException;
import redditjackal.exceptions.WrongCredentialsException;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsDataJson;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsJson;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingDataJson;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingJson;
import redditjackal.requests.AccessToken;
import redditjackal.requests.Link;
import redditjackal.requests.RedditRequest;
import redditjackal.requests.reddit.CommentByIdRequest;
import redditjackal.requests.reddit.PostByIdRequest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

//import org.apache.commons.codec.binary.Base64;


public class Reddit {
    private AccessToken accessToken;
    private BotOwner admin;

    private static Map<String, Redditor> cachedRedditors = new LinkedHashMap<>();
    public static Map<String, Redditor> getCachedRedditors() {
        return cachedRedditors;
    }

    private static Map<String, Subreddit> cachedSubreddits = new LinkedHashMap<>();
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


    public Comment getCommentById(String id)  {
        CommentByIdRequest request = CommentByIdRequest.builder(accessToken).setId(id).build();
        RedditorCommentsJson commentJson = request.execute();

        if (!id.startsWith("t1"))  {
            return null;
        }

        try  {
            RedditorCommentsDataJson dataJson = commentJson.getData().getChildren().get(0).getData();
            System.out.println();

            Redditor author = getRedditor(dataJson.getAuthor());
            return new Comment(author, dataJson);
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }

    }

    public Post getPostById(String id)  {
        PostByIdRequest request = PostByIdRequest.builder(accessToken).setId(id).build();
        PostsListingJson postJson = request.execute();

        try  {
            PostsListingDataJson dataJson = postJson.getData().getChildren().get(0).getData();
            System.out.println();

            Redditor author = getRedditor(dataJson.getAuthor());
            return new Post(author, dataJson);
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }
    }


    //API
    public Subreddit getSubreddit(String name)  {
        if (cachedSubreddits.containsKey(name))  {
            return cachedSubreddits.get(name);
        }
        else  {
            Subreddit result = new Subreddit(this, name);
            if (cachedSubreddits.size() >= 15)  {
                //remove first entry
                String oldSubreddit = cachedSubreddits.keySet().iterator().next();
                cachedSubreddits.remove(oldSubreddit);
            }
            cachedSubreddits.put(name, result);

            return result;
        }
    }

    public Redditor getRedditor(String username) throws RedditorNotFoundException {
        if (cachedRedditors.containsKey(username))  {
            return cachedRedditors.get(username);
        }
        else  {
            Redditor result = new Redditor(this, username);
            if (cachedRedditors.size() >= 15)  {
                //remove first entry
                String oldRedditor = cachedRedditors.keySet().iterator().next();
                cachedRedditors.remove(oldRedditor);
            }
            cachedRedditors.put(username, result);

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
