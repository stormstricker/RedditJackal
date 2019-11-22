package redditjackal.requests.listings.subreddit.posts;

import redditjackal.requests.AccessToken;
import redditjackal.requests.listings.subreddit.AbstractSubredditListingRequest;

public class TopPostsSubredditRequest extends AbstractSubredditPostsRequest {
    protected TopPostsSubredditRequest(String subreddit)  {super(subreddit);}

    public static TopPostsSubredditRequest.Builder builder(String subreddit, AccessToken token)  {
        return new TopPostsSubredditRequest(subreddit).new Builder(token);
    }

    public class Builder extends AbstractSubredditListingRequest.Builder<Builder> {
        protected Builder(AccessToken token)  {
            super("/top", token);
        }

        @Override
        public TopPostsSubredditRequest build()  {
            updateLink();
            return TopPostsSubredditRequest.this;
        }

        @Override
        public TopPostsSubredditRequest.Builder self()  {
            return this;
        }
    }
}
