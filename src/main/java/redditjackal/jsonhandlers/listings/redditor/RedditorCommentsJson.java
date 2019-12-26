
package redditjackal.jsonhandlers.listings.redditor;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RedditorCommentsJson {

    @Expose
    private RedditorCommentsDataJson data;
    @Expose
    private String kind;

    public RedditorCommentsDataJson getData() {
        return data;
    }

    public String getKind() {
        return kind;
    }

    public static class Builder {

        private RedditorCommentsDataJson data;
        private String kind;

        public RedditorCommentsJson.Builder withData(RedditorCommentsDataJson data) {
            this.data = data;
            return this;
        }

        public RedditorCommentsJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public RedditorCommentsJson build() {
            RedditorCommentsJson redditorCommentsJson = new RedditorCommentsJson();
            redditorCommentsJson.data = data;
            redditorCommentsJson.kind = kind;
            return redditorCommentsJson;
        }

    }

}
