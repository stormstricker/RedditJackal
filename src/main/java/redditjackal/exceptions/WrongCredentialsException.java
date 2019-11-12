package redditjackal.exceptions;

public class WrongCredentialsException extends Exception {
    private static String errorMessage = "You have provided the wrong credentials. Couldn't login.";

    public WrongCredentialsException()  {
        super(errorMessage);
    }
}
