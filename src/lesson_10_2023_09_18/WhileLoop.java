package lesson_10_2023_09_18;

public class WhileLoop {
    public static void main(String[] args) {

////        while (true) { // Бесконечный цикл
////            System.out.println("Hello");
////        }
//
////        Распечатать все числа от 0 до 10
//
//        int x = 0;
//
//        while (x <= 10) {
//            System.out.println("X равен: " + x);
//            x++;
//        }
//        // x = 11;
//        System.out.println("X после цикла равен: " + x);
//
//        System.out.println("Конец цикла");
//
//        // Распечатать все числа от 100 до 90 - в порядке убывания
//
//        int y = 100;
//        while (y >= 90) {
//            System.out.println("Y равен: " + (y--));
//        }
//        // y = 89;
//        System.out.println("Y после цикла равен: " + y);
//
//        // вывести все четные числа в диапазоне от 0 до 21
//
//        int even = 0;
//
//        while (even <= 21) {
//            if (even != 0 && even % 2 == 0) {
////                System.out.println("Число: " + even + " четное;"); // после печати переводит каретку на строку вниз
//                System.out.print(even + "; "); // печатает без перевода каретки, в строку
//            }
//            even ++;
//        }
//
//        System.out.println();
//        System.out.println("Even после цикла: " + even);
//
//        System.out.println("End ========================");
//        // do-while
//
//        int a1 = 0;
//        while (a1 < 0) {
//            System.out.println("Внутри цикла While: " + a1);
//        }
//
//
//        do {
//            System.out.println("Внутри цикла do-While: " + a1);
//            a1++;
//        } while (a1 < 6);
//
//        System.out.println("a1 после цикла: " + a1);
//
//        System.out.println("Примеры ============================");
//
//        Scanner scanner = new Scanner(System.in);
//        int nember = 0;
//
//        // while
//        System.out.println("Пример // while. - Введите число 1, 2");
//        nember = scanner.nextInt();
//
//        while (nember != 2 && nember !=1) {
//            System.out.println("Пример // while. - Введите число 1, 2");
//            nember = scanner.nextInt();
//        }
//
//        System.out.println("После while. Спасибо, вы ввели один или два");
//
//        // do-while
//        do {
//            System.out.println("Пример // do-while. - Введите число 1, 2");
//            nember = scanner.nextInt();
//
//        } while (nember != 2 && nember !=1);
//
//        System.out.println("После do-while. Спасибо, вы ввели один или два");


        System.out.println("Задача!!!");

        int number1 = 10;
        int quan = 0;
        int summ = 0;

        while (number1 <= 29) {
            if (number1 % 2 == 1) {
                System.out.print(number1 + "; ");
                quan++;
                summ += number1;
            }
            number1++;
        }


        System.out.println();
        System.out.println("Всего " + quan + " нечетных чисел.");
        System.out.println("Сумма нечетных чисел: " + summ);
        System.out.println("Среднее арифметическое нечетных чисел: " + (double) summ / quan);

    }

}
