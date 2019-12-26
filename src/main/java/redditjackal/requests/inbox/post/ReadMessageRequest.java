package redditjackal.requests.inbox.post;

import redditjackal.requests.AccessToken;
import redditjackal.requests.inbox.get.AbstractGetInboxRequest;

public class ReadMessageRequest extends AbstractPostInboxRequest {
    protected String id;
    protected String modhash;

    protected ReadMessageRequest(String id)  {
        params += "&id=" + id;
        paramsMap.put("id", id);
    }

    public static ReadMessageRequest.Builder builder(String id, AccessToken token)  {
        return new ReadMessageRequest(id).new Builder(token);
    }

    public class Builder extends AbstractPostInboxRequest.Builder<ReadMessageRequest.Builder>  {
        protected Builder(AccessToken token)  {
            super("/read_message", token);
        }

        @Override
        public ReadMessageRequest build()  {
            return ReadMessageRequest.this;
        }

        public Builder setModhash(String modhash)  {
            ReadMessageRequest.this.modhash = modhash;
            params += "&modhash=" + modhash;
            paramsMap.put("modhash", modhash);
            return this;
        }

        @Override
        public ReadMessageRequest.Builder self()  {
            return this;
        }

        @Override
        public Builder builder()  {
            return ReadMessageRequest.builder(id, accessToken);
        }
    }
}
