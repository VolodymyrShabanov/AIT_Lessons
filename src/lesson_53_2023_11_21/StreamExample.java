package lesson_53_2023_11_21;

import org.junit.jupiter.engine.discovery.predicates.IsPotentialTestContainer;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by Volodymyr Sh on 21.11.2023
 * project name: AIT_Lessons
 */
public class StreamExample {
    public static void main(String[] args) {

        // ======= Промежуточные операции: =======
        // Stream<T> filter(Predicate predicate);
        // Stream<T> sorted()
        // Stream<T> sorted(Comparator<T> comparator)
        // Stream<T> map(Function<T, R> mapper)
        // Stream<T> peek(Consumer<T> action)


        // ======= Терминальные операции: =======
        // void forEach(Consumer<T> action)
        // R collect(Collector<T, A, R> collector)
        // Optional<T> min(Comparator<T> comparator)
        // Optional<T> max(Comparator<T> comparator)


        //task1();
        //task2();
        //task3();
        //task4();
        //task5();
        //task6();
        //task7();
        task8();
        //task9();
        //task10();
        //task11();
        //System.out.println("task12(): " + task12());

        

    }

    private static List<Cat> task12() {
        Cat cat = new Cat(null, 5, "black");
        Cat cat1 = new Cat("Python", 7, "white");
        Cat cat2 = new Cat("Tiger", 3, "gray");
        Cat cat3 = new Cat("Panda", 4, "black");

        Cat[] cats = new Cat[]{cat, cat1, null, cat2, cat3};

        List<Cat> bigCat = Arrays.stream(cats)
                //.filter(Objects::nonNull)
                .filter(c -> Objects.nonNull(c))
                .filter(c -> Objects.nonNull(c.getName()))
                .filter(c -> c.getWeight() > 4)
                .collect(Collectors.toList());


        return bigCat;
    }

    private static void task11() {
        List<Integer> integers = List.of(1, 4, 7, -5, -8, 0, 10, 22, 23);
        List<Integer> integerList = integers.stream()
                .filter(i -> i> 0)
                .filter(i -> i % 2 == 0)
                .collect(Collectors.toList());

        System.out.println(integerList);

    }

    private static void task10() {
        List<Cat> cats = getListCats();

        Optional<String> longestName = cats.stream()
                .map(Cat::getName)
                //.max((name1, name2) -> name1.length() - name2.length())
                .max(String::compareTo);

        if (longestName.isPresent()) {
            System.out.println(longestName.get());
        } else {
            System.out.println("Котов с таким именем не найдено");
        }

        System.out.println(longestName.orElse(""));

    }

    private static void task9() {
        List<Integer> integers = List.of(5, 4, 14, 50, 32, 24);

        Optional<Integer> max = integers.stream()
                .filter(i -> i < 0)
                .max(Integer::compareTo);

        System.out.println("max.isPresent(): " + max.isPresent());
        System.out.println(max.orElse(0));
    }

    private static void task8() {
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() < 5)
                .peek(cat -> cat.setName(cat.getName() + "_!"));

        catStream.forEach(cat -> System.out.println(cat));

        System.out.println("cats: " + cats);

        Stream.of("one", "two", "three", "four")
                .filter(e -> e.length() > 3)
                .peek(e -> System.out.println("Filtered value: " + e))
                .map(String::toUpperCase)
                .peek(e -> System.out.println("Mapped value: " + e))
                .collect(Collectors.toList());

    }

    private static void task7() {
        List<Cat> cats = List.of(
                new Cat("Bear", 5, "black"),
                new Cat("Python", 7, "white"),
                new Cat(null, 3, "gray"),
                new Cat("Panda", 4, "black")
        );

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getName().length() > 4);

        try {
            List<Cat> cats1 = catStream.collect(Collectors.toList());
            System.out.println(cats1);
        } catch (NullPointerException exception) {
            exception.printStackTrace();
        }

    }

    private static void task6() {
        List<Cat> cats = getListCats();
        List<String> catNames = cats.stream()
                .map(Cat::getName)
                .filter(name -> name.length() < 5)
                .collect(Collectors.toList());

        System.out.println("catNames opt1: " + catNames);

        List<String> names = cats.stream()
                .filter(cat -> cat.getName().length() < 5)
                .map(cat -> cat.getName())
                .collect(Collectors.toList());

        System.out.println("catNames opt2: " + names);

    }

    private static void task5() {
        List<Cat> cats = getListCats();

        List<String> catNamesWeightMoreFour = cats.stream()
                .filter(cat -> cat.getWeight() > 4)
                .map(Cat::getName)
                .collect(Collectors.toList());
        System.out.println(catNamesWeightMoreFour);
    }

    private static void task4() {
        List<Cat> cats = getListCats();

        Stream<String> stringStream = cats.stream()
                .map(cat -> cat.getName());

        List<String> catName = cats.stream()
                .map(Cat::getName)
                .collect(Collectors.toList());

        System.out.println("catName: " + catName);

    }

    private static void task3() {
        List<Cat> cats = getListCats();

        Stream<Cat> stream = cats
                .stream()
                .filter(cat -> cat.getName().length() > 4);
        List<Cat> longNameCats = stream.collect(Collectors.toList());

        System.out.println("cats: " + cats);


    }

    private static List<Cat> getListCats() {
        return List.of(
                new Cat("Bear", 5, "black"),
                new Cat("Python", 7, "white"),
                new Cat("Tiger", 3, "gray"),
                new Cat("Panda", 4, "black")
        );
    }


    private static void task2() {
        List<Cat> cats = getListCats();

        Stream<Cat> catStream = cats.stream()
                .filter(cat -> cat.getWeight() > 4);

        List<Cat> fatCats = catStream.collect(Collectors.toList());
        System.out.println(fatCats);
    }

    private static void task1() {
        List<Integer> integers = List.of(-1, 12, 0, 4, 1, -15, 24, 0);

        // option 1
        List<Integer> result = new ArrayList<>();
        for (Integer integer : integers) {
            if (integer > 0) result.add(integer);
        }
        Collections.sort(result);
        System.out.println(result);

        // option 2

        List<Integer> integersList = integers.stream()
                .filter(integer -> integer > 0)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(integersList);

    }
}
