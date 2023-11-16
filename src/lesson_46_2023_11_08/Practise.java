package lesson_46_2023_11_08;

import java.util.*;

/**
 * Created by Volodymyr Sh on 08.11.2023
 * project name: AIT_Lessons
 */
public class Practise {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>(List.of("q", "w", "w", "e", "r", "r", "t", "y"));

        System.out.println(listUniqueValues(strings));

        List<Integer> integers = new ArrayList<>(List.of(1, 2, 3, 3, 2, 1, 4, 4, 5, 6, 15, 7, 8));

        System.out.println(listUniqueValuesReversed(integers));
        System.out.println(listUniqueValuesReversed(strings));
    }

    private static <T> List<T> listUniqueValues(List<T> list) {
        Set<T> result = new HashSet<>(list);
        return new ArrayList<>(result);
    }

//    private static List<Integer> listUniqueValuesReversed(List<Integer> list) {
        Set<Integer> result = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
//        result.addAll(list);
//        return new ArrayList<>(result);
//    }

    private static <T> List<T> listUniqueValuesReversed(List<T> list) {
        Set<T> result = (Set<T>) new TreeSet<>(Comparator.reverseOrder());
        result.addAll(list);
        return new ArrayList<>(result);
    }

}
