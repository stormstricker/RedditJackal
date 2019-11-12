package redditjackal.requests.inbox;

import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditRequest;

public class AbstractInboxRequest extends RedditRequest {
    protected AbstractInboxRequest() {
    }

    abstract public class Builder<T extends Builder> {
        protected Builder(String type, AccessToken token) {
            setLink(link + type);
            setAccessToken(token);
        }

        public abstract AbstractInboxRequest build();
        protected abstract T self();
    }
}
