
package redditjackal.jsonhandlers.listings.redditor;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class RedditorCommentsChildJson {

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

        public RedditorCommentsChildJson.Builder withData(RedditorCommentsDataJson data) {
            this.data = data;
            return this;
        }

        public RedditorCommentsChildJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public RedditorCommentsChildJson build() {
            RedditorCommentsChildJson child = new RedditorCommentsChildJson();
            child.data = data;
            child.kind = kind;
            return child;
        }

    }

}
