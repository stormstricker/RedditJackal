package redditjackal.requests.listings.redditor.posts;

import redditjackal.requests.AccessToken;

public class NewPostsRedditorRequest extends AbstractRedditorPostsRequest{
    protected NewPostsRedditorRequest(String username)  {super(username);}

    public static NewPostsRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new NewPostsRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRedditorPostsRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
            setSort("new");
        }

        @Override
        public NewPostsRedditorRequest build()  {
            updateLink();
            return NewPostsRedditorRequest.this;
        }

        @Override
        public NewPostsRedditorRequest.Builder self()  {
            return this;
        }
        @Override
        public NewPostsRedditorRequest.Builder builder()  {
            return NewPostsRedditorRequest.builder(username, accessToken);
        }
    }
}
