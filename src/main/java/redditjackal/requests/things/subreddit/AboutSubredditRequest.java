package redditjackal.requests.things.subreddit;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.things.subreddit.AboutSubredditJson;
import redditjackal.requests.AbstractRequest;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;

public class AboutSubredditRequest extends AbstractRequest {
    protected String subreddit;

    {
        setRequestType(REQUEST_TYPE.GET);
        link = "https://oauth.reddit.com/r";
    }

    protected AboutSubredditRequest(String subreddit)  {
        this.subreddit = subreddit;
    }

    public static AboutSubredditRequest.Builder builder(String subreddit, AccessToken token)  {
        return new AboutSubredditRequest(subreddit).new Builder(token);
    }

    public class Builder extends AbstractRequest.Builder<AboutSubredditRequest.Builder>  {
        protected Builder(AccessToken token)  {
            super("/" + subreddit + "/about", token);
        }

        @Override
        public AboutSubredditRequest build()  {
            updateLink();
            return AboutSubredditRequest.this;
        }

        @Override
        public AboutSubredditRequest.Builder self()  {
            return this;
        }

        @Override
        public AboutSubredditRequest.Builder builder()  {
            return AboutSubredditRequest.builder(subreddit, accessToken);
        }
    }

    @Override
    public AboutSubredditJson execute()  {
        try  {
            RedditResponse response = send();
            Gson gson = new Gson();
            return gson.fromJson(response.getResponse(), new TypeToken<AboutSubredditJson>(){}.getType());
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }
    }
}

