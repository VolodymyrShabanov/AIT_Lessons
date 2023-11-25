package lesson_55_2023_11_23;

import org.w3c.dom.ls.LSOutput;

import javax.swing.event.ListDataEvent;
import java.util.*;
import java.util.function.BiConsumer;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 23.11.2023
 * project name: AIT_Lessons
 */
public class CollectExample {
    public static void main(String[] args) {
        // ======= Терминальный метод collect =======

        /* collect(Collector<? super T, A, R> collector

        class Collectors -> содержит большой набор статических методов
        возвращающих реализацию интерфейса Collector

        - toList()
        - toSet()
        - toMap()
           - toMap(Function keyMapper, Function valueMapper)
           - toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction)
           - toMap(Function keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier supplier)
           - toUnmodifiableMap
           - toConcurrentMap


*/
        // toMap(Function, keyMapper, Function valueMapper)
        map1();

        // toMap(Function, keyMapper, Function valueMapper, BinaryOperator mergeFunction)
        // toMap(Function, keyMapper, Function valueMapper, BinaryOperator mergeFunction, Supplier supplier)

        map2();

    }

    private static void map2() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Function<Integer, String> keyMapper = i -> (i % 2 == 0)? "even" : "odd";
        Function<Integer, List<Integer>> valueMapper = i -> List.of(i);
        BinaryOperator<List<Integer>> mergeFunction = (l1, l2) -> {
            List<Integer> result = new ArrayList<>(l1);
            result.addAll(l2);
            return result;
        };

        Map<String, List<Integer>> mapOddEven = integers.stream()
                .collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction));

        System.out.println("mapOddEven: " + mapOddEven);

        // Supplier
        Supplier<Map<String, List<Integer>>> supplier = LinkedHashMap::new;

        Map<String, List<Integer>> mapOddEvenLinked = integers.stream()
                .collect(Collectors.toMap(keyMapper, valueMapper, mergeFunction, supplier));

        System.out.println("mapOddEvenLinked: " + mapOddEvenLinked);
    }

    private static void map1() {
        List<Integer> integers = List.of(1, 2, 3, 4, 5);
        Map<Integer, String> result = integers.stream()
                .collect(Collectors.toMap(Function.identity(), i -> (i % 2 == 0) ? "even" : "odd"));
//            .collect(Collectors.toMap(i-> i, i -> (i % 2 == 0) ? "even" : "odd"));
        System.out.println(result);
    }
}
