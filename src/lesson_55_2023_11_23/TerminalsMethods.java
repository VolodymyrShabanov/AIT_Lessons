package lesson_55_2023_11_23;

import java.util.List;
import java.util.Optional;

/**
 * Created by Volodymyr Sh on 23.11.2023
 * project name: AIT_Lessons
 */
public class TerminalsMethods {
    public static void main(String[] args) {
        // ======= Терминальные методы =======

        // === Методы возвращающие одно значение ===
        // boolean allMatch(Predicate predicate)
        // boolean anyMatch(Predicate predicate)
        // boolean noneMatch(Predicate predicate)
        example_1();

        // Optional<T> findFirst()
        // Optional<T> findAny()
        example_2();

        // count()
        example_3();




    }

    private static void example_3() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        long count = integers.stream()
                .filter(integer -> integer % 2 == 0)
                .count();

        System.out.println("count: " + count);


    }

    private static void example_2() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);

        Optional<Integer> findFirst = integers.stream().filter(i -> i > 3).findFirst();
        System.out.println("findFirst: " + findFirst.get());

        Optional<Integer> findAny = integers.stream().findAny();
        System.out.println("findAny: " + findAny.get());
    }

    private static void example_1() {
        List<Integer> integers = List.of(1, 4, 5, -5, 10, 22, 34);

        boolean isAllMatch = integers.stream()
                .filter(i -> i > 10)
                .peek(i -> System.out.print(i + "; "))
                .allMatch(i -> i % 2 == 0);
        System.out.println("\nisAllMatch: " + isAllMatch);

        boolean isAnyMatch = integers.stream()
                .filter(i -> i > 0)
                .peek(i -> System.out.print(i + "; "))
                .anyMatch(i -> i > 50);
        System.out.println("\nisAnyMatch: " + isAnyMatch);

        boolean isNoneMatch = integers.stream()
                .filter(i -> i > 0)
                .peek(i -> System.out.print(i + "; "))
                .noneMatch(i -> i > 50);
        System.out.println("\nisNoneMatch: " + isNoneMatch);

    }
}
