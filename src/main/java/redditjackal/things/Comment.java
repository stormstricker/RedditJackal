package redditjackal.things;

import org.json.JSONObject;

public class Comment extends Thing {
        private String link;

        public String getLink()  {return link;}

        public void setLink(String link)  {this.link = link;}

        public String toString()  {
                return subreddit + ": " + body;
        }

        public Comment()  {}

        public Comment(String thingData) throws NotLoggedInException  {
                this(new JSONObject(thingData));
        }

        public Comment(JSONObject thingData) throws NotLoggedInException  {
                super(thingData);
                setBody((String) thingData.get("body"));
        }
}
