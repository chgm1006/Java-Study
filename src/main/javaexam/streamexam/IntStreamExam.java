package javaexam.streamexam;

import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * Created by Forrest on 2017. 1. 2..
 */
public class IntStreamExam {
    public static void main(String[] args) {
        IntStream intStream1 = IntStream.of(1, 2, 3);
        intStream1.forEach(System.out::println);
        System.out.println();

        int[] array = {1, 2, 3};
        IntStream intStream2 = IntStream.of(array);
        intStream2.forEach(System.out::println);
        System.out.println();

        IntStream intStream3 = IntStream.range(1, 10);
        intStream3.forEach(System.out::println);
        System.out.println();

        IntStream intStream4 = IntStream.rangeClosed(1, 10);
        intStream4.forEach(System.out::println);
        System.out.println();

        Stream<String> stream = Stream.of("Java", "Scala", "JavaScript", "Groovy");
        IntStream intStream = stream.mapToInt(s -> s.length());
//        System.out.println(intStream.count());
        intStream.forEach(System.out::println);

        IntStream iterate = IntStream.iterate(0, i -> i + 1);
        long count = iterate.count();
        System.out.println(count);

    }
}
