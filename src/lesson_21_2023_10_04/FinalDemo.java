package lesson_21_2023_10_04;

public class FinalDemo {
    private final int x;

    private final int[] ints = new int[10];
    private final String name = "Max";

    private int y;
    private double[] doubles;

    public FinalDemo() {
        x = 12;
        ints[0] = 10;
        ints[0] = 100;
        ints [1] = 23;

    }

    public int getX() {
        return x;
    }

    public int[] getInts() {
        return ints;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double[] getDoubles() {
        return doubles;
    }

    public void setDoubles(double[] doubles) {
        this.doubles = doubles;
    }

    public static void main(String[] args) {
//        x = 10;
    }


}
