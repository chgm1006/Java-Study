package javaexam.streamexam;

import java.util.*;
import java.util.stream.Collectors;

/**
 * Stream을 Collection으로 변경하는 예제
 */
public class StreamCollection {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");

        // Stream에 대한 처리를 하고 결과를 List로 변환
        List<String> result1 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println("result1 :: " + result1);

        // Stream에 대한 처릴를 하고 결과를 Set으로 변환
        Set<String> result2 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toSet());
        System.out.println("result2 :: " + result2);

        // Collectors.toCollection() 메소드를 사용하면 변환 후의 내장 클래스를 지정할 수 있음
        List<String> result3 = list.stream().map(s -> s.toUpperCase()).collect(Collectors.toCollection(LinkedList::new));
        System.out.println("result3 :: " + result3);

        // 문자열을 키로 그 문자열의 길이를 넣은 Map으로 변환
        Map<String, Integer> map = list.stream().collect(Collectors.toMap(s -> s, s -> s.length()));
        System.out.println("map :: " + map);
    }

}
