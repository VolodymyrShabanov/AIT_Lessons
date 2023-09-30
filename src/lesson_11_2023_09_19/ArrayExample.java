package lesson_11_2023_09_19;

import java.util.Random;
import java.util.Arrays;

public class ArrayExample {
    public static void main(String[] args) {
        int[] array; // массив целочисленных типов данных
        String[] strings;
        array = new int[6]; // создали массив с 6 ячейками
        strings = new String[10]; // создали массив с 10 ячейками

        int[] array2 = new int[8]; // объявили и инициализировали массив на 8 ячеек

        // Значения по умолчанию которые записываются в каждую ячейку пустого массива
        // int, double ... для всех числовых (в том числе char) будет -> 0 (0.0)
        // String ... для всех ссылочных типов -> null (null - ничего)
        // boolean -> будет -> false

        int[] numbers = new int[]{45, 56, -16, 45, 0, 159, 1444}; // явная инициализация массива
        int[] ints = {-10, 54, 32323, 444}; // явная инициализация массива

        int value = numbers[0];
        System.out.println("В 0 ячейки массива numbers находится число: " + value);
        System.out.println("В 2 ячейке массива ints находится число: " + ints[2]);
        System.out.println("В 3 ячейке массива array находится число: " + array[3]);
        System.out.println("В 9 ячейке массива strings находится число: " + strings[9]);

        int[][] schach = new int[8][8];
        System.out.println(ints); // получим визуализированную ссылку на адрес в Heap (куче)

        System.out.println("Длина массива (кол-во ячеек в массиве) numbers: " + numbers.length);
        int i = 0;

        String arrayToString = "[";

        while (i < numbers.length) {
            arrayToString = arrayToString + numbers[i] + ((i < numbers.length - 1) ? ", " : "]");
            i++;
        }
        System.out.println(arrayToString);


        System.out.println("\n=================================");
        String str = "Hello";

        int i1 = 0;
        while (i1 < str.length()) {
            System.out.print(str.charAt(i1) + ", ");
            i1++;
        }

        System.out.println();

        char[] chars = str.toCharArray();
        System.out.println("длина массива chars: " + chars.length);


        int e = 0;
        while (e < chars.length) {
            System.out.print
                    (chars[e++] + " ");
        }

        System.out.println();

        System.out.println("=============Массив строк==================");

        String [] strings1 = {"Str1", "Str2", "Str3", "Str4"};
        System.out.println(strings1.length);
        System.out.println("strings2[2]" + strings[2]);

        int [] ints1 = {3, 5, 6, 7, 8};
        ints1 = new int [] {1, 3, 5, 9};
        ints1 = new int [] {1, 5, 6};

        System.out.println(ints1[1]);

        // Метод Arrays для работы с массивами
        String string = Arrays.toString(ints1);
        System.out.println(string);
        System.out.println(Arrays.toString(strings1));
        strings1[1] = "Java";
        System.out.println(Arrays.toString(strings1));


        // присвоение нового значения элементу массива с индексом 2 -> нового значения
        ints1[2] = 10;
        System.out.println(Arrays.toString(ints1));


        System.out.println("Создать массивов из 10 элементов и заполнить его случайными числами от 0 до 100");
        Random random = new Random();
         int [] nums = new int [10];

         int k = 0;
        System.out.print("[");
        while (k < nums.length) {
            nums[k] = random.nextInt(101);
            System.out.print(nums[k] + ((k < nums.length - 1) ? ", " : "]"));
            k++;
        }
        System.out.println();

        System.out.println("Типовые задачи с массивами");

        System.out.println("Задача 1. Найти минимальное значение в массиве");

        int l = 0;
        int min = nums [0];

        while (l < nums.length) {
            if (nums[l] < min) {
                min = nums[l];
            }
            l++;
        }

        System.out.println("Минимальное значение значение в массиве nums: " + min);

    }
}
