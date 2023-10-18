package lesson_28_2023_10_13_practice;

public class Main {
    public static void main(String[] args) {

//        Table.Pair pair = new Table.Pair("Marsel", 29);

//        Table table = new Table();
//
//        table.put("Marsel", 30);
//        table.put("Viktor", 27);
//        table.put("Alisher", 29);
//
//        table.put("Viktor", 28);
//
//        System.out.println(table.get("Viktor"));
//        System.out.println(table.get("Marsel"));

        Table table1 = new Table();
        table1.put("A", 10);
        table1.put("B", 20);
        table1.put("C", 30);

        Table table2 = new Table();
        table2.put("X", 100);
        table2.put("Y", 200);
        table2.put("Z", 400);

//        TablePrinter printer1 = new TablePrinter(table1);
//        TablePrinter printer2 = new TablePrinter(table2);

        Table.Printer printer1 = table1.new Printer("HI:");
        Table.Printer printer2 = table2.new Printer("BY:");

        printer1.print();
        printer2.print();





    }


}
