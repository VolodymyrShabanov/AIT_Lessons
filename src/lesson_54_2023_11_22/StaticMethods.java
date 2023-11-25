package lesson_54_2023_11_22;

import java.util.List;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Integer.*;

/**
 * Created by Volodymyr Sh on 22.11.2023
 * project name: AIT_Lessons
 */
public class StaticMethods {
    public static void main(String[] args) {

        // ======= Методы Of =======
        // of(T value)
        // of(T... values)
        // ofNullable()

        // empty()
        // concat(Stream<T> a, Stream<T> b)
        // generate(Supplier<T> s)

        // iterate(T seed, UnaryOperator<T> f)
        // iterate(T seed, Predicate<T> hasNext, UnaryOperator<T> f)

//        task_of();
//        task_concat();
//        task_generate();

        task_iterate();

    }// main

    private static void task_iterate() {
        Stream<Integer> integerStream = Stream.iterate(-8, n -> n + 2); // создаст бесконечный поток четных чисел

        List<Integer> integers = integerStream.limit(15).collect(Collectors.toList());
        System.out.println("integers: " + integers);

        List<Integer> integerStream1 = Stream.iterate(-8, n -> n <= 10, n -> n + 1)
                .collect(Collectors.toList());
        System.out.println("integerStream1: " + integerStream1);

    }

    private static void task_generate() {
        Random random = new Random();


        Stream<Double> infinityStream = Stream.generate(Math::random);
        List<Double> randomDoubleList = infinityStream
                .limit(20)
                .collect(Collectors.toList());

        System.out.println(randomDoubleList);

        System.out.println(Stream.generate(new Random()::nextInt)
                .limit(15).collect(Collectors.toList()));


        Supplier<Integer> supplier = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return random.nextInt(1001);
            }
        };

        Stream<Integer> streamIntegers = Stream.generate(supplier);
        List<Integer> randomIntegers = streamIntegers
                .limit(10)
                .collect(Collectors.toList());

        System.out.println(randomIntegers);
    }

    private static void task_concat() {
        Stream<Integer> integerStream = Stream.concat(Stream.of(1, 2, 4), Stream.of(2, 5, 7));
        System.out.println(integerStream.collect(Collectors.toList()));
    }

    private static void task_of() {
        Stream<Integer> stream = Stream.of(12);
        stream.forEach(System.out::println);

        Stream<String> sringStream = Stream.of("string", "hello", "java");
        sringStream.forEach(System.out::println);

        String s = null;
        Stream<String> nullStream = Stream.ofNullable(s);
        System.out.println(nullStream.collect(Collectors.toList()));

    }
}