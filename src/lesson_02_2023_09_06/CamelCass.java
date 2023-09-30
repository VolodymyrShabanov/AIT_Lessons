package lesson_02_2023_09_06;

public class CamelCass {

    public static void main(String[] args) {

//         Однострочный комментарий
//         Ctrl + / - закомментировать/раскомментировать строку
//          Ctrl + Y - удаление строки
/*
много строчный комментарий
*/


        int myFirstVariable; // объявление (декларация) переменной типа int
//        int myFirstVariable;

        myFirstVariable = 1; // присвоение значения (инициализация) переменной




        int mySecondVariable = 25; // объявление и инициализация

        System.out.println("Value of int variable " + mySecondVariable);

        mySecondVariable = 100;

        System.out.println(mySecondVariable);

        byte byteVariable = 126;
        System.out.println(byteVariable);

        short shortVar = 32700;
        System.out.println(shortVar);

        long longVariable = 2_100_000_000_000_000_000L;
        System.out.println("Число типа  long" + longVariable);

        double doubleVariable; //инициализация переменной типа double
        doubleVariable = 10;

        System.out.println("Переменная типа double " + doubleVariable);

        doubleVariable = 5.5432;

        System.out.println(doubleVariable);


    }

}
