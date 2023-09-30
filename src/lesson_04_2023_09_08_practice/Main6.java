package lesson_04_2023_09_08_practice;

import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        // создаем сканер!!! для по
        Scanner scanner = new Scanner(System.in); // НУЖНО запомнить!!!!

        System.out.println("Введите первое слово:");
        String word1 = scanner.nextLine();
        System.out.println("Введите второе слово:");
        String word2 = scanner.nextLine();

        String result = word1 + " " + word2;

        System.out.println("Результат:");
        System.out.println(result);

    }
}
