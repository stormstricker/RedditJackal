package redditjackal.requests.inbox.post;

import redditjackal.requests.AccessToken;

import java.net.URLEncoder;

public class ComposeMessageRequest extends AbstractPostInboxRequest {
    protected String subject;
    protected String text;
    protected String to;

    protected String from_sr;

    protected String api_type = "json";

    {
        params += "&api_type=" + api_type;
        paramsMap.put("api_type", api_type);
    }


    protected ComposeMessageRequest(String subject, String text, String to)  {
        this.subject = subject;
        this.text = text;
        this.to = to;

        try  {
            params += "&subject=" + URLEncoder.encode(subject, "UTF-8");
            params += "&text=" + URLEncoder.encode(text, "UTF-8");

            paramsMap.put("subject", subject);
            paramsMap.put("text", text);
        }
        catch (Exception e)  {
            e.printStackTrace();
        }

        params += "&to=" + to;
        paramsMap.put("to", to);
    }


    public static ComposeMessageRequest.Builder builder(String subject, String text, String to, AccessToken token)  {
        return new ComposeMessageRequest(subject, text, to).new Builder(token);
    }

    public class Builder extends AbstractPostInboxRequest.Builder<ComposeMessageRequest.Builder>  {
        protected Builder(AccessToken token)  {
            super("/compose", token);
        }

        public Builder setModhash(String modhash)  {
            ComposeMessageRequest.this.modhash = modhash;
            params += "&modhash=" + modhash;
            paramsMap.put("modhash", modhash);
            return this;
        }

        public Builder setFromSr(String from_sr)  {
            ComposeMessageRequest.this.from_sr = from_sr;
            params += "&from_sr" + from_sr;
            paramsMap.put("from_sr", from_sr);
            return this;
        }

        @Override
        public ComposeMessageRequest build()  {
            return ComposeMessageRequest.this;
        }

        @Override
        public ComposeMessageRequest.Builder self()  {
            return this;
        }

        @Override
        public Builder builder()  {
            return ComposeMessageRequest.builder(subject, text, to, accessToken);
        }
    }

}
