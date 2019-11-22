package redditjackal.requests.listings.redditor.comments;

import redditjackal.requests.AccessToken;

public class ControversialCommentsRedditorRequest extends AbstractRedditorCommentsRequest {
    protected ControversialCommentsRedditorRequest(String username)  {super(username);}

    public static ControversialCommentsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new ControversialCommentsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorCommentsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("controversial");
        }

        @Override
        public ControversialCommentsRedditorRequest build()  {
            updateLink();
            return ControversialCommentsRedditorRequest.this;
        }

        @Override
        public ControversialCommentsRedditorRequest.Builder self()  {
            return this;
        }
    }
}



