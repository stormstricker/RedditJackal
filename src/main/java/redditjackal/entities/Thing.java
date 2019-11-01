package redditjackal.entities;

import org.json.JSONArray;
import org.json.JSONObject;
import redditjackal.requests.RedditRequest;

import java.net.URLEncoder;

public abstract class Thing {
    public static enum THING_TYPE {COMMENT, POST};
    protected Reddit reddit;

    Redditor author;
    Subreddit subreddit;
    String body;
    long score;
    String link;

    String authorFlair="";

    String id;

    Thing()  {

    }

    Thing(Reddit reddit, JSONObject thingData) throws NotLoggedInException {
        this.reddit = reddit;

        setAuthor(new Redditor(Reddit.getReddit(), (String) thingData.get("author")));
        setScore(((Integer) thingData.get("score")).longValue());
        setSubreddit(new Subreddit(reddit, (String) thingData.get("subreddit")));
        setId((String) thingData.get("name"));
        setLink("https://www.reddit.com" + thingData.get("permalink"));

        try {
            setAuthorFlair((String) thingData.get("author_flair_text"));
        }
        catch (Exception e) {
           // e.printStackTrace();
        }
    }

    public Comment reply(String text) throws Exception  {
        String link = "https://oauth.reddit.com/api/comment?api_type=json&thing_id=" + id + "&text=" + URLEncoder.encode(text, "utf-8");
        RedditRequest request = new RedditRequest(link, reddit.getAccessToken(), RedditRequest.REQUEST_TYPE.WRITE);
        String response = request.send().getResponse();
        System.out.println(response);

        JSONObject jsonArray = new JSONObject(response);
        JSONArray things = (JSONArray) ((JSONObject) ((JSONObject) jsonArray.get("json")).get("data")).get("things");

        Comment result = new Comment(reddit, (JSONObject) ((JSONObject) things.get(0)).get("data"));
        return result;
    }

    //setters
    public void setReddit(Reddit reddit) {
        this.reddit = reddit;
    }
    public void setLink(String link)  {this.link = link;}
    public void setId(String id)  {this.id = id; }
    public void setAuthorFlair(String authorFlair)  {
        this.authorFlair = authorFlair;
    }
    public void setAuthor(Redditor author)  {
        this.author = author;
    }
    public void setSubreddit(Subreddit subreddit)  {
        this.subreddit = subreddit;
    }
    public void setBody(String body)  {
        this.body = body;
    }
    public void setScore(long score)  {
        this.score = score;
    }

    //getters
    public Reddit getReddit() {
        return reddit;
    }
    public String getBody()  {
        return body;
    }
    public Subreddit getSubreddit()  {
        return subreddit;
    }
    public Redditor getAuthor()  {
        return author;
    }
    public long getScore()  {
        return score;
    }
    public String getLink()  {return link;}
    public String getAuthorFlair()  {
        return authorFlair;
    }
    public String getId()  {
        return id;
    }
    public String toString()  {
        return subreddit + "=> " + score + "=>" + author + ": " + body;
    }
}

/*

t1_	Comment
t2_	Account
t3_	Link
t4_	Message
t5_	Subreddit
t6_	Award

 */