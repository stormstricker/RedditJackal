package redditjackal.requests.listings.redditor.comments;

import redditjackal.requests.AccessToken;

public class RisingCommentsRedditorRequest extends AbstractRedditorCommentsRequest {
    protected RisingCommentsRedditorRequest(String username)  {super(username);}

    public static RisingCommentsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new RisingCommentsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorCommentsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("rising");
        }

        @Override
        public RisingCommentsRedditorRequest build()  {
            updateLink();
            return RisingCommentsRedditorRequest.this;
        }

        @Override
        public RisingCommentsRedditorRequest.Builder self()  {
            return this;
        }
    }
}

