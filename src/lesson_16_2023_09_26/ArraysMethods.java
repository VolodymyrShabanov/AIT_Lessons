package lesson_16_2023_09_26;

import java.util.Arrays;
import java.util.Random;
import java.util.SplittableRandom;

public class ArraysMethods {
    public static void main(String[] args) {
        Random random = new Random();
        int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};


        // возвращает представление массива в виде строки
        System.out.println(Arrays.toString(ints));

        // создает новй массив заданной длины.
        int[] newInts = Arrays.copyOf(ints, 20);
        System.out.println("Arrays.copyOf(); " + Arrays.toString(newInts));


        int[] newInts1 = copyOfArray(ints, 20);
        System.out.println("copyOfArray(); " + Arrays.toString(newInts1));


        // создает новй массив заданной длины, записывает в него от индекса 'from' до индекса 'to; - Последний индекс не включается!!!!
        int[] ints1 = Arrays.copyOfRange(ints, 2, 10);
        System.out.println("Arrays.copyOfRang(); " + Arrays.toString(ints1));

        // самописный метод - аналог copyOfRange
        int[] ints2 = copyOfRange(ints, 2, 7);
        System.out.println("copyOfRang(); " + Arrays.toString(ints2));

        // самописный метод -  аналог copyOfRange - создает новй массив от заданного индекса до конца массива
        int[] ints5 = copyOfRange(ints, 5);
        System.out.println("copyOfRang(); to end -> " + Arrays.toString(ints5));


        // заполняет массив указанными значениями
        int[] ints3 = new int[7];
        Arrays.fill(ints3, 10);
        System.out.println("Arrays.fill(); " + Arrays.toString(ints3));

        // начальные условия для сравнения массивов
        int[] numbers = {1, 2, 3, 4, 5};
        int[] ints4 = {1, 2, 3, 4, 5};
        int[] newLink = {1, 4, 6, 8};

        boolean isEquals;

        isEquals = numbers == ints4; // false
        isEquals = numbers.equals(ints4); // false

        // Сравнивает два массива на равенство
        isEquals = Arrays.equals(numbers, ints4);
        System.out.println("isEquals: " + isEquals);

        // самописный метод - Сравнивает два массива на равенство
        boolean isArraysEquals = isEqualsArrays(numbers, ints4);
        System.out.println("isEqualsArrays: " + isArraysEquals);

        System.out.print("isEqualsArrays - сравнение ссылок одного и того же массива: ");
        System.out.println(isEqualsArrays(newLink, newLink));


        // моногомерный масссив
        int[][] doubleArray = new int[5][5];
        int[][] tesrArray = new int[5][5];
        for (int i = 0; i < doubleArray.length; i++) {
            for (int j = 0; j < doubleArray[0].length; j++) {
                int temp = random.nextInt(101);
                doubleArray[i][j] = temp;
                tesrArray[i][j] = temp;
            }
        }

        // deepToString -позволяет получить строкове представление многомерного массива
        System.out.println(Arrays.deepToString(doubleArray));
        System.out.println(Arrays.deepToString(tesrArray));

        // сравнение массивов
        System.out.println("сравнение многомерных массивов по значениям: " + Arrays.deepEquals(doubleArray, tesrArray));

        // сортировка массива - с переопределением (перезаписью массива)
        int[] numbers1 = {10, 11, 14, 14, 15, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(numbers1);
        System.out.println(Arrays.toString(numbers1));

        // Поиск элемента в массиве. Возвращает индекс или отрицательное значение
        System.out.println("binarySearch: " + Arrays.binarySearch(numbers1, 10));


        // System.arraycopy -копирует часть массива в новый массив -  имеет 5 параметров:
        // 1 - массив донор (откуда берем значение);
        // 2 - индекс с которого начинаем брать значения;
        // 3 - массив в который будут вставлены значения;
        // 4 - индекс с которого начнут записываться значения в массив пункта 3
        // 5 - количество копируемых значений

        // {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int[] arrSysteamCopy = new int[10];
        System.arraycopy(numbers1, 3, arrSysteamCopy, 5, 5);
        System.out.println("System.arraycopy" + Arrays.toString(arrSysteamCopy));

        // самописный метод - работает почти как System.arraycopy
//        systemArrayCopy(numbers1, 3, arrSysteamCopy, 0, 5);
//        System.out.println("systemArrayCopy" + Arrays.toString(arrSysteamCopy));


        // substring - при работе со строками выделяет подстроку их строки
        String string = "Hello Java";

        String sunString = string.substring(6);
        sunString = string.substring(6, 8);

        System.out.println("substring: " + sunString);

        System.out.println("===========================");
        System.out.println(Arrays.toString(ints));


        // string.replace()
        String replaceString = string.replace('a', '_');
        replaceString = string.replace("a", "E");
        System.out.println(replaceString);
        System.out.println(string.replaceFirst("Java", "Python"));

        char[] chars1 = string.toCharArray();
        System.out.println("string.toCharArray: " + Arrays.toString(chars1));


    } // Methods area

    public static void systemArrayCopy(int[] old, int indexFrom, int[] newArr, int indexTo, int count) {

        for (int i = 0; i < count; i++) {
            newArr[indexTo + i] = old[indexFrom + i];
        }

    }

    public static int[] copyOfArray(int[] array, int newLength) {
        int[] result = new int[newLength];

        for (int i = 0; i < result.length && i < array.length; i++) {
            result[i] = array[i];
        }

        return result;
    }

    public static int[] copyOfRange(int[] array, int begin) {
        return copyOfRange(array, begin, array.length);
    }

    public static int[] copyOfRange(int[] array, int begin, int end) {
        if (end < begin) return new int[0];

        int[] result = new int[end - begin];
        int counter = 0;

        for (int i = begin; i < end; i++) {
            result[counter++] = array[i];
        }
        return result;
    }

    public static boolean isEqualsArrays(int[] a, int[] b) {

        // сравнение ссылок
        boolean tempEquals = a == b;
        if (tempEquals) {
            System.out.println("Ссылки равны");
            return true;
        }

        // сравнение длинны.
        tempEquals = a.length != b.length;
        if (tempEquals) return false;

        // перебираем значения и сравниваем
        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }

        return true;
    }
}
