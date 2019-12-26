package redditjackal.requests.listings.subreddit.posts;

import redditjackal.requests.AccessToken;

public class HotPostsSubredditRequest extends AbstractSubredditPostsRequest {
    protected String g;

    protected HotPostsSubredditRequest(String subreddit)  {super(subreddit);}

    public static HotPostsSubredditRequest.Builder builder(String subreddit, AccessToken token)  {
        return new HotPostsSubredditRequest(subreddit).new Builder(token);
    }

    public class Builder extends AbstractSubredditPostsRequest.Builder<Builder> {
        protected Builder(AccessToken token)  {
            super("/hot", token);
        }

        public Builder setG(String g) {
            HotPostsSubredditRequest.this.g = g;
            params +="&g=" + g;
            return self();
        }

        @Override
        public HotPostsSubredditRequest build()  {
            updateLink();
            return HotPostsSubredditRequest.this;
        }

        @Override
        public HotPostsSubredditRequest.Builder self()  {
            return this;
        }
        @Override
        public HotPostsSubredditRequest.Builder builder()  {
            return HotPostsSubredditRequest.builder(subreddit, accessToken);
        }
    }
}