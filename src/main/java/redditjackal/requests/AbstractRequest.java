package redditjackal.requests;

public class AbstractRequest extends RedditRequest {
    protected AbstractRequest() {
    }

    abstract public class Builder<T extends Builder> {
        protected Builder(String type, AccessToken token) {
            setLink(link + type);
            setAccessToken(token);
        }

        public abstract AbstractRequest build();
        protected abstract T self();
    }
}
