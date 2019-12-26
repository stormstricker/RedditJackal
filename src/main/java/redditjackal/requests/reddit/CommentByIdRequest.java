package redditjackal.requests.reddit;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.jsonhandlers.listings.redditor.RedditorCommentsJson;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;

public class CommentByIdRequest extends ThingByIdRequest {
    public static Builder builder(AccessToken token)  {
        return new CommentByIdRequest().new Builder(token);
    }

    public class Builder extends ThingByIdRequest.Builder<Builder>  {
        protected Builder(AccessToken token)  {
            super(token);
        }

        @Override
        public CommentByIdRequest build()  {
            updateLink();
            return CommentByIdRequest.this;
        }

        @Override
        public Builder self()  {
            return this;
        }

        @Override
        public Builder builder()  {
            return CommentByIdRequest.builder(accessToken);
        }
    }

    @Override
    public RedditorCommentsJson execute()  {
        try  {
            RedditResponse response = send();
            Gson gson = new Gson();
            RedditorCommentsJson result = gson.fromJson(response.getResponse(), new TypeToken<RedditorCommentsJson>(){}.getType());
            return result;
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }
    }
}
