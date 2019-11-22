package redditjackal.requests.listings;

import redditjackal.requests.AbstractRequest;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditRequest;

/**
 * Both for: Subreddit Posts, User comments
 */
public abstract class AbstractListingRequest extends AbstractRequest {
    protected String after;
    protected String before;
    protected String count;
    protected String include_categories;
    protected int limit;
    protected String show;
    protected String sr_detail;


    {
        setRequestType(RedditRequest.REQUEST_TYPE.GET);
        link = "https://oauth.reddit.com/r";
    }

    public abstract class Builder<T extends Builder<T>> extends AbstractRequest.Builder<T> {
        protected Builder(String type, AccessToken token) {
            super(type, token);
        }

        @Override
        protected abstract AbstractListingRequest build();
        @Override
        protected abstract T self();

        public T setAfter(String after) {
            AbstractListingRequest.this.after = after;
            params += "&after=" + after;
            return (T) self();
        }

        public T setBefore(String before) {
            AbstractListingRequest.this.before = before;
            params += "&before=" + before;
            return (T) self();
        }

        public T setCount(String count) {
            AbstractListingRequest.this.count = count;
            params += "&count=" + count;
            return (T) self();
        }

        public T setInclude_categories(String include_categories) {
            AbstractListingRequest.this.include_categories = include_categories;
            params += "&include_categories=" + include_categories;
            return (T) self();
        }

        public T setLimit(int limit) {
            AbstractListingRequest.this.limit = limit;
            params += "&limit=" + limit;
            return (T) self();
        }

        public T setShow(String show) {
            AbstractListingRequest.this.show = show;
            params += "&show=" + show;
            return (T) self();
        }

        public T setSr_detail(String sr_detail) {
            AbstractListingRequest.this.sr_detail = sr_detail;
            params += "&sr_detail=" + sr_detail;
            return (T) self();
        }
    }
}

