package lesson_43_2023_11_03_practice.functions.convert;

/**
 * Created by Volodymyr Sh on 03.11.2023
 * project name: AIT_Lessons
 */
public class Main {
    public static void main(String[] args) {
        Point a = new Point(4, 1, 5);
        Point b = new Point(6, 2, 8);
        Point c = new Point(10, 11, 15);
        Point d = new Point(15, 2, 5);

        PointsPrinter printer = new PointsPrinter();

        Point[] points = {a, b, c, d};


        EnglishConvertImpl english = new EnglishConvertImpl();
        RussianConvertImpl russian = new RussianConvertImpl();

        // Абстрактный класс
        Convert math = new Convert() {
            @Override
            public String from(int x, int y, int z) {
                return "(" + x + ", " + y + ", " + z + ")";
            }
        };

        Convert math2 = (x, y, z) -> {
            return "(" + x + ", " + y + ", " + z + ")";
        };

        printer.printAll(points, english);
        printer.printAll(points, russian);
        printer.printAll(points, math);
        printer.printAll(points, math2);

        printer.printAll(points, (q, w, e) -> "{" + q + ", " + w + ", " + e + "}");


    }
}
