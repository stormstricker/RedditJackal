package redditjackal.utils;

public class JackalUtils {
    public static int max(int... numbers)  {
        int result = numbers[0];

        for (int number: numbers)  {
            result = (number>result) ? number : result;
        }

        return result;
    }
}
