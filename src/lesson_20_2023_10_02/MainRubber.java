package lesson_20_2023_10_02;

public class MainRubber {
    public static void main(String[] args) {
        RubberArray ra= new RubberArray();

        ra.add(0, 1, 2, 3, 4, 5, 6);

//        ra.cursor = 15;
//        int[] ints = {1, 2, 3};
//        ra.array = ints;

        ra.add(100);

        System.out.println(ra.toString());

    }

}
