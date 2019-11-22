package redditjackal.requests.listings.redditor.posts;

import redditjackal.requests.AccessToken;

public class TopPostsRedditorRequest extends AbstractRedditorPostsRequest{
    protected TopPostsRedditorRequest(String username)  {super(username);}

    public static TopPostsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new TopPostsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorPostsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("top");
        }

        @Override
        public TopPostsRedditorRequest build()  {
            updateLink();
            return TopPostsRedditorRequest.this;
        }

        @Override
        public TopPostsRedditorRequest.Builder self()  {
            return this;
        }
    }
}
