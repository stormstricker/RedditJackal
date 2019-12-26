package redditjackal.requests.listings.subreddit;

import redditjackal.requests.AccessToken;
import redditjackal.requests.listings.subreddit.posts.AbstractSubredditPostsRequest;

public abstract class AbstractTimeSubredditPostsRequest extends AbstractSubredditPostsRequest {
    protected String t;

    protected AbstractTimeSubredditPostsRequest(String subreddit)  {super(subreddit);}


    public abstract class Builder<T extends Builder<T>> extends AbstractSubredditPostsRequest.Builder<T>  {
        protected Builder(String type, AccessToken token)  {
            super(type, token);
        }

        @Override
        public abstract T builder();

        public AbstractTimeSubredditPostsRequest.Builder setT(String t) {
            AbstractTimeSubredditPostsRequest.this.t = t;
            params +="&t=" + t;
            return self();
        }
    }
}
