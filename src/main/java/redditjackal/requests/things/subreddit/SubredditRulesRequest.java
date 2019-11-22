package redditjackal.requests.things.subreddit;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.things.subreddit.AboutSubredditJson;
import redditjackal.jsonhandlers.things.subreddit.SubredditRulesJson;
import redditjackal.requests.AbstractRequest;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;

public class SubredditRulesRequest extends AbstractRequest {
    protected String subreddit;

    {
        setRequestType(REQUEST_TYPE.GET);
        link = "https://oauth.reddit.com/r";
    }

    protected SubredditRulesRequest(String subreddit)  {
        this.subreddit = subreddit;
    }

    public static SubredditRulesRequest.Builder builder(String username, AccessToken token)  {
        return new SubredditRulesRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRequest.Builder<SubredditRulesRequest.Builder>  {
        protected Builder(AccessToken token)  {
            super("/" + subreddit + "/about/rules", token);
        }

        @Override
        public SubredditRulesRequest build()  {
            updateLink();
            return SubredditRulesRequest.this;
        }

        @Override
        public SubredditRulesRequest.Builder self()  {
            return this;
        }
    }

    @Override
    public SubredditRulesJson execute()  {
        try  {
            RedditResponse response = send();
            Gson gson = new Gson();
            return gson.fromJson(response.getResponse(), new TypeToken<SubredditRulesJson>(){}.getType());
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }
    }
}

