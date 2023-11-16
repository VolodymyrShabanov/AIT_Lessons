package lesson_46_2023_11_08;

import java.util.*;

/**
 * Created by Volodymyr Sh on 08.11.2023
 * project name: AIT_Lessons
 */
public class SetExample {
    public static void main(String[] args) {
        // Конструкторы
        Set<Integer> integers = new HashSet<>();// capacity 16, loadFactor = 0.75
        Set<Integer> integers1 = new HashSet<>(32);
        Set<Integer> integers2 = new HashSet<>(32, 0.8f);
        Set<Integer> integers3 = new HashSet<>(integers);// только уникальные значения

        Set<Integer> hashSet = new HashSet<>(List.of(1, 2, 3, 3, 2, 1, 4, 4, 5, 6, 15, 7, 8));
        System.out.println("hashSet: " + hashSet);
        Set<Integer>  linkedSet = new LinkedHashSet<>(List.of(1, 2, 3, 3, 2, 1, 4, 4, 5, 6, 15, 7, 8));
        System.out.println("linkedSet: " + linkedSet);

        Set<Integer> treeSet = new TreeSet<>(List.of(1, 2, 3, 3, 2, 1, 4, 4, 5, 6, 15, 7, 8));
        System.out.println("treeSet: " + treeSet);

        treeSet = new TreeSet<>(Comparator.reverseOrder());
        treeSet.addAll(List.of(1, 2, 3, 3, 2, 1, 4, 4, 5, 6, 15, 7, 8));
        System.out.println("treeSet reversed: " + treeSet);

        Set<Integer> reversedSortedSet = new TreeSet<>((i1, i2) -> i2.compareTo(i1));
        reversedSortedSet.addAll(List.of(1, 2, 3, 3, 2, 1, 4, 4, 5, 6, 15, 7, 8));
        System.out.println("reversed Sorted Set: " + reversedSortedSet);




        /*
        !!! - Контракт между equals() и hashCode()

        1. Если два объекта равны по методу equals(), то их hashCode() ДОЛЖНЫ быть равны!!!
        2. Если hashCode() двух объектов различны, то объекты по equals() ТОЧНО не равны.
           (обратное утверждение не всегда верно -> разные объекты могут иметь одинаковый hashCode())
        3. Вызов метода hashCode() должен возвращать одинаковые значение при многократных вызовах на неизмененном объекте.

        */


    }
}
