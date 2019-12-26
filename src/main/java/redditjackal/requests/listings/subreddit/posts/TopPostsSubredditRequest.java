package redditjackal.requests.listings.subreddit.posts;

import redditjackal.requests.AccessToken;

public class TopPostsSubredditRequest extends AbstractSubredditPostsRequest {
    protected TopPostsSubredditRequest(String subreddit)  {super(subreddit);}

    public static TopPostsSubredditRequest.Builder builder(String subreddit, AccessToken token)  {
        return new TopPostsSubredditRequest(subreddit).new Builder(token);
    }

    public class Builder extends AbstractSubredditPostsRequest.Builder<Builder> {
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
        @Override
        public TopPostsSubredditRequest.Builder builder()  {
            return TopPostsSubredditRequest.builder(subreddit, accessToken);
        }
    }
}
