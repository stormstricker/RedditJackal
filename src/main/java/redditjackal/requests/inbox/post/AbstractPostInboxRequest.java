package redditjackal.requests.inbox.post;

import redditjackal.requests.AccessToken;
import redditjackal.requests.inbox.AbstractInboxRequest;
import redditjackal.requests.inbox.get.AbstractGetInboxRequest;

public class AbstractPostInboxRequest extends AbstractGetInboxRequest {
    protected String modhash;

    {
        setRequestType(REQUEST_TYPE.POST);
        link = "https://oauth.reddit.com/api";
    }

    protected AbstractPostInboxRequest() {}

    public abstract class Builder<T extends Builder> extends AbstractInboxRequest.Builder<Builder> {
        protected Builder(String type, AccessToken token) {
            super(type, token);
        }
    }
}
