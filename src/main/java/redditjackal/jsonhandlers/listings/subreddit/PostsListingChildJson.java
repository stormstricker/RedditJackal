
package redditjackal.jsonhandlers.listings.subreddit;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PostsListingChildJson {
    @Expose
    private PostsListingDataJson data;
    @Expose
    private String kind;

    public PostsListingDataJson getData() {
        return data;
    }

    public String getKind() {
        return kind;
    }

    public static class Builder {

        private PostsListingDataJson data;
        private String kind;

        public PostsListingChildJson.Builder withData(PostsListingDataJson data) {
            this.data = data;
            return this;
        }

        public PostsListingChildJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public PostsListingChildJson build() {
            PostsListingChildJson child = new PostsListingChildJson();
            child.data = data;
            child.kind = kind;
            return child;
        }

    }

}
