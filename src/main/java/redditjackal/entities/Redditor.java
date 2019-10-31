package redditjackal.entities;

import java.util.ArrayList;
import java.util.HashMap;

//TODO: check if user is deleted

public class Redditor extends Actor {
    CommentHistory commentHistory;
    PostHistory postHistory;
    SubredditHistory subredditHistory;

    private String link;

    private String username;
    private long reputation;
    //date


    private HashMap<String, String> flairs;

    private ArrayList<String> interests;
    private ArrayList<String> favSubreddits;

    //getters
    public CommentHistory commentHistory()  {return commentHistory;}
    public SubredditHistory subredditHistory()  {return subredditHistory;}
    public ArrayList<String> getInterests()  {
        return interests;
    }
    public ArrayList<String> getFavSubreddits()  {
        return favSubreddits;
    }
    public HashMap<String, String> getFlairs()  {
        return flairs;
    }
    public PostHistory postHistory()  {
        return postHistory;
    }
    public String getName()  {
        return username;
    }
    public String getLink()  {
        return link;
    }

    //setters
    public void setInterests(ArrayList<String> interests)  {
        this.interests = interests;
    }
    public void setFavSubreddits(ArrayList<String> favSubreddits)  {
        this.favSubreddits = favSubreddits;
    }
    public void setFlairs(HashMap<String, String> flairs)  {
        this.flairs = flairs;
    }
    public void setLink(String link)  {
        this.link = link;
    }
    public void setUsername(String username)  {
        this.username = username;
    }

    public boolean collectFlairs()  {
        boolean result = false;

        if (commentHistory.size()!=0)  {
            for (Comment comment: commentHistory.getComments())  {
                if (!comment.getAuthorFlair().equals("") && !flairs.containsKey(comment.getAuthorFlair()))  {
                    flairs.put(comment.getAuthorFlair(), comment.getSubreddit().getName());

                    result = true;
                }
            }
        }

        return result;
    }


    //constructors
     Redditor(Reddit reddit, String username) {
        this.reddit = reddit;

        this.commentHistory = new CommentHistory(this);
        this.postHistory = new PostHistory(this);

        try  {
            this.subredditHistory = new SubredditHistory(this, commentHistory, postHistory);
        }
        catch (Exception e)  {
            System.out.println(("something went wrong"));
        }

        flairs = new HashMap<>();

        this.username = username;
        link = "http://reddit.com/getRedditor/"+username;
    }

    public String toString()  {
        return username;
    }

}