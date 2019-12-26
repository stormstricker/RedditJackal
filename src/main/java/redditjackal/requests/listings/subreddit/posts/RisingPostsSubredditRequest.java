package redditjackal.requests.listings.subreddit.posts;

import redditjackal.requests.AccessToken;

public class RisingPostsSubredditRequest extends AbstractSubredditPostsRequest {
    protected RisingPostsSubredditRequest(String subreddit)  {super(subreddit);}

    public static RisingPostsSubredditRequest.Builder builder(String subreddit, AccessToken token)  {
        return new RisingPostsSubredditRequest(subreddit).new Builder(token);
    }

    public class Builder extends AbstractSubredditPostsRequest.Builder<Builder> {
        protected Builder(AccessToken token)  {
            super("/rising", token);
        }

        @Override
        public RisingPostsSubredditRequest build()  {
            updateLink();
            return RisingPostsSubredditRequest.this;
        }

        @Override
        public RisingPostsSubredditRequest.Builder self()  {
            return this;
        }
        @Override
        public RisingPostsSubredditRequest.Builder builder()  {
            return RisingPostsSubredditRequest.builder(subreddit, accessToken);
        }
    }
}
