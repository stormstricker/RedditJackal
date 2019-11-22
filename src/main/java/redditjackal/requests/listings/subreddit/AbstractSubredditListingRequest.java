package redditjackal.requests.listings.subreddit;

import redditjackal.requests.AccessToken;
import redditjackal.requests.listings.AbstractListingRequest;

public class AbstractSubredditListingRequest extends AbstractListingRequest {
    protected String subreddit;

    protected AbstractSubredditListingRequest(String subreddit)  {this.subreddit = subreddit;}

    {
        setRequestType(REQUEST_TYPE.GET);
        link = "https://oauth.reddit.com/r";
    }

    public abstract class Builder<T extends Builder<T>>
                                    extends AbstractListingRequest.Builder<T> {
        protected Builder(String subreddit, AccessToken token) {
            super("/" + subreddit, token);
        }

    }
}