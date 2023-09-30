package lesson_07_2023_09_13;

public class StringExample {

    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = "Java";
        String str3 = "JaVA";
        String str4 = new String("Java");

        System.out.println(str1);
        System.out.println(str4);

        boolean b1 = str1 == str2;
        System.out.println("str1 == str2 -> " + b1);
        System.out.println("str1 == str3 -> " + (str1 == str3));
        System.out.println("str1 == str4 -> " + (str1 == str4));
        // ВАЖНО!!!
        // Сравнение срок по значению осуществляется методом equals();
        System.out.println("str1.equals(str4) -> " + str1.equals(str4));
        System.out.println("str1.equals(str3) -> " + str1.equals(str3));
        System.out.println("str1.equalsIgnoreCase(str3) -> " + str1.equalsIgnoreCase(str3));

        /*
        При работе со строками важно понимать, что объект String является неизменяемым
        (immutable). То есть при любых операциях над строкой, которые изменяют эту
        строку, фактически будет создаваться новая строка.
         */
        str1 = "Java111";
        System.out.println(str1);
        System.out.println(str2);



    }
}
