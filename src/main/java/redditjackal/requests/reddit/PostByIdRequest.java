package redditjackal.requests.reddit;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.listings.subreddit.PostsListingJson;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;

public class PostByIdRequest extends ThingByIdRequest {
    public static PostByIdRequest.Builder builder(AccessToken token)  {
        return new PostByIdRequest().new Builder(token);
    }

    public class Builder extends ThingByIdRequest.Builder<PostByIdRequest.Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
        }

        @Override
        public PostByIdRequest build()  {
            updateLink();
            return PostByIdRequest.this;
        }

        @Override
        public PostByIdRequest.Builder self()  {
            return this;
        }

        @Override
        public PostByIdRequest.Builder builder()  {
            return PostByIdRequest.builder(accessToken);
        }
    }

    @Override
    public PostsListingJson execute()  {
        try  {
            RedditResponse response = send();
            Gson gson = new Gson();
            return gson.fromJson(response.getResponse(), new TypeToken<PostsListingJson>(){}.getType());
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }
    }
}
