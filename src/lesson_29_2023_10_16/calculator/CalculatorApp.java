package lesson_29_2023_10_16.calculator;


public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator(new int [] {3, 4, 5});

        System.out.println("summ values: " + calculator.sum(calculator.getValues()));
        System.out.println("summ values: " + calculator.sum(1, 2, 3, 4));

        System.out.println(calculator.getPi());
        System.out.println(calculator.areaCircle(15));

        System.out.println(Summable.PI);

    }
}
