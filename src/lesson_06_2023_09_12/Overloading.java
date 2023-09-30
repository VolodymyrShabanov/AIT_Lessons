package lesson_06_2023_09_12;

public class Overloading {
    public static void main(String[] args) {
        /*переполнение типа
        при переполнении типа данных значения "идут по кругу"
        если к МАКСИМАЛЬНОМУ значению (допустимое типу переменной) добавить 1
        то получим МИНИМАЛЬНОЕ значение (допустимого значения типа)
        */

        byte byteVar = 127;

        System.out.println(byteVar);
        byteVar++;
        System.out.println(byteVar);

        int intVar = Integer.MAX_VALUE;
        System.out.println(intVar);
        intVar++;
        System.out.println(intVar);

        char ch = 65535;
        char ch1 = 0;
        System.out.println(ch);
        System.out.println(ch1);
        System.out.println(++ch);

    }
}
