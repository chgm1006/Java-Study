package godofjava.collection;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.*;

public class MapSample {
    private void saveAndLoadProperties() {
        try {
//      String fileName = "test.properties";
            String fileName = "test.xml";
            File propertiesFile = new File(fileName);
            FileOutputStream fileOutputStream = new FileOutputStream(propertiesFile);
            Properties properties = new Properties();
            properties.setProperty("Writer", "Forrest, Choi");
            properties.setProperty("WriterHome", "Http://www.guru-forrest.com");
//      properties.store(fileOutputStream, "Basic Properties file.");
            properties.storeToXML(fileOutputStream, "Basic XML file.");
            fileOutputStream.close();

            FileInputStream fileInputStream = new FileInputStream(propertiesFile);
            Properties propertiesLoaded = new Properties();
//      propertiesLoaded.load(fileInputStream);
            propertiesLoaded.loadFromXML(fileInputStream);
            fileInputStream.close();
            System.out.println(propertiesLoaded);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    private void checkProperties() {
        System.out.println();
        Properties properties = System.getProperties();
        Set<Object> keySet = properties.keySet();
        for (Object tempObject : keySet) {
            System.out.println(tempObject + " = " + properties.get(tempObject));
        }
    }

    private void checkTreeMap() {
        System.out.println();
        TreeMap<String, String> map = new TreeMap();
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

        HashMap<String, String> map = new HashMap();
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
        HashMap<String, String> map = new HashMap();
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

        HashMap<String, String> map2 = new HashMap();
        map2.put("A", "a");
        map2.put("C", "c");
        map2.put("D", "d");

        Collection<String> values = map2.values();

        for (String tempValues : values) {
            System.out.println(tempValues);
        }

        System.out.println();
//    Iterator<String> iterator = values.iterator();
//    while (iterator.hasNext()) {
//      System.out.println(iterator.next());
//    }

    }

    public static void main(String[] args) {
        MapSample sample = new MapSample();
//    sample.checkHashMap();
//    sample.checkHashMapEntry();
//    sample.checkTreeMap();
//    sample.checkProperties();
        sample.saveAndLoadProperties();

    }


}
