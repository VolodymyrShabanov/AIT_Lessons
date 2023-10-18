package lesson_29_2023_10_16.printable;

    //public abstract interface Printable {
public interface Printable {
    //    public abstract void print();
    void print();

    default void test() {
        System.out.println("Test");
    }

    static void testStatic(String str) {
        System.out.println("Static method print: " + str);
    }
}



