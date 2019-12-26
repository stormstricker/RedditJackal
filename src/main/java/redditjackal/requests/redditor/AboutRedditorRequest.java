package redditjackal.requests.redditor;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import redditjackal.exceptions.RedditorNotFoundException;
import redditjackal.jsonhandlers.redditor.AboutRedditorJson;
import redditjackal.requests.AbstractRequest;
import redditjackal.requests.AccessToken;
import redditjackal.requests.RedditResponse;

public class AboutRedditorRequest extends AbstractRequest  {
    protected String username;

    {
        setRequestType(REQUEST_TYPE.GET);
        link = "https://oauth.reddit.com/user";
    }

    protected AboutRedditorRequest(String username)  {
        this.username = username;
    }

    public static AboutRedditorRequest.Builder builder(String username, AccessToken token)  {
        return new AboutRedditorRequest(username).new Builder(token);
    }

    public class Builder extends AbstractRequest.Builder<AboutRedditorRequest.Builder>  {
        protected Builder(AccessToken token)  {
            super("/" + username + "/about", token);
        }

        @Override
        public AboutRedditorRequest build()  {
            updateLink();
            return AboutRedditorRequest.this;
        }

        @Override
        public AboutRedditorRequest.Builder self()  {
            return this;
        }

        @Override
        public AboutRedditorRequest.Builder builder()  {return AboutRedditorRequest.builder(username, accessToken);}
    }

    @Override
    public AboutRedditorJson execute() throws RedditorNotFoundException {
        try  {
            RedditResponse response = send();

            if (response.getStatus()==404)  {
                throw new RedditorNotFoundException();
            }

            Gson gson = new Gson();
            return gson.fromJson(response.getResponse(), new TypeToken<AboutRedditorJson>(){}.getType());
        }
        catch (Exception e)  {
            e.printStackTrace();
            return null;
        }
    }
}
