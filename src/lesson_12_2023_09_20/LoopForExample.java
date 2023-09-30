package lesson_12_2023_09_20;

import java.util.Arrays;
import java.util.Random;

public class LoopForExample {
    public static void main(String[] args) {
//        /*
//        for (<Блок инициализации> ; <Блок проверки> ; <Блок условия>) {
//        //
//        }
//         */
//
//        System.out.println("while: ");
//        int j = 0;
//        while (j <= 10) {
//            System.out.print(j + " ");
//            j++;
//        }
//        System.out.println("\n end while loop");
//
//        System.out.println("for: ");
//        for (int i = 0; i <= 10; i++) {
//            System.out.print(i + " ");
//        }
//        System.out.println("\n end for loop");
//
////        // бесконечный цикл for - если не указывать условия.
////        for (;;) { // ни один из блоков не является обязательным
////            System.out.println("Hello");
////        }
////
////        for (int i = 0; i >= 0; i = i + 15_000) {  // при такой записи произойдет ПЕРЕПОЛНЕНИЕ int-a
////                                                   // и он пойдет по кругу в итого i станет отрицательной
////            System.out.println("hello " + i);
////        }
//
//        // Переменная - счетчик объявленная в <Блок инициализации> - не видна т.е. ее значение недоступно
//
//        int i; // что-бы получить значение счетчика его нужно объявить до цикла
//        for (i = 0; i <= 20; i += 5) {
//            System.out.println("hello " + i);
//
//        }
//        System.out.println("Значение i: " + i);
//
//        // пример работы с типом String
//
//        for (String str = "Hello"; str.length() < 10; str += "$") {
//            System.out.println(str);
//        }
//
//        int k = 0;
//        // Какой-то код .... и далее мы применяем for
//        k = 14;
//        for (int a = 0, f = 1; k >= 0 && f < 10; k--, a = ++a + k, f++) {
//            System.out.println(k + " : " + a + " : " + f);
//        }

        System.out.println("Решение задач====================================");
        System.out.println("Задача 1.");
        Random random = new Random();

        // random.nextInt(11) -> (0 ... 10) + 5 -> (5 ... 15)
        int [] array = new int [random.nextInt(11) + 5]; // получаем длину массива от 5 до 15
        System.out.println("длина массива : " + array.length);

        int bound = 50;
        System.out.print("[");
        for (int l = 0; l < array.length; l++) {
            // random.nextInt(2 * 50 + 1) -> (0 ... 100) - 50 -> (-50 ... 50)
            array[l] = random.nextInt(2 * bound + 1) - bound; // плучаем значения от - 50 до 50
            System.out.print(array[l] + ((l < array.length - 1) ? ", " : "]\n"));
        }

        System.out.println("сontinue and break =======================================");

        // сontinue - завершает текущую итерацию цикла в которой он был вызван, т.е. перейти к следующей итерации (код работает дальше)
        // break - завершает текущую итерацию и цикл (STOP!)

        for (int i = 1; i < 10; i++) {
            if (i == 3) continue; // 3 - я итерация пропущена, далее идет 4 5 и ...
            if (i == 6) break; // все чо до 6-й итерации выполнялось, а после (в т.ч. и 6-я) не выполняется
            System.out.print(i + " ");
        }
        System.out.println("\nend for loop with continue and break");

        System.out.println();

        // continue - запускает while в бесконечный цикл
        int y = 1;
        while (y < 7) {
            if (y == 3) break;
            System.out.println(y++ + " y");
        }
        System.out.println("\nend while loop with break");

        System.out.println("========================================");
        System.out.println("Задача 2.");

        array = new int [] {10, 11, 5, 6, 7, 8 , 5, 10};
        System.out.println(Arrays.toString(array));

        int numberForSearch = 5;
        int index = -1;

        // индекс ПОСЛЕДНЕГО искомого элемента удовлетворяющего условию
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberForSearch) {
                index = i;
            }
        }
        System.out.println("Index числа 5 в массиве: " + index);

        // индекс ПЕРВОГО искомого элемента удовлетворяющего условию
        for (int i = 0; i < array.length; i++) {
            if (array[i] == numberForSearch) {
                index = i;
                break;
            }
        }
        System.out.println("Index числа 5 в массиве: " + index);

        // Распечатать 5 раз числа от 2 до 7 вкл.
        for (int i = 0; i < 5; i++) {
            for (int j = 2; j <= 7; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

    }
}
