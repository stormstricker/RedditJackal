package redditjackal.requests.inbox.get;

import redditjackal.requests.AccessToken;

public class UnreadInboxRequest extends AbstractGetInboxRequest {
    protected UnreadInboxRequest()  {}

    public static Builder builder(AccessToken token)  {
        return new UnreadInboxRequest().new Builder(token);
    }

    public class Builder extends AbstractGetInboxRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super("/unread", token);
        }

        @Override
        public UnreadInboxRequest build()  {
            updateLink();
            return UnreadInboxRequest.this;
        }

        @Override
        public Builder self()  {
            return this;
        }

        @Override
        public Builder builder()  {
            return UnreadInboxRequest.builder(accessToken);
        }
    }
}
