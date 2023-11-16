package lesson_47_2023_11_09.maps_methods;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Volodymyr Sh on 13.11.2023
 * project name: AIT_Lessons
 */
public class ComputeMergeExample {
    public static void main(String[] args) {
        // map(K key, BiFunction<Key, Value>

        Map<String, Integer> map = new HashMap<>();
        map.put("key1", 1);
        map.put("key3", 3);
        System.out.println("map (v1): " + map);
        map.compute("key1", (k, v) -> v == null ? 10 : v + 5);
        System.out.println("map (v2): " + map);

        System.out.println("=============== compute ===============");

        map.compute("key1", (k, v) -> v == null ? 10 : null);
        System.out.println("map (v3): " + map);

        System.out.println(map.get("key2"));
        map.computeIfAbsent("key2", k -> 1);
        System.out.println("map (v4): " + map);

        System.out.println("=============== computeIfAbsent ===============");
        map.computeIfAbsent("key2", k -> 9);
        System.out.println("map (v5): " + map);

        System.out.println("=============== computeIfPresent ===============");
        map.computeIfPresent("key3", (key, value) -> value + 1); // key3 - exist;
        System.out.println("map (v6): " + map);

        map.computeIfPresent("key4", (key, value) -> value + 1); // key4 - not exist;
        System.out.println("map (v7): " + map);

        map.put("key4", null);
        map.computeIfPresent("key4", (key, value) -> value + 1); // key4 - not exist;
        System.out.println("map (v8): " + map);

        System.out.println("=============== merge ===============");
        map.merge("key5", 1, (oldValue, value) -> oldValue + value);

    }
}
