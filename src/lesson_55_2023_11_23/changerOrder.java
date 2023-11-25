package lesson_55_2023_11_23;

import java.util.List;
import java.util.stream.Stream;


/**
 * Created by Volodymyr Sh on 23.11.2023
 * project name: AIT_Lessons
 */
public class changerOrder {
    public static void main(String[] args) {
        // ======= Промежуточные методы для изменения порядка элементов =======
        // sorted()
        // unordered()




//        task_1();
//        task_2();
        task_3();


    }

    private static void task_3() {
        List<String> strings = List.of("E1","E22", "E3", "E2");
        Stream<String> stream = strings.stream()

                .filter(string -> {
                    System.out.println("filter: " + string);
                    return string.endsWith("2");
                })
                .map(string -> {
                    System.out.println("map: " + string);
                    return "_" + string;
                })
                .sorted((s1, s2) -> {
                    System.out.println("sorted: " + s1 + ":" + s2);
                    return s1.compareTo(s2);
                });

        stream.forEach(string -> System.out.println("forEach: " + string));
    }

    private static void task_2() {
        List<String> strings = List.of("E1", "E2", "E3");
        Stream<String> stream = strings.stream()
                .filter(string -> {
                    System.out.println("filter: " + string);
                    return string.endsWith("2");
                })
                .map(string -> {
                    System.out.println("map: " + string);
                    return "_" + string;
                });

        stream.forEach(string -> System.out.println("forEach: " + string));
    }

    public static void task_1() {
        List<String> strings = List.of("E1", "E2", "E3");
        Stream<String> stream = strings.stream()
                .filter(string -> {
                    System.out.println("filter: " + string);
                    return string.length() <= 2;
                })
                .map(string -> {
                    System.out.println("map: " + string);
                    return "_" + string;
                });

        stream.forEach(string -> System.out.println("forEach: " + string));
    }


}
