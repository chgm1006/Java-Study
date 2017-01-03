package javaexam.setexam;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

/**
 * Created by Forrest on 2017. 1. 2..
 */
public class HashSetExam {
    public static void main(String[] args) {
        Set<String> hashSet = new HashSet<>();
        hashSet.add("A");
        hashSet.add("C");
        hashSet.add("E");
        hashSet.add("D");
        hashSet.add("B");
        System.out.println(hashSet);

        Set<String> linkedSet = new LinkedHashSet<>();
        linkedSet.add("A");
        linkedSet.add("C");
        linkedSet.add("E");
        linkedSet.add("D");
        linkedSet.add("B");
        System.out.println(linkedSet);

        Set<String> treeSet = new TreeSet<>();
        treeSet.add("A");
        treeSet.add("C");
        treeSet.add("E");
        treeSet.add("D");
        treeSet.add("B");
        System.out.println(treeSet);
    }
}
