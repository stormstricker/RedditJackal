package redditjackal.entities;

import redditjackal.requests.RedditRequest;
import org.json.JSONObject;

public class Subreddit extends Actor {
    private CommentHistory commentHistory;
    private PostHistory postHistory;

    private String description;
    private String link;
    private String name;

    Subreddit(Reddit reddit, String name)  {
        this.reddit = reddit;
        this.name = name;

        this.commentHistory = new CommentHistory(this);
        this.postHistory = new PostHistory(this);
    }

    public CommentHistory commentHistory()  {return commentHistory;}
    public PostHistory postHistory()  {return postHistory;}

    public void post(String title, String kind, String text) throws Exception  {
        String url = "https://oauth.reddit.com/api/submit?sr=" + name + "&title=" + title + "&kind=self&text=" + text;

        RedditRequest request = new RedditRequest(url, Reddit.getReddit().getAccessToken(), RedditRequest.REQUEST_TYPE.POST);
        String inputString = request.send().getResponse();
        System.out.println(inputString);
    }


    //getters
    public String getDescription() {
        if (description == null)  {
            try {
                RedditRequest request = new RedditRequest(" https://oauth.reddit.com/r/" + name + "/about",
                        Reddit.getReddit().getAccessToken(), RedditRequest.REQUEST_TYPE.GET);
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