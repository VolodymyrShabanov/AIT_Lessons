package lesson_29_2023_10_16.calculator;

public class Calculator implements Summable{
    private int[] values;

    public Calculator(int[] values) {
        this.values = values;
    }

    public int[] getValues() {
        return values;
    }

    public double getPi() {
        return PI;
    }

    public double areaCircle (double radius) {
        return radius * radius *  PI;
    }
}
