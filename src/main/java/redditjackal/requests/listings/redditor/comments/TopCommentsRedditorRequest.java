package redditjackal.requests.listings.redditor.comments;

import redditjackal.requests.AccessToken;

public class TopCommentsRedditorRequest extends AbstractRedditorCommentsRequest {
    protected TopCommentsRedditorRequest(String username)  {super(username);}

    public static TopCommentsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new TopCommentsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorCommentsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("top");
        }

        @Override
        public TopCommentsRedditorRequest build()  {
            updateLink();
            return TopCommentsRedditorRequest.this;
        }

        @Override
        public TopCommentsRedditorRequest.Builder self()  {
            return this;
        }

        @Override
        public TopCommentsRedditorRequest.Builder builder()  {
            return TopCommentsRedditorRequest.builder(username, accessToken);
        }
    }
}

