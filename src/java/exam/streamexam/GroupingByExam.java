package exam.streamexam;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Forrest on 2017. 1. 2..
 */
public class GroupingByExam {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Java", "Scala", "JavaScript", "Groovy");

        Map<Character, List<String>> map = list.stream().collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(map.get('J'));
        System.out.println(map.get('G'));
        System.out.println(map.get('S'));
    }
}
