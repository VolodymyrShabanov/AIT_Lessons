package lesson_27_2023_10_12.Pen;

public class Pencil extends Pen {
    @Override
    public void draw(String figure) {
        System.out.println("Рисую карандашом " + figure);
    }
}
