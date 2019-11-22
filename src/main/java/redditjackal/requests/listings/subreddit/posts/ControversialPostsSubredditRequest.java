package redditjackal.requests.listings.subreddit.posts;

import redditjackal.requests.AccessToken;
import redditjackal.requests.listings.subreddit.AbstractSubredditListingRequest;
import redditjackal.requests.listings.subreddit.AbstractTimeSubredditPostsRequest;

public class ControversialPostsSubredditRequest extends AbstractTimeSubredditPostsRequest {
    protected ControversialPostsSubredditRequest(String subreddit)  {super(subreddit);}

    public static ControversialPostsSubredditRequest.Builder builder(String subreddit, AccessToken token)  {
        return new ControversialPostsSubredditRequest(subreddit).new Builder(token);
    }

    public class Builder extends AbstractTimeSubredditPostsRequest.Builder<Builder> {
        protected Builder(AccessToken token)  {
            super("/controversial", token);
        }

        @Override
        public ControversialPostsSubredditRequest build()  {
            updateLink();
            return ControversialPostsSubredditRequest.this;
        }

        @Override
        public ControversialPostsSubredditRequest.Builder self()  {
            return this;
        }
    }
}

