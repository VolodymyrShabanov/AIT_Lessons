package lesson_48_2023_11_13;

import java.util.*;

/**
 * Created by Volodymyr Sh on 13.11.2023
 * project name: AIT_Lessons
 */
public class CollectionsEx {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("test", "java", "oranger", "hello", "compute"));

        System.out.println("================= sort and binarySearch =================");
        Collections.sort(strings);
        System.out.println("strings (v1): " + strings);

        Collections.sort(strings, Comparator.comparing(String::length));
        System.out.println("strings (v2): " + strings);

        Collections.sort(strings);
        int index = Collections.binarySearch(strings, "test");
        System.out.println("strings (v3): " + strings);
        System.out.println("index: " + index);


        int index2 = Collections.binarySearch(strings, "test", Comparator.comparing(String::length));
        System.out.println("strings (v4): " + strings);
        System.out.println("index2: " + index2);

        System.out.println("================= reverse and shuffle =================");
        Collections.reverse(strings);
        System.out.println("strings (v5) reverse: " + strings);

        Collections.shuffle(strings);
        System.out.println("strings (v6) shuffle: " + strings);

        Collections.fill(strings, "str");
        System.out.println("strings (v7) fill: " + strings);

        List<String> strings2 = new ArrayList<>(List.of("str1", "str2", "str3", "str4", "str5", "str6", "str7"));
        Collections.swap(strings2, 1, 3);
        System.out.println("strings2 (v8) swap : " + strings2);

        Collections.copy(strings2, strings);
        System.out.println("strings2 (v9) copy : " + strings);


        System.out.println("==================================");

        List<Integer> integers = new ArrayList<>(List.of(1, 4, 5, 6, -10, 15));
        int min = Collections.min(integers);
        int max = Collections.max(integers);

        System.out.println("min: " + min + "; max: " + max);

        min = Collections.min(integers, Comparator.reverseOrder());
        max = Collections.max(integers, Comparator.reverseOrder());

        System.out.println("min: " + min + "; max: " + max);

        Collections.addAll(integers, 1, 2, 3, 4, 5);
        System.out.println("integers: " + integers);

        System.out.println("disjoint: " + Collections.disjoint(integers, List.of(100, 50, 25)));

        System.out.println("empty...: " + Collections.emptyMap());

        Collection<Integer> col =  Collections.unmodifiableCollection(integers);
        List<Integer> list = Collections.unmodifiableList(integers);

        Collection<Integer> synh = Collections.synchronizedCollection(integers);
        List<Integer> synhromizelist = Collections.synchronizedList(integers);


    }

}
