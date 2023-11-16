package lesson_45_2023_11_07;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 * Created by Volodymyr Sh on 07.11.2023
 * project name: AIT_Lessons
 */
public class ListExample {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("hello", "list", "collection", "example", "java"));

        strings.add(2, "Index2");
        System.out.println("add(): " + strings);

        System.out.println("get(): " + strings.get(3));

        System.out.println("remove() by index: " + strings.remove(2));
        System.out.println("remove() -> result: " + strings);

        System.out.println(strings.set(2, "new Collection"));
        System.out.println("set() -> result: " + strings);

        strings.add("new Collection");
        strings.add("new Collection");
        System.out.println(strings);

        System.out.println("indexOf(): " + strings.indexOf("new Collection"));
        System.out.println("lastIndexOf(): " + strings.lastIndexOf("new Collection"));

        List<String> subList = strings.subList(1, 4);
        System.out.println("subList(): " + subList);

        strings.sort((s1,s2) -> s2.compareTo(s1));
        System.out.println("sort(): " + strings);

        System.out.println("strings (start): " + strings);
        Collections.reverse(strings);
        System.out.println("strings (reverse): " + strings);
        Collections.shuffle(strings);
        System.out.println("strings (shuffle): " + strings);





    }
}
