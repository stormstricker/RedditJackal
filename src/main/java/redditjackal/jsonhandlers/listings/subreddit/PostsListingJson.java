
package redditjackal.jsonhandlers.listings.subreddit;

import com.google.gson.annotations.Expose;

import javax.annotation.Generated;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
public class PostsListingJson {

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

        public PostsListingJson.Builder withData(PostsListingDataJson data) {
            this.data = data;
            return this;
        }

        public PostsListingJson.Builder withKind(String kind) {
            this.kind = kind;
            return this;
        }

        public PostsListingJson build() {
            PostsListingJson postsListingJson = new PostsListingJson();
            postsListingJson.data = data;
            postsListingJson.kind = kind;
            return postsListingJson;
        }

    }

}
