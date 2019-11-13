package redditjackal.entities;

import redditjackal.jsonhandlers.redditor.AboutRedditorDataJson;
import redditjackal.jsonhandlers.redditor.AboutRedditorJson;
import redditjackal.jsonhandlers.redditor.AboutRedditorSubredditJson;
import redditjackal.requests.redditor.AboutRedditorRequest;

import java.util.ArrayList;
import java.util.HashMap;

//TODO: check if user is deleted

public class Redditor extends Actor {
    AboutRedditorJson aboutJson;

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

    //autogen delegates
    public AboutRedditorDataJson getAboutRedditorDataJson() {
        return aboutJson.getAboutRedditorDataJson();
    }

    public String getKind() {
        return aboutJson.getKind();
    }

    public Long getCommentKarma() {
        return getAboutRedditorDataJson().getCommentKarma();
    }

    public Long getCreated() {
        return getAboutRedditorDataJson().getCreated();
    }

    public Long getCreatedUtc() {
        return getAboutRedditorDataJson().getCreatedUtc();
    }

    public Boolean getHasSubscribed() {
        return getAboutRedditorDataJson().getHasSubscribed();
    }

    public Boolean getHasVerifiedEmail() {
        return getAboutRedditorDataJson().getHasVerifiedEmail();
    }

    public Boolean getHideFromRobots() {
        return getAboutRedditorDataJson().getHideFromRobots();
    }

    public String getIconImg() {
        return getAboutRedditorDataJson().getIconImg();
    }

    public String getId() {
        return getAboutRedditorDataJson().getId();
    }

    public Boolean getIsEmployee() {
        return getAboutRedditorDataJson().getIsEmployee();
    }

    public Boolean getIsFriend() {
        return getAboutRedditorDataJson().getIsFriend();
    }

    public Boolean getIsGold() {
        return getAboutRedditorDataJson().getIsGold();
    }

    public Boolean getIsMod() {
        return getAboutRedditorDataJson().getIsMod();
    }

    public Long getLinkKarma() {
        return getAboutRedditorDataJson().getLinkKarma();
    }


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

    public Boolean getPrefShowSnoovatar() {
        return getAboutRedditorDataJson().getPrefShowSnoovatar();
    }

    public AboutRedditorSubredditJson getAboutRedditorSubredditJson() {
        return getAboutRedditorDataJson().getAboutRedditorSubredditJson();
    }

    public Boolean getVerified() {
        return getAboutRedditorDataJson().getVerified();
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

         AboutRedditorRequest.Builder builder = AboutRedditorRequest.builder(username, reddit.getAccessToken());
         AboutRedditorRequest request = builder.build();
         this.aboutJson = request.execute();

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
        link = "http://reddit.com/user/"+username;
    }

    public String toString()  {
        return username;
    }

}