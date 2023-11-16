package lesson_43_2023_11_03_practice.functions.predicate;

import java.util.function.Predicate;

/**
 * Created by Volodymyr Sh on 03.11.2023
 * project name: AIT_Lessons
 */
public class ListFilter {
    public <T> MyArrayList<T> filter(MyArrayList<T> list, Predicate<T> predicate) {

        MyArrayList<T> result = new MyArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if (predicate.test(list.get(i))) {
                result.add(list.get(i));
            }
        }
        return result;
    }
}
