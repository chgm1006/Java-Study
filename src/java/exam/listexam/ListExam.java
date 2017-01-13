package exam.listexam;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

/**
 * Created by Forrest on 2016. 12. 28..
 */
public class ListExam {

    public static void main(String[] args) {
        List<String> list1 = new ArrayList<>();
        list1.add("A");
        list1.add("B");
        list1.add("C");
        list1.add("X");
        list1.add("D");
        list1.add("Y");
        list1.add("E");

        System.out.println("list1 :: " + list1);


        List<String> list2 = new ArrayList<>();
        list2.add("X");
        list2.add("Y");
        System.out.println("list2 :: " + list2);

        List<String> list3 = new ArrayList<>();
        list3.add("A");
        list3.add("B");
        System.out.println("list3 :: " + list3);

        System.out.println("list1.remove :: " + list1.remove(2));
        System.out.println("list1 :: " + list1);

        System.out.println("list1.remove :: " + list1.remove("D"));
        System.out.println("list1 :: " + list1);

        System.out.println("list1.remove :: " + list1.removeAll(list2));
        System.out.println("list1 :: " + list1);

        list1.clear();
        System.out.println("list1.size() :: " + list1.size());
        System.out.println("list1.isEmpty :: " + list1.isEmpty());


        List<String> list4 = new ArrayList<>();
        list4.add("Java");
        list4.add("JavaScript");
        list4.add("CSS");
        list4.add("HTML");


        list4.removeIf(s -> s.startsWith("J"));
        System.out.println("list4 :: " + list4);
        list4.forEach(s -> System.out.println(s));

        for (Constructor constructor : Hashtable.class.getConstructors()) {
            System.out.println(constructor);
        }
        for (Method method : Hashtable.class.getMethods()) {
            System.out.println(method.getName());
        }


    }
}
