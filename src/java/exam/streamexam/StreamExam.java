package exam.streamexam;

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

        System.out.println();
        List<String> list2 = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");
        list2.stream().filter(s -> s.startsWith("J"))
                .forEach(System.out::println);

        System.out.println();
        List<String> list3 = Arrays.asList("Java,Groovy", "C#,VB.NET");
        list3.stream()
                .flatMap(s -> Stream.of(s.split(",")))
                .forEach(System.out::println);

    }
}
