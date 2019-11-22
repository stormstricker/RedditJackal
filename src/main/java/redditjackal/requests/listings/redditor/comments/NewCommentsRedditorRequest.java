package redditjackal.requests.listings.redditor.comments;

import redditjackal.requests.AccessToken;

public class NewCommentsRedditorRequest extends AbstractRedditorCommentsRequest {
    protected NewCommentsRedditorRequest(String username)  {super(username);}

    public static NewCommentsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new NewCommentsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorCommentsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("new");
        }

        @Override
        public NewCommentsRedditorRequest build()  {
            updateLink();
            return NewCommentsRedditorRequest.this;
        }

        @Override
        public NewCommentsRedditorRequest.Builder self()  {
            return this;
        }
    }
}
