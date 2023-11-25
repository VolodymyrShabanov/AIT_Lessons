package lesson_54_2023_11_22;

import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 22.11.2023
 * project name: AIT_Lessons
 */
public class DataFilters {
    public static void main(String[] args) {
        // ======= Промежуточные методы: =======
        // filter(Predicate<? super T> predicate)
        // distinct()
        // limit(long maxSize)
        // skip(long n)
        // lakeWhile(Predicate<T> predicate)
        // dropWhile(Predicate<T> predicate)


//        task();
//        task1();
        task2();


    } // main

    private static void task2() {
        List<String> strings = List.of("aa", "bb", "ccc", "dd", "eee");

        // takeWhile
        List<String> strings1 = strings.stream()
                //.sorted((str1, str2) -> str1.length() - str2.length())
                .takeWhile(string -> string.length() <3)
                .collect(Collectors.toList());

        System.out.println("takeWhile: " + strings1);

        //dropWhile
        List<String> dropStrings = strings.stream()
                .dropWhile(s -> s.length()<3)
                .collect(Collectors.toList());

        System.out.println("dropWhile: " + dropStrings);
    }

    private static void task1() {
        List<Integer> integers = List.of(0, 5, 1, 2, 4, 3, 3, 4, 6, 0, 4);

        List<Integer> smallest = integers.stream()
                .sorted()
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("smallest: " + smallest);

        List<Integer> withoutSmallest = integers.stream()
                .sorted()
                .skip(3)
                .collect(Collectors.toList());
        System.out.println("withoutSmallest: " + withoutSmallest);

        System.out.println(integers.stream().skip(4).collect(Collectors.toList()));
    }

    private static void task() {
        List<Integer> integers = List.of(0, 5, 1, 2, 4, 3, 3, 4, 6, 0, 4);

        integers.stream()
                .distinct()
                .forEach(i -> System.out.print(i + "; "));
        System.out.println();

        List<Cat> catDistenct = List.of(
                new Cat("Bear", 5, "black"),
                new Cat("Bear", 5, "black"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );

        System.out.println(catDistenct.stream().distinct().collect(Collectors.toList()));

        List<String> strings = List.of("abc", new String("abc"), "defg", "defg");
        System.out.println(strings.stream().distinct().collect(Collectors.toList()));

    }


    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "black"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }

}
