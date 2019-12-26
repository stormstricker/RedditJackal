package redditjackal.requests.listings.redditor.comments;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsJson;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;
import redditjackal.requests.listings.redditor.AbstractRedditorListingRequest;

public abstract class AbstractRedditorCommentsRequest
        extends AbstractRedditorListingRequest {
    protected AbstractRedditorCommentsRequest(String username)  {super(username);}

    public abstract class Builder<T extends Builder<T>>
                            extends AbstractRedditorListingRequest.Builder<T>  {
        protected Builder(AccessToken token)  {
            super("/comments", token);
        }

        @Override
        public abstract AbstractRedditorCommentsRequest build();
        @Override
        protected  abstract T self();
        @Override
        public abstract T builder();
    }


    @Override
    public RedditorCommentsJson execute() {
        try {
            RedditResponse response = send();
            Gson gson = new Gson();
            return gson.fromJson(response.getResponse(), new TypeToken<RedditorCommentsJson>() {
            }.getType());
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}
