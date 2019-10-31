package redditjackal.entities;

import org.json.JSONObject;
import redditjackal.requests.RedditRequest;

public class Comment extends Thing {
        private String link;

        public String getLink()  {return link;}

        public void setLink(String link)  {this.link = link;}

        public String toString()  {
                return subreddit + ": " + body;
        }

        public Comment()  {}

        public Comment(Reddit reddit, String thingData) throws NotLoggedInException {
                this(reddit, new JSONObject(thingData));
        }

        public Comment(Reddit reddit, JSONObject thingData) throws NotLoggedInException  {
                super(reddit, thingData);
                setBody((String) thingData.get("body"));
        }
}
