package lesson_08_2023_09_14;

import java.util.Scanner;

public class SwitchExample {
    public static void main(String[] args) {

//        int x = 13;
//
//        if (x == 5) {
//            System.out.println("if: x равен 5");
//        } else if (x == 7) {
//            System.out.println("if: x равен 7");
//        } else {
//            System.out.println("if: Что-то другое");
//
//        }
//
//
//        switch (x) {
//            case 5:
//                System.out.println("switch: x равен 5");
//                break;
//            case 7:
//                System.out.println("switch: x равен 7");
//                //break;
//            case 9:
//                System.out.println("switch: x равен 9");
//                //break;
//            default:
//                System.out.println("switch: Что-то другое");
//                break;
//            case 13:
//                System.out.println("switch: x равен 13");
//                break;
//        }
//


//        System.out.println("\n===========================");
//        // Задача из урока 7  про деньги реализация switch
//        Random random = new Random();
//        int money = 100;
//        int note = random.nextInt( 5) + 1;
//
//        System.out.println("Ребенок получил оценку: " + note);
//
//        switch (note) {
//            case 5:
//            money += 20;
//                break;
//            case 4: // (if (note == 4 || note == 3)
//            case 3:
//                money += 10;
//                break;
//            case 2:
//                money -= 20;
//                break;
//            case 1:
//                money = 0;
//        }

//        System.out.println("У ребенка теперь: " + money + " денег");

//        System.out.println("У меня есть загадка:");
//        System.out.println("Что это такое: желтый, большой, с рогами и полный зайцев?");
//        System.out.println("Как думаешь?");

        Scanner scanner = new Scanner(System.in);

//        String answer = scanner.nextLine();
//        scanner.nextLine(); // Добавляем эту строку, чтобы съесть пустую строку в буфере ввода

//        String answerClean = answer.trim().toLowerCase();
        // trim() - убираем пробелы спереди и сзади.
        // toLowerCase() - приводит весь текст к нижнему регистру.

//        switch (answerClean) {
//            case "троллейбус":
////            case "Троллейбус":
//            case "троллейбус!":
//                System.out.println("Молодец! Угадал!");
//                break;
//            case "сдаюсь":
////            case "Сдаюсь":
//            case "сдаюсь!":
//                System.out.println("Быстро ты сдался :( Правильный ответ троллейбус!");
//                break;
//            default:
//                System.out.println("Ответ не верный! Попробуй еще раз.");
//                break;

        String answerCur = scanner.nextLine();
        String answerCurClean = answerCur.trim().toUpperCase();

        String currency;

        switch (answerCurClean) {
            case "USD":
                currency = "USD - доллар США";
                break;
            case "CHF":
                currency = "CHF - швейцарский франк";
                break;
            case "EUR":
                currency = "EUR - Евро";
                break;
            case "PLN":
                currency = "PLN - польский злотый";
                break;
            case "CZK":
                currency = "CZK - чешская крона";
                break;
            default:
                currency = "Шифр валюты введен не корректно!";
        }

        System.out.println(currency);

    }

}
