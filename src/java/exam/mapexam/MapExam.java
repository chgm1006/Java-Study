package exam.mapexam;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * Created by Forrest on 2017. 1. 2..
 */
public class MapExam {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("A", "1");
        map.put("B", "2");
        map.put("C", "3");

        System.out.println(map.get("A"));
        System.out.println(map.get("B"));
        System.out.println(map.get("C"));

        Collection<String> collection = map.values();
        for (String value : collection) {
            System.out.println(value);
        }

        Set<String> set = map.keySet();
        System.out.println(set);
        System.out.println(set.contains("A"));
        if (map.keySet().contains("B")) {
            System.out.println("True");
        }
    }
}
