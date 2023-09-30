package lesson_07_2023_09_13;

import java.util.Random;
import java.util.Scanner;

public class IfStatement {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int x = 10;

        {
            int y = 5;
            x = 11;
            x = x + y;
        }

        // x = x + y; // ошибка так как "у" в не зоны видимости

        System.out.println(x);

//        if (x > 25) System.out.println("Всем привет!!");

        x = 4;

        if (x > 123) {
            System.out.println("Всем привет!!");
            System.out.println("Сейчас х равен -> " + x);
        } else if (x < 5) {
            System.out.println("Мы находимся в блоке else if");
            System.out.println("Сейчас х равен -> " + x);
        } else {
            System.out.println("Мы находимся в блоке else!");
        }

        System.out.println("Продолжение программы.");

        int number;
        System.out.println("Введите число от 1 или 10: ");

        number = scanner.nextInt();

        if (number == 1) {
            System.out.println("Вы ввели число один");
        } else if (number == 10) {
            System.out.println("Вы ввели число десять");
        } else {
            System.out.println("Вы ввели не верное число");
        }

        System.out.println("/n=Задачка с деньгами================");

        int money = 100;
        int note;

        Random random = new Random();

        // Генерация случайного числа int от 0 до (bound - 1)
        note = random.nextInt(5) + 1; // 0, 1, 2, 3, 4

        System.out.println("Ребенок получил оценку: " + note);

        //note = 1;

        if (note == 5) {
            money += 20;
        } else if (note == 4) {
            money +=  10;
        } else if (note == 2) {
            money -= 20;
        } else if (note == 1) {
            money = 0;
        }

        System.out.println("У ребенка теперь: " + money + " денег");


        System.out.println("\n=Задачка с числами================");
        int numar2;
        System.out.println("Введите число: ");
        numar2 = scanner.nextInt();

        if (numar2 > 10) {
            numar2 += 20;
        } else if (numar2 == 4) {
            numar2 *= 4;
        } else {
            numar2 *= -1;
        }

        System.out.println("Значение числа после манипуляций: " + numar2);

        System.out.println("\n=Тернарный оператор================");

        int numar3;
        System.out.println("Введите число: ");
        numar3 = scanner.nextInt();

        // это эквивалентно записи через if
        numar3 = (numar3 >= 0) ? numar3 + 20 : numar3 * 2; // true -> numar3 = numar3 + 20; false -> numar3 = numar3 * 2;
        // обе записи равнозначны по логике выполнения присвоения
//        if (numar2 >= 0) {
//            numar3 += 20; // true -> numar3 = numar3 + 20;
//        } else {
//            numar3 *= 2; // false -> numar3 = numar3 * 2
//        }

        System.out.println(numar3);
        // пример использования тернарного оператора
        System.out.println("numar3 сейчас " + ((numar3 >= 0)? "больше нуля;" : "меньше нуля"));
    }
}
