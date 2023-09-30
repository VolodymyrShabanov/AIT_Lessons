package lesson_04_2023_09_08_practice;

import java.util.Locale;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);



        System.out.println("Введите начальную остановку:");
        String start = scanner.nextLine();
        System.out.println("Введите конечную остановку");
        String finish = scanner.nextLine();

        System.out.println("Сколько минут хотите затратить:");
        double minutes = scanner.nextDouble();

        System.out.println("Введите расстояние в метрах:");
        double distance = scanner.nextDouble();

        String message = "Вам нужно от " + start + " до "
                + finish + " проехать " + distance +
                " метров за " + minutes + " минут";

        System.out.println(message);


    }
}
