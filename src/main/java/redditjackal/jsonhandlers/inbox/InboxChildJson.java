
package redditjackal.jsonhandlers.inbox;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class InboxChildJson {

    @SerializedName("data")
    private InboxDataJson inboxDataJson;
    @Expose
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

        public InboxChildJson.Builder withData(InboxDataJson inboxDataJson) {
            this.inboxDataJson = inboxDataJson;
            return this;
        }

        public InboxChildJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public InboxChildJson build() {
            InboxChildJson inboxChildJson = new InboxChildJson();
            inboxChildJson.inboxDataJson = inboxDataJson;
            inboxChildJson.kind = kind;
            return inboxChildJson;
        }

    }

}
