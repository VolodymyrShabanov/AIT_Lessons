package lesson_11_2023_09_19;

public class DivisionBy0 {
    public static void main(String[] args) {

        // деление на 0
        int x = 0;
        int y = 10;
        // int z = y / x; // м типами int - ошибка!!!
        // деление на 0 возможно с типами - double
        double infinity = 10.0 / 0;
        double infinity1 = 1000.0 / 0;

        System.out.println("(double) y / x -> " + (double) y / x);
        System.out.println("infinity -> " + infinity);
        System.out.println("infinity1 ==  infinity -> " + (infinity1 == infinity));
        System.out.println("100 / infinity -> " + 100 / infinity);
        System.out.println("infinity1 / infinity -> " + (infinity1 / infinity));

    }
}
