package redditjackal.requests.reddit;

import redditjackal.requests.AbstractRequest;
import redditjackal.requests.AccessToken;

public abstract class ThingByIdRequest extends AbstractRequest {
    private String id;

    {
        setRequestType(REQUEST_TYPE.GET);
        link = "https://oauth.reddit.com/api/info";
    }

    protected ThingByIdRequest()  {}

    public static Builder builder(String type) {
        return null;
    }

    public abstract class Builder<T extends Builder<T>> extends AbstractRequest.Builder<T> {
        protected Builder(AccessToken token) {
            super("", token);
        }

        public T setId(String id) {
            ThingByIdRequest.this.id = id;
            params += "&id=" + id;
            return self();
        }
    }
}
