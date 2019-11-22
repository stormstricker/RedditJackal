package redditjackal.requests.inbox.get;


import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.inbox.InboxResultJson;
import redditjackal.requests.AbstractRequest;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;

public abstract class AbstractGetInboxRequest extends AbstractRequest {
    protected boolean mark;
    private String after;
    private String before;
    private int count;  //0
    private boolean include_categories;
    private int limit;  //25-100
    private String show;
    private Object sr_detail;

    {
        setRequestType(REQUEST_TYPE.GET);
        link = "https://oauth.reddit.com/message";
    }

    protected AbstractGetInboxRequest()  {}

    public static Builder builder(String type)  {
        return null;
    }

    public abstract class Builder<T extends Builder<T>> extends AbstractRequest.Builder<T>  {
        protected Builder(String type, AccessToken token)  {
            super(type, token);
        }

        public T setMark(boolean mark) {
            AbstractGetInboxRequest.this.mark = mark;
            params +="&mark=" + mark;
            return (T) self();
        }

        public T setAfter(String after) {
            AbstractGetInboxRequest.this.after = after;
            params +="&after=" + after;
            return (T) self();
        }

        public T setBefore(String before) {
            AbstractGetInboxRequest.this.before = before;
            params +="&before=" + before;
            return (T) self();
        }

        public T setCount(int count) {
            AbstractGetInboxRequest.this.count = count;
            params +="&count=" + count;
            return (T) self();
        }

        public T setIncludeCategories(boolean includeCategories) {
            AbstractGetInboxRequest.this.include_categories = includeCategories;
            params +="&include_categories=" + includeCategories;
            return (T) self();
        }

        public T setLimit(int limit) {
            AbstractGetInboxRequest.this.limit = limit;
            params +="&limit=" + limit;
            return (T) self();
        }

        public T setShow(String show) {
            AbstractGetInboxRequest.this.show = show;
            params +="&show=" + show;
            return (T) self();
        }

        public T setSr_detail(Object sr_detail) {
            AbstractGetInboxRequest.this.sr_detail = sr_detail;
            params +="&sr_detail=" + sr_detail;
            return (T) self();
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

