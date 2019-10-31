package redditjackal.entities;

public class NotLoggedInException extends Exception {
        private static String errorMessage = "You are not logged in";

        public NotLoggedInException()  {
        super(errorMessage);
    }
}
