package lesson_21_2023_10_04;

public class MathUtil {
    public static int symOfInts(int x, int... ints) {
        int sum = x;
        for (int values: ints) {
            sum += values;

        }
        return sum;
    }

}
