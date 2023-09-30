package lesson_18_2023_09_28;

import java.util.Arrays;
import java.util.Random;

public class Main_18 {
    public static void main(String[] args) {
        Random random = new Random();
        RubberArray_my ra = new RubberArray_my();
        int test;


        RubberArray_my rubArr = new RubberArray_my(10);
        System.out.println("rubArr.length "  + rubArr.length());
        System.out.println("Сейчас в массиве: " + rubArr.lengthOllElements() + " элементов (в том числе и пустых)");

        System.out.println("Сейчас в массиве: " + ra.length() + " элементов");
        ra.add(50);
        ra.add(-10);
        //System.out.println("Сейчас в массиве: " + ra.length() + " элементов");

        for (int i = 0; i < 5; i++) {
            ra.add(random.nextInt(101));
            //System.out.println("Сейчас в массиве: " + ra.length() + " элементов");
        }

        System.out.println(ra.toString());

        System.out.println("Сейчас в массиве: " + ra.length() + " элементов");

        ra.add(1, 3, 4);
        System.out.println(ra.toString());
        System.out.println("Сейчас в массиве: " + ra.length() + " элементов");

        int searchMe = 1000;
        System.out.println("Поиск в массиве по значению: " + ra.indexOf(searchMe));
        System.out.println("Поиск значения в массиве: " + ra.contains(searchMe));


        ra.addRandomValues(3, 10000);
        ra.add(3);
        ra.addRandomValues(2);

        System.out.println(ra.toString());
        System.out.println("Сейчас в массиве: " + ra.length() + " элементов");

        System.out.println("=======================");


        int index = ra.indexOf(50);
        int lastIndex = ra.lastIndexOf(50);


        System.out.println(index);
        System.out.println(lastIndex);

        if (index != -1 && index != lastIndex) {
            System.out.println("Число вхождений тройки в массиве более 1");
        }

        if (index != -1 && index == lastIndex) {
            System.out.println("В массиве только один элемент с таким значением");
        }


        System.out.println("Удаление 5. Удаление элементов из массива по индексу; ======================");
        System.out.println(ra.toString());
        System.out.println("Сейчас в массиве: " + ra.length() + " элементов");
        System.out.println("Удаляем по индексу 8: " + ra.removeByIndex(8));
        System.out.println(ra.toString());
        System.out.println("Сейчас в массиве: " + ra.length() + " элементов");

        ra.add(11);

        System.out.println(ra.remove(100000));
        System.out.println(ra.toString());

        int[] array = ra.toArray();
        System.out.println(Arrays.toString(array));

        ra.trim();
        ra.add(555);


        ra.trim();
        System.out.println(ra.toString());

        ra.removeByIndex(1);
        System.out.println(ra.toString());



    }
}
