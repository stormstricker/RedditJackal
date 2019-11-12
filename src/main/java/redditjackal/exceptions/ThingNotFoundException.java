package redditjackal.exceptions;

public class ThingNotFoundException extends Exception {
        public ThingNotFoundException(String errorMessage, Throwable err)  {
                super(errorMessage, err);
            }

}
