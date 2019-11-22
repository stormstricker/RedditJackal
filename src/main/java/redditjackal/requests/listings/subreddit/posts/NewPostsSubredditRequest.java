package redditjackal.requests.listings.subreddit.posts;

import redditjackal.requests.AccessToken;
import redditjackal.requests.listings.subreddit.AbstractSubredditListingRequest;

public class NewPostsSubredditRequest extends AbstractSubredditPostsRequest {
    protected NewPostsSubredditRequest(String subreddit)  {super(subreddit);}

    public static NewPostsSubredditRequest.Builder builder(String subreddit, AccessToken token)  {
        return new NewPostsSubredditRequest(subreddit).new Builder(token);
    }

    public class Builder extends AbstractSubredditListingRequest.Builder<Builder> {
        protected Builder(AccessToken token)  {
            super("/new", token);
        }

        @Override
        public NewPostsSubredditRequest build()  {
            updateLink();
            return NewPostsSubredditRequest.this;
        }

        @Override
        public NewPostsSubredditRequest.Builder self()  {
            return this;
        }
    }
}