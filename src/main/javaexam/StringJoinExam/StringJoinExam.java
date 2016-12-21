package javaexam.StringJoinExam;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Forrest on 2016. 12. 19..
 */
public class StringJoinExam {
    public static void main(String[] args) {
        String str1 = String.join("-", "Java", "Recipe", "is", "Great");

        System.out.println("str1 :: " + str1);

        List<String> list = Arrays.asList("Java", "8", "is", "Greate!");
        String str2 = String.join(" ", list);
        System.out.println("str2 :: " + str2);

        String str3 = String.join("", list);
        System.out.println("str3 :: " + str3);
    }
}
