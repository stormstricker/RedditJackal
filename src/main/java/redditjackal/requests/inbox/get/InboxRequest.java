package redditjackal.requests.inbox.get;

import redditjackal.requests.AccessToken;

public class InboxRequest extends AbstractGetInboxRequest {
    protected InboxRequest()  {}

    public static Builder builder(AccessToken token)  {
        return new InboxRequest().new Builder(token);
    }

    public class Builder extends AbstractGetInboxRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super("/inbox", token);
        }

        @Override
        public InboxRequest build()  {
            updateLink();
            return InboxRequest.this;
        }

        @Override
        public Builder self()  {
            return this;
        }
    }
}
