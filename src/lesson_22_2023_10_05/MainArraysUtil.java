package lesson_22_2023_10_05;

import java.util.Arrays;

public class MainArraysUtil {
    public static void main(String[] args) {
        int[] ints = {25, 13, -56, 44, 57, 78, 34, 8, 10, 77, -25, 34};

        int searchMe = 25;
        //System.out.println(ints.length);

//        System.out.println(ArraysUtil.linerSearch(ints,searchMe));
        System.out.println(Arrays.toString(ints));

        ArraysUtil.sortArray(ints);
        System.out.println(Arrays.toString(ints));




//        System.out.println("Результат бинарного поиска: index == "
//                + ArraysUtil.binarySearch(ints, searchMe));
//
//        int[] testInts = ArraysUtil.initTestArray(1_000_000);
//        int[] searchValues = ArraysUtil.initTestArray(100);
//
//        // возвращает текущее время в миллисекундах
//        long startTime = System.currentTimeMillis();
//
//        int[] resultFromLinear = new int[100];
//        for (int i = 0; i < searchValues.length; i++) {
////            resultFromLinear[i] = ArraysUtil.linerSearch(testInts, 2000000);
//            resultFromLinear[i] = ArraysUtil.linerSearch(testInts, searchValues[i]);
//
//        }
//
//        long endTime = System.currentTimeMillis();
//
//        System.out.println("(Линейный поиск) - Затрачено времени: " + (endTime - startTime));
////        System.out.println("Результат поиска: " + Arrays.toString(resultFromLinear));
//
//
//        startTime = System.currentTimeMillis();
//        Arrays.sort(ints); // встроенный метод сортировки
//
//        resultFromLinear = new int[100];
//        for (int i = 0; i < searchValues.length; i++) {
////            resultFromLinear[i] = ArraysUtil.linerSearch(testInts, 2000000);
//            resultFromLinear[i] = ArraysUtil.linerSearch(testInts, searchValues[i]);
//
//        }
//
//        endTime = System.currentTimeMillis();
//
//        System.out.println("(Бинарный поиск) - Затрачено времени: " + (endTime - startTime));
////        System.out.println("Результат поиска: " + Arrays.toString(resultFromLinear));


    }
}
