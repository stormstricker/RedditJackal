package redditjackal.requests.listings.redditor.posts;

import redditjackal.requests.AccessToken;

public class HotPostsRedditorRequest extends AbstractRedditorPostsRequest {
    protected HotPostsRedditorRequest(String username)  {super(username);}

    public static HotPostsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new HotPostsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorPostsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("hot");
        }

        @Override
        public HotPostsRedditorRequest build()  {
            updateLink();
            return HotPostsRedditorRequest.this;
        }

        @Override
        public HotPostsRedditorRequest.Builder self()  {
            return this;
        }
        @Override
        public HotPostsRedditorRequest.Builder builder()  {
            return HotPostsRedditorRequest.builder(username, accessToken);
        }
    }
}

