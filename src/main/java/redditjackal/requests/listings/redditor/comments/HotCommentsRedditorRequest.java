package redditjackal.requests.listings.redditor.comments;

import redditjackal.requests.AccessToken;

public class HotCommentsRedditorRequest extends AbstractRedditorCommentsRequest {
    protected HotCommentsRedditorRequest(String username)  {super(username);}

    public static HotCommentsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new HotCommentsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorCommentsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("hot");
        }

        @Override
        public HotCommentsRedditorRequest build()  {
            updateLink();
            return HotCommentsRedditorRequest.this;
        }

        @Override
        public HotCommentsRedditorRequest.Builder self()  {
            return this;
        }
    }
}




