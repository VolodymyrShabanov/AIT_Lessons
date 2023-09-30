package lesson_03_2023_09_07;

public class MathOperations {
    public static void main(String[] args) {
        int a = 20;
        int b = 7;

        int result = a + b;  // сложение
        System.out.println("Result: " + result);

        result = a - b; // вычитание

        System.out.println("Result: " + result);

        result = a * b; // умножение

        System.out.println("Result a * b: " + a + " * " + b + " = " + result);

        //             20 / 7
        int resultDiv = a / b; // целочисленное деление 2.857...

        System.out.println("Result resultDiv: " + resultDiv);

        int test = 10 / 2;
        System.out.println("Result test:" + test);


        // Остаток от деления
        // перемещение строки Shift + Alt + ↑ + ↓
        int restDiv = a % b;
        System.out.println("Result restDiv: " + restDiv);

        // 20 / 7 -> 2 - целочисленное деление возвращает только целую часть
        // итого - resultDiv = 2

        // 20 / 7 = 20 - (7 * 2) = 6 - это ЦЕЛЫЙ остаток от деления
        // итого - restDiv = 6

        int restDiv1 = 21 % 7;
        System.out.println("Result 21 % 7: " + restDiv1);
        // если число делиться без остатка то остаток от деления возвращает "0"

        int restDiv2 = 5 % 10;
        System.out.println("Result 5 % 10: " + restDiv2);

        // Результат 5 / 10 -> = 0 (5 разделить на 10 -> 0.5 -> .5 - отброшено.)
        // Результат 5 % 10 -> 0 целых .5 (0 * 10) = 5

        // Целочисленное деление
        // x % 2 -> 0, 1;
        // x % 3 -> 0, 1, 2;
        // x % y -> 0, ... , y - 1;
        System.out.println(8 % 2);
        System.out.println(8 / 2);
        System.out.println(9 / 2);
        System.out.println(9 % 2);

        System.out.println("=====================");

        System.out.println();

        float floatVar = 20.0F;

        double doubleVar = 20.0D; // наличие D указывает что число записанное в типе - double;
        double doubleVar2 = 20.0; // все числа, записанные с точкой в Java по умолчании считается что число записано в формате - double;
        double doubleSeven = 7.0;

        double resultDoubleDiv = doubleVar / doubleSeven;

        System.out.println("resultDoubleDiv: " + resultDoubleDiv);

        System.out.printf("Результат деления 20 на 7 равен %.2f, но не %.1f \n", resultDoubleDiv, doubleSeven);

        // \n - перевод "каретки" на новую строку
        System.out.println("Строка 1\nСтрока 2\nСтрока 3");
        System.out.println("Приведение типов");

        int intVar1 = 20;
        int intVar2 = 7;

        double resultDouble = (double) intVar1 / (double) intVar2;
        System.out.println("Результат после проведения типов: " + resultDouble);

        int resultInt = (int) (doubleVar / doubleSeven);
        System.out.println("int from double: " + resultInt);

        double varDoub = 20;
        System.out.println(varDoub);

        long longVar = 10L;
        int x = (int) longVar;

    }
}
