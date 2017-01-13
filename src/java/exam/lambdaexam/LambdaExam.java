package exam.lambdaexam;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Forrest on 2016. 12. 16..
 */
public class LambdaExam {
    public static void main(String[] args) {
        // lambda를 사용하지 않은 list 정렬
        List<String> list = Arrays.asList("Scala", "Java", "Groovy");
        System.out.println("원본 :: " + list);
        list.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });

        System.out.println("Lambda를 사용하지 않은 정렬");
        System.out.println(list);
        System.out.println();

        // lambda를 사용한 정렬
        list = Arrays.asList("Three", "Twoo", "One");
        System.out.println("원본 :: " + list);
        list.sort((String s1, String s2) -> s1.length() - s2.length());
        System.out.println("Lambda를 사용한 정렬");
        System.out.println(list);
    }
}
