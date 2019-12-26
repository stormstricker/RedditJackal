
package redditjackal.jsonhandlers.things.subreddit;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class AboutSubredditJson {

    @Expose
    private AboutSubredditDataJson data;
    @Expose
    private String kind;

    public AboutSubredditDataJson getData() {
        return data;
    }

    public String getKind() {
        return kind;
    }

    public static class Builder {

        private AboutSubredditDataJson data;
        private String kind;

        public AboutSubredditJson.Builder withData(AboutSubredditDataJson data) {
            this.data = data;
            return this;
        }

        public AboutSubredditJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public AboutSubredditJson build() {
            AboutSubredditJson aboutSubredditJson = new AboutSubredditJson();
            aboutSubredditJson.data = data;
            aboutSubredditJson.kind = kind;
            return aboutSubredditJson;
        }

    }

}
