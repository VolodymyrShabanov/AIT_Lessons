package lesson_45_2023_11_07;

import lesson_35_2023_10_24.my_list.MyArrayList;
import lesson_35_2023_10_24.my_list.MyList;

import java.util.*;

/**
 * Created by Volodymyr Sh on 07.11.2023
 * project name: AIT_Lessons
 */
public class Training {

    public static void main(String[] args) {

        Random random = new Random();

        List<Integer> arrayList = new ArrayList<>(100_000);
        List<Integer> linkedList = new LinkedList<>();
        MyList<Integer> myList = new MyArrayList<>();

        long startA = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            arrayList.add(random.nextInt(200) - 100);
        }
        long endA = System.currentTimeMillis();
        System.out.println("Time arrayList: " + (endA - startA));
        Integer integer1 = arrayList.get(5000);
        System.out.println(integer1);
        System.out.println(arrayList.size());


        long startL = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            linkedList.add(random.nextInt(200) - 100);
        }
        long endL = System.currentTimeMillis();
        System.out.println("Time linkedList: " + (endL - startL));

        long startM = System.currentTimeMillis();
        for (int i = 0; i < 100_000; i++) {
            myList.add(random.nextInt(200) - 100);
        }
        long endM = System.currentTimeMillis();
        System.out.println("Time myList: " + (endM - startM));

        long startC = System.currentTimeMillis();
        Collections.fill(arrayList, random.nextInt(1000));
        long endC = System.currentTimeMillis();
        System.out.println("Time arrayList (collections): " + (endC - startC));

        Integer integer2 = arrayList.get(5000);
        System.out.println(integer2);
        System.out.println(arrayList.size());

    }
}
