package lesson_52_2023_11_20;



import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;

/**
 * Created by Volodymyr Sh on 20.11.2023
 * project name: AIT_Lessons
 */
public class BiFunctionBiConsumerBiPredicate {
    public static void main(String[] args) {
        //BiFunction<T, U, R>

        BiFunction<Integer, Integer, Integer> add = (a, b) -> a + b;
        System.out.println("BiFunction -> " + add.apply(2, 3));

        BiConsumer<String, String> biConsumer = ((string, string2) -> System.out.println(string + " : " + string2));
        biConsumer.accept("BiConsumer -> Hello", "Java");

        BiPredicate<Integer, Integer> biPredicate = (a, b) -> a > b;
        System.out.println("BiPredicate -> " + biPredicate.test(10, 20));

    }
}
