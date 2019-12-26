package redditjackal.requests.listings.redditor.posts;

import redditjackal.requests.AccessToken;

public class RisingPostsRedditorRequest extends AbstractRedditorPostsRequest {
    protected RisingPostsRedditorRequest(String username)  {super(username);}

    public static Builder builder(String username, AccessToken token)  {
        return new RisingPostsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorPostsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("rising");
        }

        @Override
        public RisingPostsRedditorRequest build()  {
            updateLink();
            return RisingPostsRedditorRequest.this;
        }

        @Override
        public RisingPostsRedditorRequest.Builder self()  {
            return this;
        }
        @Override
        public RisingPostsRedditorRequest.Builder builder()  {
            return RisingPostsRedditorRequest.builder(username, accessToken);
        }
    }
}

