package lesson_29_2023_10_16.calculator;

public interface Summable {

    double PI = 3.141519;

    default int sum(int ... ints) {
        return getSum(ints);
    }

    private int getSum (int[] ints) {
        int sum = 0;
        for (int value: ints) {
            sum += value;

        }
        return sum;
    }
}
