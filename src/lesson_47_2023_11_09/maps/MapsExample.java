package lesson_47_2023_11_09.maps;

import java.util.*;

/**
 * Created by Volodymyr Sh on 09.11.2023
 * project name: AIT_Lessons
 */
public class MapsExample {
    public static void main(String[] args) {
        Map<Integer, String> oldTable = new Hashtable<>(); // Hashtable - устарела. Не рекомендуется использовать.

        Map<Integer, String> map = new HashMap<>();

        map.put(1, "Hello");
        map.put(2, "Java");
        map.put(3, "World");

        Map<Integer, String> map1 = new HashMap<>();
        map1.put(2, "Python");
        map1.put(4, "Orang");
        System.out.println(map1.put(4, "test"));

        System.out.println("map: " + map);

        map.putAll(map1);
        System.out.println("map.putAll: " + map);

        System.out.println("map.containsKey(8): " + map.containsKey(8));
        System.out.println("map.containsValue(\"test\"): " + map.containsValue("test"));

        System.out.println("map.get(1): " + map.get(1));
        System.out.println("map.get(8): " + map.get(8));

        String value = map.getOrDefault(8, "Default value");
        System.out.println("map.getOrDefault: " + value);
        value = map.getOrDefault(1, "Default value");
        System.out.println("map.getOrDefault: " + value);

        System.out.println("map.remove(8): " + map.remove(8));
        System.out.println("map.remove(4): " + map.remove(4));
        System.out.println("map ofter remove: " + map);

//        map.clear();

        System.out.println("map.size(): " + map.size());

        Collection<String> strings = map.values();
        System.out.println("map.values(): " + strings);

        System.out.println("map.isEmpty(): " + map.isEmpty());

        Set<Integer> keys = map.keySet();
        System.out.println("map.keySet(): " + keys);

        System.out.println("============================");

        Set<Map.Entry<Integer, String>> setEntry = map.entrySet();

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println("entry.getKey(): " + entry.getKey());
            System.out.println("entry.getValue(): " + entry.getValue());
            if (entry.getKey().equals(1)) {
                entry.setValue("Red");
            }
        }

        System.out.println("map: " + map);

        // replace VS put

        map.put(9, "Car");
        System.out.println("map.put(9, \"Car\" : " + map);

        map.replace(10, "Green");
        System.out.println("map.replace(10, \"Green\": " + map);

        System.out.println(map.replace(9, "Replace"));
        System.out.println("map.replace(9, \"Replace\"): " + map);

        System.out.println("============================");

        System.out.println(map.replace(9, "any", "new"));
        System.out.println(map);
        System.out.println(map.replace(9, "Replace", "Yes"));
        System.out.println(map);

        System.out.println("============================");
        map.forEach((k, v) -> System.out.println("Key: " + k + "; value: " + v));

    }
}
