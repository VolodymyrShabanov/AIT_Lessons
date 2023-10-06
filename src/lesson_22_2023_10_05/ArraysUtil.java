package lesson_22_2023_10_05;

import java.util.Random;

public class ArraysUtil {
    public static int linerSearch(int[] array, int value) {

        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) return i;

        }
        return -1;
    }

    public static int binarySearch(int[] array, int searchValue) {
        int startIndex = 0;
        int endIndex = array.length - 1;
        int middleIndex;

        int counter = 0;

        while (startIndex <= endIndex) {
            //counter++;
            // 0, 12 --> 0 + (12-0)/2 -> 6;
            middleIndex = startIndex + (endIndex - startIndex) / 2;

            if (array[middleIndex] == searchValue) {
//                System.out.println("Значение найдено. Совершено итераций: " + counter);
                return middleIndex;
            }

            if (array[middleIndex] > searchValue) {
                endIndex = middleIndex - 1;
            } else {
                startIndex = middleIndex + 1;
            }
        }

//        System.out.println("Элемент в массиве не найден!");
//        System.out.println("Затрачено шагов: " + counter);
        return -1;
    }


    public static void sortArray(int[] array) {
        for (int i = 0; i < array.length - 1 ; i++) {
            System.out.println("i = " + i + ";");

            int minIndex = minIndexSearch(array, i);
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

    private static int minIndexSearch(int[] array, int startIndex) {
        int min = array[startIndex];
        int minIndex = startIndex;

        for (int i = startIndex; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i];
                minIndex = i;
            }
            System.out.print("j = " + i + "; " );
        }
        System.out.println();
        return minIndex;
    }

    public static int[] initTestArray(int size) {
        Random random = new Random();
        int [] result = new int [size];

        for (int i = 0; i < result.length; i++) {
            result[i] = random.nextInt(2001) - 1000;

        }
        return result;
    }
}
