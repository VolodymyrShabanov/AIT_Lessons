package lesson_45_2023_11_07;

import javax.print.attribute.IntegerSyntax;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

/**
 * Created by Volodymyr Sh on 07.11.2023
 * project name: AIT_Lessons
 */
public class CollectionExample {
    public CollectionExample() {
    }

    public static void main(String[] args) {

        List<String> strings = new ArrayList<>(List.of("hello", "Java", "world", "example"));
        List<String> strings2 = new ArrayList<>(List.of("hello", new String("Java")));
        System.out.println("containsAll strings: " + strings.containsAll(strings2));
        System.out.println("== " + ("Java" == new String("Java")));
        System.out.println("equals: " + ("Java".equals(new String("Java"))));

        List<Integer> integers = new ArrayList<>();
        List<Integer> numbers = new ArrayList<>();
        List<Integer> nulls = new ArrayList<>(List.of(0, 0, 0));

        integers.addAll(List.of(1, 2, 3, 4, 5));
        numbers.addAll(List.of(3, 2, 1));

        System.out.println("containsAll() o.1: " + integers.contains(numbers));
        System.out.println("containsAll() o.1: " + numbers.contains(integers));

        System.out.println("size(): " + integers.size());
        System.out.println("isEmpty(): " + integers.isEmpty());
        System.out.println("contains(Element element): " + integers.contains(1));

        System.out.println("add(Element element): " + integers.add(1));
        System.out.println("remove(Element element): " + integers.remove("Small"));
        System.out.println("containsAll(): " + integers.containsAll(numbers));

        System.out.println("addAll(): " + integers.addAll(numbers));
        System.out.println("addAll() + index: " + integers.addAll(3, nulls));
        System.out.println("addAll() -> result methods:" + integers);

        System.out.println("removeAll(): " + integers.removeAll(numbers));
        System.out.println("removeAll() -> result:" + integers);

        integers.add(3);
        integers.add(6);
        integers.addAll(numbers);
        System.out.println("retainAll(): " + integers.retainAll(numbers));
        System.out.println("retainAll() -> result: " + integers);

        System.out.println("'void' clear(): ");
        integers.clear();
        System.out.println("clear() -> result: " + integers);

        Object[] array = numbers.toArray();
        System.out.println("toArray() -> result == Object: " + Arrays.toString(array));

        Integer[] ints2 = new Integer[0];
        ints2 = numbers.toArray(ints2); // <T> T[] toArray(T[] a);
        System.out.println("toArray() -> result == Integer: " + Arrays.toString(ints2));

        System.out.println("removeIf(): " + numbers.removeIf(i -> i > 2));
        System.out.println("removeIf() -> result: " + numbers);



//        Predicate<Integer> predicate = new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer i) {
//                return i > 1;
//            }
//        };


    }

}
