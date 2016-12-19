package javaexam.unaryoperatorexam;

import java.util.function.UnaryOperator;

/**
 * Created by Forrest on 2016. 12. 19..
 */
public class UnaryOperatorExam {
    public static void main(String[] args) {
        String str = "java";
        UnaryOperator<String> toUpper = s -> s.toUpperCase();

        String s = toUpper.apply(str);
        System.out.println("s :: " + s);

        String s2 = str.toUpperCase();
        System.out.println("s2 :: " + s2);

    }
}
