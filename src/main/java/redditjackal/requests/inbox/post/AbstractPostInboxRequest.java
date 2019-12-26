package redditjackal.requests.inbox.post;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.inbox.InboxResultJson;
import redditjackal.requests.AbstractRequest;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;
import redditjackal.requests.inbox.get.AbstractGetInboxRequest;

public class AbstractPostInboxRequest extends AbstractRequest {
    protected String modhash;

    {
        setRequestType(REQUEST_TYPE.POST);
        link = "https://oauth.reddit.com/api";
    }

    protected AbstractPostInboxRequest() {}

    public abstract class Builder<T extends Builder<T>> extends AbstractRequest.Builder<T> {
        protected Builder(String type, AccessToken token) {
            super(type, token);
        }
    }

    @Override
    public InboxResultJson execute()  {
        try  {
            RedditResponse response = send();
            Gson gson = new Gson();
            return gson.fromJson(response.getResponse(), new TypeToken<InboxResultJson>(){}.getType());
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }
    }
}
