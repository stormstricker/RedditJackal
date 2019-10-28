package redditjackal.requests;

public class RedditResponse {
        String response;
        int status;

        public RedditResponse(String response, int status)  {
            this.response = response;
            this.status = status;
        }

        public String getResponse()  {return response;}

        public int getStatus()  {return status;}
}
