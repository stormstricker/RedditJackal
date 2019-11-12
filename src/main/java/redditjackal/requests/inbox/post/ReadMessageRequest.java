package redditjackal.requests.inbox.post;

import redditjackal.requests.AccessToken;
import redditjackal.requests.inbox.get.AbstractGetInboxRequest;

public class ReadMessageRequest extends AbstractPostInboxRequest {
    protected String id;
    protected String modhash;

    protected ReadMessageRequest(String id)  {
        params += "&id=" + id;
    }

    public static ReadMessageRequest.Builder builder(String id, AccessToken token)  {
        return new ReadMessageRequest(id).new Builder(token);
    }

    public class Builder extends AbstractGetInboxRequest.Builder<ReadMessageRequest.Builder>  {
        protected Builder(AccessToken token)  {
            super("/read_message", token);
        }

        @Override
        public ReadMessageRequest build()  {
            updateLink();
            return ReadMessageRequest.this;
        }

        public Builder setModhash(String modhash)  {
            ReadMessageRequest.this.modhash = modhash;
            params += "&modhash=" + modhash;
            return this;
        }

        @Override
        public ReadMessageRequest.Builder self()  {
            return this;
        }
    }
}
