package lesson_29_2023_10_16.printable;

public class Presentation implements ColorPrintable{
    String title;
    String author;
    String theme;
    int amountPages;

    public Presentation(String title, String author, String theme, int amountPages) {
        this.title = title;
        this.author = author;
        this.theme = theme;
        this.amountPages = amountPages;
    }

    @Override
    public void colorPrint() {
        System.out.println("Отправляю презентацию в типографию!");
        System.out.println("Presentation by " + author + "; title: " + title);
    }

    @Override
    public void print() {
        System.out.println("Presentation " + title + "(pages: " + amountPages + ")");
    }

    @Override
    public void test() {
        System.out.println("Print with red TEST!");
    }
}
