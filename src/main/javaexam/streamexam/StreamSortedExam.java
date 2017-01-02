package javaexam.streamexam;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Forrest on 2017. 1. 2..
 */
public class StreamSortedExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
        list.stream()
                .sorted()
                .forEach(System.out::println);

        System.out.println();
        list.stream()
                .sorted((a, b) -> a.length()-b.length())
                .forEach(System.out::println);
    }
}
