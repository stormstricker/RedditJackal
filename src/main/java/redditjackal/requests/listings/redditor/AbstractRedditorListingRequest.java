package redditjackal.requests.listings.redditor;

import redditjackal.requests.AbstractRequest;
import redditjackal.requests.AccessToken;
import redditjackal.requests.listings.AbstractListingRequest;

//both posts and comments?
public   class AbstractRedditorListingRequest extends AbstractListingRequest {
    protected String context;
    protected String sort;
    protected String t;
    protected String type;
    protected String username;

    protected AbstractRedditorListingRequest(String username)  {this.username = username;}

    {
        setRequestType(REQUEST_TYPE.GET);
        link = "https://oauth.reddit.com/user";
    }

    public abstract class Builder<T extends Builder<T>>
                                            extends AbstractListingRequest.Builder<T> {
        protected Builder(String type, AccessToken token) {
            super("/" + username + type, token);
        }

        @Override
        protected abstract T self();
        @Override
        protected abstract AbstractRedditorListingRequest build();

        //public abstract AbstractRedditorListingRequest build();

        public T setContext(String context) {
            AbstractRedditorListingRequest.this.context = context;
            params += "&context=" + context;
            return self();
        }

        public T setSort(String sort) {
            AbstractRedditorListingRequest.this.sort = sort;
            params += "&sort=" + sort;
            return self();
        }

        public T setT(String t) {
            AbstractRedditorListingRequest.this.t = t;
            params += "&t=" + t;
            return self();
        }

        public T setType(String type) {
            AbstractRedditorListingRequest.this.type = type;
            params += "&type=" + type;
            return self();
        }
    }
}
