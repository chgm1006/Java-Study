package exam.predicateexam;

import java.util.function.Predicate;

/**
 * Created by Forrest on 2016. 12. 19..
 */
public class PredicateExam {
    public static void main(String[] args) {
        String str = "Javascript";

        Predicate<String> condition = s -> s.startsWith("Java");
        boolean result = condition.test(str);

        System.out.println("result :: " + result);

    }
}
