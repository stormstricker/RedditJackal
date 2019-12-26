package redditjackal.requests.listings.subreddit.posts;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingJson;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;
import redditjackal.requests.listings.subreddit.AbstractSubredditListingRequest;

public abstract class AbstractSubredditPostsRequest extends AbstractSubredditListingRequest {
    protected AbstractSubredditPostsRequest(String subreddit)  {
        super(subreddit);
    }

    public abstract class Builder<T extends Builder<T>> extends AbstractSubredditListingRequest.Builder<T>  {
        protected Builder(String type, AccessToken token)  {
            super(type, token);
        }

        @Override
        public abstract AbstractSubredditPostsRequest build();
        @Override
        protected  abstract T self();
        @Override
        public abstract T builder();
    }

    @Override
    public PostsListingJson execute()  {
        try  {
            RedditResponse response = send();
            Gson gson = new Gson();
            return gson.fromJson(response.getResponse(), new TypeToken<PostsListingJson>(){}.getType());
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }
    }
}

