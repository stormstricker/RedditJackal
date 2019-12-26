package redditjackal.requests.inbox.get;

import redditjackal.requests.AccessToken;

public class SentInboxRequest extends AbstractGetInboxRequest {
    protected SentInboxRequest()  {}

    public static SentInboxRequest.Builder builder(AccessToken token)  {
        return new SentInboxRequest().new Builder(token);
    }

    public class Builder extends AbstractGetInboxRequest.Builder<SentInboxRequest.Builder>  {
        protected Builder(AccessToken token)  {
            super("/sent", token);
        }

        @Override
        public SentInboxRequest build()  {
            updateLink();
            return SentInboxRequest.this;
        }

        @Override
        public SentInboxRequest.Builder self()  {
            return this;
        }

        @Override
        public Builder builder()  {
            return SentInboxRequest.builder(accessToken);
        }
    }
}
