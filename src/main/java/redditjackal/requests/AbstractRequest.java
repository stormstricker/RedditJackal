package redditjackal.requests;

public class AbstractRequest extends RedditRequest {
    protected AbstractRequest() {
    }

    abstract public class Builder<T extends Builder<T>> {
        protected Builder(String type, AccessToken token) {
            setLink(link + type);
            setAccessToken(token);
        }

        protected abstract AbstractRequest build();
        protected abstract T self();
        protected abstract T builder();
    }
}
