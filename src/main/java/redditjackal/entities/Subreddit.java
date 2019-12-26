package redditjackal.entities;

import org.json.JSONObject;
import redditjackal.history.subreddit.SubredditCommentHistory;
import redditjackal.history.subreddit.SubredditPostHistory;
import redditjackal.requests.RedditRequest;
import redditjackal.requests.inbox.interfaces.Mailable;

public class Subreddit extends Actor implements Mailable {
    private SubredditCommentHistory commentHistory;
    private SubredditPostHistory postHistory;

    private String description;
    private String link;
    private String name;

    Subreddit(Reddit reddit, String name)  {
        this.reddit = reddit;
        this.name = name;

        this.commentHistory = new SubredditCommentHistory(this);
        this.postHistory = new SubredditPostHistory(this);
    }

    @Override
    public SubredditCommentHistory commentHistory()  {return commentHistory;}
    @Override
    public SubredditPostHistory postHistory()  {return postHistory;}

    public void submitSelfText(String title, String text) throws Exception  {
        String url = "https://oauth.reddit.com/api/submit?sr=" + name + "&title=" + title + "&kind=self&text=" + text;

        RedditRequest request = new RedditRequest(url, reddit.getAccessToken(), RedditRequest.REQUEST_TYPE.POST);
        String inputString = request.send().getResponse();
        System.out.println(inputString);
    }

    public void post(String title, String kind, String text) throws Exception  {
        String url = "https://oauth.reddit.com/api/submit?sr=" + name + "&title=" + title + "&kind=self&text=" + text;

        RedditRequest request = new RedditRequest(url, reddit.getAccessToken(), RedditRequest.REQUEST_TYPE.POST);
        String inputString = request.send().getResponse();
        System.out.println(inputString);
    }

    @Override
    public void sendPrivateMessage(String subject, String text)  {
        reddit.getMe().sendPrivateMessage(subject, text, "/r/" + name);
    }

    @Override
    public void sendPrivateMessage(String subject, String text, String fr_sr)  {
        reddit.getMe().sendPrivateMessage(subject, text, name, fr_sr);
    }

    //getters
    public String getDescription() {
        if (description == null)  {
            try {
                RedditRequest request = new RedditRequest(" https://oauth.reddit.com/r/" + name + "/about",
                        reddit.getAccessToken(), RedditRequest.REQUEST_TYPE.GET);
                String inputString = request.send().getResponse();
                JSONObject jsonObject = new JSONObject(inputString);
                JSONObject data = (JSONObject) jsonObject.get("data");

                description = (String) data.get("public_description");
            }
            catch (Exception e)  {
                System.out.println("Exception in getDescription()");

                e.printStackTrace();
            }
        }

        return description;
    }
    public String getLink()  {
        return link;
    }
    public String getName()  {
        return name;
    }

    //setters
    public void setDescription(String description)  {
        this.description=description;
    }
    public void setLink(String link)  {
        this.link = link;
    }
    public void setTitle(String name)  {
        this.name=name;
    }
    public String toString()  {return name;}
}