package redditjackal.entities.inbox;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.inbox.InboxChildJson;
import redditjackal.jsonhandlers.inbox.InboxDataJson;

import java.util.List;

public class InboxMessage {
    private InboxChildJson child;

    public InboxMessage(String jsonString)  {
        Gson gson = new Gson();
        child = gson.fromJson(jsonString, new TypeToken<InboxChildJson>(){}.getType());
    }

    public InboxMessage(InboxChildJson child)  {
        this.child = child;
    }

    public void read()  {

    }

    public boolean isPrivateMessage()  {
        return getWasComment();
    }

    //auto-generated
    public String getKind() {
        return child.getKind();
    }

    private InboxDataJson getInboxUnreadData() {
        return child.getInboxDataJson();
    }

    public Object getAfter() {
        return getInboxUnreadData().getAfter();
    }

    public String getAuthor() {
        return getInboxUnreadData().getAuthor();
    }

    public Object getBefore() {
        return getInboxUnreadData().getBefore();
    }

    public String getBody() {
        return getInboxUnreadData().getBody();
    }

    public String getBodyHtml() {
        return getInboxUnreadData().getBodyHtml();
    }

    public List<InboxChildJson> getInboxUnreadChildren() {
        return getInboxUnreadData().getInboxChildJsons();
    }

    public String getContext() {
        return getInboxUnreadData().getContext();
    }

    public Long getCreated() {
        return getInboxUnreadData().getCreated();
    }

    public Long getCreatedUtc() {
        return getInboxUnreadData().getCreatedUtc();
    }

    public String getDest() {
        return getInboxUnreadData().getDest();
    }

    public Long getDist() {
        return getInboxUnreadData().getDist();
    }

    public Object getDistinguished() {
        return getInboxUnreadData().getDistinguished();
    }

    public Object getFirstMessage() {
        return getInboxUnreadData().getFirstMessage();
    }

    public Object getFirstMessageName() {
        return getInboxUnreadData().getFirstMessageName();
    }

    public String getId() {
        return getInboxUnreadData().getId();
    }

    public Object getLikes() {
        return getInboxUnreadData().getLikes();
    }

    public Object getModhash() {
        return getInboxUnreadData().getModhash();
    }

    public String getName() {
        return getInboxUnreadData().getName();
    }

    public Boolean getNew() {
        return getInboxUnreadData().getNew();
    }

    public Object getNumComments() {
        return getInboxUnreadData().getNumComments();
    }

    public Object getParentId() {
        return getInboxUnreadData().getParentId();
    }

    public String getReplies() {
        return getInboxUnreadData().getReplies();
    }

    public Long getScore() {
        return getInboxUnreadData().getScore();
    }

    public String getSubject() {
        return getInboxUnreadData().getSubject();
    }

    public Object getSubreddit() {
        return getInboxUnreadData().getSubreddit();
    }

    public Object getSubredditNamePrefixed() {
        return getInboxUnreadData().getSubredditNamePrefixed();
    }

    public Boolean getWasComment() {
        return getInboxUnreadData().getWasComment();
    }
}
