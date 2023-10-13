package lesson_27_2023_10_12.Pen;

public class MainPaper {
    public static void main(String[] args) {
        Brush brush = new Brush();
        Pencil pencil = new Pencil();
        Marker marker = new Marker();

        Paper paper = new Paper();

        paper.drawFigure("Квадрат", brush);
        paper.drawFigure("Овал", pencil);
        paper.drawFigure("Треугольник", marker);

    }
}
