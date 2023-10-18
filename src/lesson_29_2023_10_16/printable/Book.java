package lesson_29_2023_10_16.printable;

public class Book implements Printable {
    String title;
    String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    @Override
    public void print() {
        System.out.printf("Book: %s (%s)\n", title, author);
    }

}
