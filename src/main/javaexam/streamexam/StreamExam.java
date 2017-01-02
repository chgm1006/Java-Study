package javaexam.streamexam;

import java.util.*;
import java.util.stream.Stream;

/**
 * Created by Forrest on 2017. 1. 2..
 */
public class StreamExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
        Stream<String> s1 = list.stream();

        s1.filter(s -> s.startsWith("J"))
                .map(s -> s.toUpperCase())
                .sorted((a, b) -> a.length() - b.length())
                .forEach(System.out::println);
        System.out.println(s1);

        Set<String> set = new HashSet<>();
        Stream<String> s2 = set.stream();

        Map<String, String> map = new HashMap<>();
        Stream<Map.Entry<String, String>> s3 = map.entrySet().stream();

    }
}
