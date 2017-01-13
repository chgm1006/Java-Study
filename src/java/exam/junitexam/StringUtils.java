package exam.junitexam;

/**
 * Created by Forrest on 2017. 1. 3..
 */
public class StringUtils {
    public static boolean isEmpty(String value) {
        if (value == null || "".equals(value)) {
            return true;
        } else {
            return false;
        }
    }
}
