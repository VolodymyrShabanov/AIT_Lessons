package lesson_30_2023_10_17.methods;

public class PrinterApp {
    public static void main(String[] args) {
        String[] strings = new String[]{"Test", "hello", "printer", "Journal"};
        Integer[] integers = new Integer[]{1, 6, 5, -10, 0, 1};

        Printer printer = new Printer();
        printer.<String>printArray(strings);
        System.out.println("=================");
        printer.printArray(integers);

        System.out.println(printer.minValue(integers));
        System.out.println(printer.minValue(strings));
        System.out.println("=================");

        System.out.println(printer.sunArray(integers));

//        Printer<String> intPrinter = new Printer<>();
//        intPrinter.print("100");


    }
}
