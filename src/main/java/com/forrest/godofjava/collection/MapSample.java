package com.forrest.godofjava.collection;

import java.util.*;

/**
 * Created by chgm1006 on 2015. 4. 7..
 */
public class MapSample {
  public static void main(String[] args) {
    MapSample sample = new MapSample();
    sample.checkHashMap();
    sample.checkHashMapEntry();
    sample.checkTreeMap();
  }

  private void checkTreeMap() {
    System.out.println();
    TreeMap<String, String> map = new TreeMap<>();
    map.put("A", "a");
    map.put("B", "b");
    map.put("C", "c");
    map.put("3", "d");
    map.put("1", "e");
    map.put("가", "f");
    map.put("a", "g");
    map.put("b", "h");
    map.put("I", "i");
    map.put("4", "j");

    Set<Map.Entry<String, String>> entries = map.entrySet();
    for (Map.Entry<String, String> tempEntry : entries) {
      System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
    }
  }

  private void checkHashMapEntry() {

    HashMap<String, String> map = new HashMap<>();
    map.put("A", "a");
    map.put("B", "b");
    map.put("C", "c");
    map.put("D", "d");
    map.put("E", "e");

    Set<Map.Entry<String, String>> entries = map.entrySet();
    for (Map.Entry<String, String> tempEntry : entries) {
      System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
    }


    System.out.println();

    System.out.println(map.containsKey("A"));
    System.out.println(map.containsKey("Z"));

    System.out.println(map.containsValue("a"));
    System.out.println(map.containsValue("z"));

    System.out.println();
    map.remove("A");
    Set<Map.Entry<String, String>> entries1 = map.entrySet();
    for (Map.Entry<String, String> tempEntry : entries1) {
      System.out.println(tempEntry.getKey() + " = " + tempEntry.getValue());
    }
  }

  private void checkHashMap() {
    HashMap<String, String> map = new HashMap<>();
    map.put("A", "a");
//    System.out.println(map.get("A"));
//    System.out.println(map.get("B"));
//
//    map.put("A", "1");
//    System.out.println(map.get("A"));

    map.put("C", "c");
    map.put("D", "d");
    Set<String> keySet = map.keySet();

    for (String tempKey : keySet) {
      System.out.println(tempKey + " = " + map.get(tempKey));
    }

    HashMap<String, String> map2 = new HashMap<>();
    map2.put("A", "a");
    map2.put("C", "c");
    map2.put("D", "d");

    Collection<String> values = map2.values();

    for (String tempValues : values) {
      System.out.println(tempValues);
    }

    System.out.println();
    Iterator<String> iterator = values.iterator();
    while (iterator.hasNext()) {
      System.out.println(iterator.next());
    }

  }
}
