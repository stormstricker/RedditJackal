package redditjackal.things;

import org.json.JSONObject;

public abstract class Thing {
    public static enum THING_TYPE {COMMENT, POST};

    Redditor author;
    Subreddit subreddit;
    String body;
    long score;
    String link;

    String authorFlair="";

    String id;

    Thing()  {

    }

    Thing(String thingData) throws NotLoggedInException  {
        this(new JSONObject(thingData));
    }

    Thing(JSONObject thingData) throws NotLoggedInException {
        setAuthor(new Redditor(Reddit.getReddit(), (String) thingData.get("author")));
        setScore(((Integer) thingData.get("score")).longValue());
        setSubreddit(new Subreddit((String) thingData.get("subreddit")));
        setId((String) thingData.get("name"));
        setLink("https://www.reddit.com" + thingData.get("permalink"));

        try {
            setAuthorFlair((String) thingData.get("author_flair_text"));
        }
        catch (Exception e) {
           // e.printStackTrace();
        }
    }

    //setters
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

