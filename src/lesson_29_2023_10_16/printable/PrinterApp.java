package lesson_29_2023_10_16.printable;

public class PrinterApp {
    public static void main(String[] args) {
        Printable book = new Book("Философия Java", "Б. Эккель");
        Printable journal = new Journal ("Cosmopolitan", 23);

        Book book1 = new Book("Мастер и маргарита", "М. Булгаков");

        book.print();
        journal.print();
        book1.print();
        book.test();
        journal.test();

        Printable.testStatic("Hello");

        Presentation presentation =
                new Presentation("Inheritance", "Nomame" , "Inheritance in OOP", 120);

        presentation.print();
        presentation.colorPrint();
        presentation.test();

    }
}
