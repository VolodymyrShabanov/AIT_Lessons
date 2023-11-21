package lesson_52_2023_11_20;

import java.util.Arrays;
import java.util.function.Consumer;
import java.util.function.Function;

/**
 * Created by Volodymyr Sh on 20.11.2023
 * project name: AIT_Lessons
 */
public class CombinedInterfaces {

    public static void main(String[] args) {
        // andThen(Function<T, R> after);

        Function<String, String> toUpperCase = String::toUpperCase;
        Function<String, String> concatStrings = string -> string + " Java!";
        Function<String, String> combinedFunction = toUpperCase.andThen(concatStrings);

        System.out.println(combinedFunction.apply("hello"));

        Function<Integer, Integer> sum = i -> i + 5;
        Function<Integer, Integer> multi = i -> i * 2;
        Function<Integer, Integer> combinedIntAndThen = sum.andThen(multi);
        System.out.println("combinedIntAndThen: " + combinedIntAndThen.apply(3));// result --> (3 + 5) * 2 = 16;

        // compose(Function<T, R> before);
        Function<Integer, Integer> combinedIntCompose = sum.compose(multi);
        System.out.println("combinedIntCompose: " + combinedIntCompose.apply(3)); // result --> (3 * 2) + 5 = 11;

        Consumer<String> consumer1 = string -> System.out.println("consumer 1: " + string.length());
        Consumer<String> consumer2 = string -> System.out.println("consumer 2: " + string + "!");
        Consumer<String> consumer3 = consumer1.andThen(consumer2);

        consumer3.accept("Test");


    }
}
