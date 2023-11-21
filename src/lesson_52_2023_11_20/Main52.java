package lesson_52_2023_11_20;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Created by Volodymyr Sh on 20.11.2023
 * project name: AIT_Lessons
 */
public class Main52 {

    public static void main(String[] args) {


        // Function<T, R> -> R
        Function<String, Integer> function = new Function<String, Integer>() {
            @Override
            public Integer apply(String string) {
                return string.length();
            }
        };

        System.out.println("function: " + function.apply("Hello!"));

        Function<String, Integer> function1 = string -> string.length();
        System.out.println("function1: " + function1.apply("Hello!"));

        // ссылка на методы '::' класса

        Function<String, Integer> function2 = String::length;
        System.out.println("function1: " + function2.apply("Hello!"));


        // вызов метода моего класса
        String text = "Java is Powerful";

        Function<String, Integer> countSpaces = Main52::countSpaces;
        System.out.println("количество пробелов: " + countSpaces.apply(text));

        Function<String, Integer> countUpperCase = Main52::countUpperCase;
        System.out.println("количество больших букв: " + countUpperCase.apply(text));

        Function<String, String> function3 = String::toLowerCase;
        System.out.println("toLowerCase: " + function3.apply(text));

        // Consumer<T> -> void
        Consumer<String> consumer = new Consumer<String>() {
            @Override
            public void accept(String string) {
                System.out.println(Arrays.toString(string.toCharArray()));
            }
        };

        consumer.accept("consumer: " + text);

        Consumer<String> consumer1 = System.out::println;
        consumer1.accept("System.out::println: " + text);

        Consumer<String> printCharsConsumer = Main52::printChars;
        printCharsConsumer.accept(text);

        // Predicate<T> -> boolean

        Predicate<String> predicate = new Predicate<String>() {
            @Override
            public boolean test(String string) {
                return string.length() > 3;
            }
        };

        List<String> strings = List.of("Orange", "Tea", "Milk", "Ice", "Banana");

        List<String> longString = getListByPredicate(strings, predicate);
        System.out.println("longString: " + longString);

        System.out.println("getListByPredicate: " + getListByPredicate(strings, string -> string.contains("a")));


        Predicate<String> predicate1 = string -> string.length() > 3;
        Predicate<String> predicate2 = string -> string.contains("a");

        Predicate<String> combinePredicateAnd = predicate1.and(predicate2);
        System.out.println("combinePredicateAnd: " + getListByPredicate(strings, combinePredicateAnd));

        Predicate<String> combinePredicateOr  = predicate1.or(predicate2);
        System.out.println("combinePredicateOr: " + getListByPredicate(strings, combinePredicateOr));

        Predicate<String> combinePredicateNot  = predicate1.negate();
        System.out.println("combinePredicateNot: " + getListByPredicate(strings, combinePredicateNot));







    }// main

    private static List<String> getListByPredicate(List<String> strings, Predicate<String> predicate) {
        List<String> result = new ArrayList<>();
        for (String string : strings) {
            if (predicate.test(string)) {
                result.add(string);
            }
        }
        return result;
    }

    private static void printChars(String string) {
        for (char ch : string.toCharArray()) {
            System.out.printf(ch + " -> ");
        }
        System.out.println();
    }

    private static Integer countUpperCase(String string) {
        Integer count = 0;
        for (char ch : string.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }
        return count;
    }

    public static Integer countSpaces(String string) {
        Integer count = 0;
        for (char ch : string.toCharArray()) {
            if (ch == ' ') {
                count++;
            }
        }
        return count;
    }
}
