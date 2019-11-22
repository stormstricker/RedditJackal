package redditjackal.requests.listings.redditor.posts;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingJson;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;
import redditjackal.requests.listings.redditor.AbstractRedditorListingRequest;

public abstract class AbstractRedditorPostsRequest extends AbstractRedditorListingRequest {

    protected AbstractRedditorPostsRequest(String username)  {super(username);}

    public abstract class Builder<T extends Builder<T>> extends AbstractRedditorListingRequest.Builder<T>  {
        protected Builder(AccessToken token)  {
            super("/submitted", token);
        }

        @Override
        public abstract AbstractRedditorPostsRequest build();
        @Override
        protected  abstract T self();
    }


    @Override
    public PostsListingJson execute() {
        try {
            RedditResponse response = send();
            Gson gson = new Gson();
            return gson.fromJson(response.getResponse(), new TypeToken<PostsListingJson>() {
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
