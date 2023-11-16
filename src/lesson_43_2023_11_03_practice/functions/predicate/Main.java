package lesson_43_2023_11_03_practice.functions.predicate;

import lesson_29_2023_10_16.printable.Presentation;

import java.util.function.Predicate;

/**
 * Created by Volodymyr Sh on 03.11.2023
 * project name: AIT_Lessons
 */
public class Main {
    public static void main(String[] args) {
        ListFilter filter = new ListFilter();

        MyArrayList<Integer> list = new MyArrayList<>();
        list.addAll(10, -15, 20, 11, -28, 7, -5);

//        Predicate<Integer> isPositive  =new Predicate<Integer>() {
//            @Override
//            public boolean test(Integer integer) {
//                return integer > 0;
//            }
//        };

        Predicate<Integer> isPositive = integer -> (integer > 0);

        MyArrayList<Integer> filteredList = filter.filter(list, isPositive);
        System.out.println(filteredList);

        filteredList = filter.filter(list, integer -> (integer < 0));
        System.out.println(filteredList);

    }
}
