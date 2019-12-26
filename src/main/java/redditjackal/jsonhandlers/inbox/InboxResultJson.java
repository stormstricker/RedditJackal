
package redditjackal.jsonhandlers.inbox;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class InboxResultJson {

    @SerializedName("data")
    private InboxDataJson inboxDataJson;
    @SerializedName("kind")
    private String kind;

    public InboxDataJson getInboxDataJson() {
        return inboxDataJson;
    }

    public String getKind() {
        return kind;
    }

    public static class Builder {

        private InboxDataJson inboxDataJson;
        private String kind;

        public InboxResultJson.Builder withData(InboxDataJson inboxDataJson) {
            this.inboxDataJson = inboxDataJson;
            return this;
        }

        public InboxResultJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public InboxResultJson build() {
            InboxResultJson inboxResultJson = new InboxResultJson();
            inboxResultJson.inboxDataJson = inboxDataJson;
            inboxResultJson.kind = kind;
            return inboxResultJson;
        }

    }

}
