
package redditjackal.jsonhandlers.redditor;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AboutRedditorJson {

    @SerializedName("data")
    private AboutRedditorDataJson aboutRedditorDataJson;
    @Expose
    private String kind;

    public AboutRedditorDataJson getAboutRedditorDataJson() {
        return aboutRedditorDataJson;
    }

    public String getKind() {
        return kind;
    }

    public static class Builder {

        private AboutRedditorDataJson aboutRedditorDataJson;
        private String kind;

        public AboutRedditorJson.Builder withData(AboutRedditorDataJson aboutRedditorDataJson) {
            this.aboutRedditorDataJson = aboutRedditorDataJson;
            return this;
        }

        public AboutRedditorJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public AboutRedditorJson build() {
            AboutRedditorJson aboutRedditorJson = new AboutRedditorJson();
            aboutRedditorJson.aboutRedditorDataJson = aboutRedditorDataJson;
            aboutRedditorJson.kind = kind;
            return aboutRedditorJson;
        }

    }
}
