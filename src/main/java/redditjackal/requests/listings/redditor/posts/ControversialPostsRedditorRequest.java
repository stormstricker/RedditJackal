package redditjackal.requests.listings.redditor.posts;

import redditjackal.requests.AccessToken;

public class ControversialPostsRedditorRequest extends AbstractRedditorPostsRequest {
    protected ControversialPostsRedditorRequest(String username)  {super(username);}

    public static ControversialPostsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new ControversialPostsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorPostsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("controversial");
        }

        @Override
        public ControversialPostsRedditorRequest build()  {
            updateLink();
            return ControversialPostsRedditorRequest.this;
        }

        @Override
        public ControversialPostsRedditorRequest.Builder self()  {
            return this;
        }
    }
}


