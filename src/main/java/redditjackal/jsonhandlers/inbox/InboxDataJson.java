
package redditjackal.jsonhandlers.inbox;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class InboxDataJson {
    @Expose
    private Object after;
    @Expose
    private String author;
    @Expose
    private Object before;
    @Expose
    private String body;
    @SerializedName("body_html")
    private String bodyHtml;
    @SerializedName("children")
    private List<InboxChildJson> inboxChildJsons;
    @Expose
    private String context;
    @Expose
    private Long created;
    @SerializedName("created_utc")
    private Long createdUtc;
    @Expose
    private String dest;
    @Expose
    private Long dist;
    @Expose
    private Object distinguished;
    @SerializedName("first_message")
    private Object firstMessage;
    @SerializedName("first_message_name")
    private Object firstMessageName;
    @Expose
    private String id;
    @Expose
    private Object likes;
    @Expose
    private Object modhash;
    @Expose
    private String name;
    @SerializedName("newBoolean")
    private Boolean newBoolean;
    @SerializedName("num_comments")
    private Object numComments;
    @SerializedName("parent_id")
    private Object parentId;
    @Expose
    private String replies;
    @Expose
    private Long score;
    @Expose
    private String subject;
    @Expose
    private Object subreddit;
    @SerializedName("subreddit_name_prefixed")
    private Object subredditNamePrefixed;
    @SerializedName("was_comment")
    private Boolean wasComment;

    public Object getAfter() {
        return after;
    }

    public String getAuthor() {
        return author;
    }

    public Object getBefore() {
        return before;
    }

    public String getBody() {
        return body;
    }

    public String getBodyHtml() {
        return bodyHtml;
    }

    public List<InboxChildJson> getInboxChildJsons() {
        return inboxChildJsons;
    }

    public String getContext() {
        return context;
    }

    public Long getCreated() {
        return created;
    }

    public Long getCreatedUtc() {
        return createdUtc;
    }

    public String getDest() {
        return dest;
    }

    public Long getDist() {
        return dist;
    }

    public Object getDistinguished() {
        return distinguished;
    }

    public Object getFirstMessage() {
        return firstMessage;
    }

    public Object getFirstMessageName() {
        return firstMessageName;
    }

    public String getId() {
        return id;
    }

    public Object getLikes() {
        return likes;
    }

    public Object getModhash() {
        return modhash;
    }

    public String getName() {
        return name;
    }

    public Boolean getNew() {
        return newBoolean;
    }

    public Object getNumComments() {
        return numComments;
    }

    public Object getParentId() {
        return parentId;
    }

    public String getReplies() {
        return replies;
    }

    public Long getScore() {
        return score;
    }

    public String getSubject() {
        return subject;
    }

    public Object getSubreddit() {
        return subreddit;
    }

    public Object getSubredditNamePrefixed() {
        return subredditNamePrefixed;
    }

    public Boolean getWasComment() {
        return wasComment;
    }

    public static class Builder {

        private Object after;
        private String author;
        private Object before;
        private String body;
        private String bodyHtml;
        private List<InboxChildJson> inboxChildJsons;
        private String context;
        private Long created;
        private Long createdUtc;
        private String dest;
        private Long dist;
        private Object distinguished;
        private Object firstMessage;
        private Object firstMessageName;
        private String id;
        private Object likes;
        private Object modhash;
        private String name;
        private Boolean newBoolean;
        private Object numComments;
        private Object parentId;
        private String replies;
        private Long score;
        private String subject;
        private Object subreddit;
        private Object subredditNamePrefixed;
        private Boolean wasComment;

        public InboxDataJson.Builder withAfter(Object after) {
            this.after = after;
            return this;
        }

        public InboxDataJson.Builder withAuthor(String author) {
            this.author = author;
            return this;
        }

        public InboxDataJson.Builder withBefore(Object before) {
            this.before = before;
            return this;
        }

        public InboxDataJson.Builder withBody(String body) {
            this.body = body;
            return this;
        }

        public InboxDataJson.Builder withBodyHtml(String bodyHtml) {
            this.bodyHtml = bodyHtml;
            return this;
        }

        public InboxDataJson.Builder withChildren(List<InboxChildJson> inboxChildJsons) {
            this.inboxChildJsons = inboxChildJsons;
            return this;
        }

        public InboxDataJson.Builder withContext(String context) {
            this.context = context;
            return this;
        }

        public InboxDataJson.Builder withCreated(Long created) {
            this.created = created;
            return this;
        }

        public InboxDataJson.Builder withCreatedUtc(Long createdUtc) {
            this.createdUtc = createdUtc;
            return this;
        }

        public InboxDataJson.Builder withDest(String dest) {
            this.dest = dest;
            return this;
        }

        public InboxDataJson.Builder withDist(Long dist) {
            this.dist = dist;
            return this;
        }

        public InboxDataJson.Builder withDistinguished(Object distinguished) {
            this.distinguished = distinguished;
            return this;
        }

        public InboxDataJson.Builder withFirstMessage(Object firstMessage) {
            this.firstMessage = firstMessage;
            return this;
        }

        public InboxDataJson.Builder withFirstMessageName(Object firstMessageName) {
            this.firstMessageName = firstMessageName;
            return this;
        }

        public InboxDataJson.Builder withId(String id) {
            this.id = id;
            return this;
        }

        public InboxDataJson.Builder withLikes(Object likes) {
            this.likes = likes;
            return this;
        }

        public InboxDataJson.Builder withModhash(Object modhash) {
            this.modhash = modhash;
            return this;
        }

        public InboxDataJson.Builder withName(String name) {
            this.name = name;
            return this;
        }

        public InboxDataJson.Builder withNew(Boolean newBoolean) {
            this.newBoolean = newBoolean;
            return this;
        }

        public InboxDataJson.Builder withNumComments(Object numComments) {
            this.numComments = numComments;
            return this;
        }

        public InboxDataJson.Builder withParentId(Object parentId) {
            this.parentId = parentId;
            return this;
        }

        public InboxDataJson.Builder withReplies(String replies) {
            this.replies = replies;
            return this;
        }

        public InboxDataJson.Builder withScore(Long score) {
            this.score = score;
            return this;
        }

        public InboxDataJson.Builder withSubject(String subject) {
            this.subject = subject;
            return this;
        }

        public InboxDataJson.Builder withSubreddit(Object subreddit) {
            this.subreddit = subreddit;
            return this;
        }

        public InboxDataJson.Builder withSubredditNamePrefixed(Object subredditNamePrefixed) {
            this.subredditNamePrefixed = subredditNamePrefixed;
            return this;
        }

        public InboxDataJson.Builder withWasComment(Boolean wasComment) {
            this.wasComment = wasComment;
            return this;
        }

        public InboxDataJson build() {
            InboxDataJson inboxDataJson = new InboxDataJson();
            inboxDataJson.after = after;
            inboxDataJson.author = author;
            inboxDataJson.before = before;
            inboxDataJson.body = body;
            inboxDataJson.bodyHtml = bodyHtml;
            inboxDataJson.inboxChildJsons = inboxChildJsons;
            inboxDataJson.context = context;
            inboxDataJson.created = created;
            inboxDataJson.createdUtc = createdUtc;
            inboxDataJson.dest = dest;
            inboxDataJson.dist = dist;
            inboxDataJson.distinguished = distinguished;
            inboxDataJson.firstMessage = firstMessage;
            inboxDataJson.firstMessageName = firstMessageName;
            inboxDataJson.id = id;
            inboxDataJson.likes = likes;
            inboxDataJson.modhash = modhash;
            inboxDataJson.name = name;
            inboxDataJson.newBoolean = newBoolean;
            inboxDataJson.numComments = numComments;
            inboxDataJson.parentId = parentId;
            inboxDataJson.replies = replies;
            inboxDataJson.score = score;
            inboxDataJson.subject = subject;
            inboxDataJson.subreddit = subreddit;
            inboxDataJson.subredditNamePrefixed = subredditNamePrefixed;
            inboxDataJson.wasComment = wasComment;
            return inboxDataJson;
        }

    }

}
