package lesson_55_2023_11_23;

import java.util.List;
import java.util.Optional;

/**
 * Created by Volodymyr Sh on 23.11.2023
 * project name: AIT_Lessons
 */
public class ReduceExample {
    public static void main(String[] args) {
        // ======= Аккумулирующие терминальные методы =======

        // Optional<T> reduce(BinaryOperator<T> accumulator)
        //                    BinaryOperator<T> -> BiFunction<T, T, T>
        // <T> reduce()

        //reduce_1();
        reduce_2();
        reduce_3();

    }

    private static void reduce_3() {
        List<String> strings = List.of("world", "!");
        String concat = strings.stream().reduce("Hello", (s1, s2) -> s1 + " " + s2);
        System.out.println("concat: " + concat);
    }

    private static void reduce_2() {
        List<String> strings = List.of("Java", "Python", "JS", "Kotlin");
        Optional<String> longest = strings.stream()
                .reduce((s1, s2) -> s1.length() > s2.length() ? s1 : s2);

        System.out.println("longest: " + longest.get());
    }

    private static void reduce_1() {
        List<Integer> integers = List.of(1,2, 3, 4, 5, 6, 7, 8);

        Optional<Integer> sum = integers.stream()
                .filter(i -> i %2 ==0)
                .reduce((i1,  i2) -> i1 + i2);

        System.out.println("reduce: " + sum.get());

    }
}
