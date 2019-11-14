package redditjackal.exceptions;

public class RedditorNotFoundException extends Exception {
    private static String errorMessage = "Redditor with a given username doesn't exist";

    public RedditorNotFoundException()  {
        super(errorMessage);
    }
}
