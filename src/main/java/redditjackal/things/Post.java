package redditjackal.things;

import org.json.JSONObject;

import java.util.ArrayList;

public class Post extends Thing {
    String title;
    String distinguished;

    ArrayList<Comment> comments; //would probably need a tree structure

    public String thumbnail;

    public void setComments(ArrayList<Comment> comments)  {
            this.comments = comments;
    }

    public ArrayList<Comment> getComments()  {return comments;}

    //setters
    public void setTitle(String title)  {
        this.title = title;
    }
    public void setDistinguished(String distinguished)  {
        this.distinguished = distinguished;
    }
    public void setThumbnail(String thumbnail)  {this.thumbnail = thumbnail;}

    //getters
    public String getTitle()  {
        return title;
    }
    public String getDistinguished()  {
        return distinguished;
    }
    public String getThumbnail()  {return thumbnail;}

    Post()  {}

    Post(String thingData) throws NotLoggedInException  {
        this(new JSONObject(thingData));
    }

    Post(JSONObject thingData) throws NotLoggedInException  {
        super(thingData);
        setBody((String) thingData.get("selftext"));
        setTitle((String) thingData.get("title"));

        if (thingData.get("distinguished").equals(JSONObject.NULL))  {
           setDistinguished("");
        }
        else  {
            setDistinguished((String) thingData.get("distinguished"));
        }
    }
}