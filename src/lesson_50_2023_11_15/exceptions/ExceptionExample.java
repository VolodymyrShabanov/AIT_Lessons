package lesson_50_2023_11_15.exceptions;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Volodymyr Sh on 15.11.2023
 * project name: AIT_Lessons
 */
public class ExceptionExample {

    public static void main(String[] args) {
//        Ошибки компиляции:
//        String str = "Hello"
//        int a = "Java";

//        System.out.println("numa: 1");
////        System.out.println(1 / 0); // java.lang.ArithmeticException
//
//        System.out.println("numa: 2");
////        int [] array = {1, 2, 3, 4};
////        array [10] = 10; // java.lang.ArrayIndexOutOfBoundsException
//
//        System.out.println("numa: 3");
////        String str = null;
////        str.length(); // java.lang.NullPointerException
//
//        System.out.println("numa: 4");

        String string = "1F";
        int integer;
//        integer = Integer.parseInt(string); // java.lang.NumberFormatException

        try {
            integer = Integer.parseInt(string); // java.lang.NumberFormatException
            System.out.println("Try end");
        } catch (NumberFormatException exception) {
            exception.printStackTrace();
            integer = 0;
        } finally {
            System.out.println("Block finally!");
        }

        System.out.println("integer: " + integer);
        System.out.println("Продолжение выполнения программы");

        String url = getUrlString();

        System.out.println("Пытаемся открыть страницу: " + url);

        String url2 = null;
        try {
           url2 = getUrlString2();
        } catch (MalformedURLException exception) {
            System.out.println("Не верный формат адреса!");
            System.out.println(exception.toString());
        }

        System.out.println("Пытаемся открыть страницу 2: " + url2);
    }

    public static String getUrlString() {
        URL myUrl = null;
        String defaultUrlStr = "https://google.com";

        try {
            myUrl = new URL(defaultUrlStr);
            myUrl = new URL("htps://example.com");
        } catch (MalformedURLException exception) {
            System.out.println("Не верный формат URL: " + exception.getMessage());
        }
        return myUrl.toString();
    }


    public static String getUrlString2() throws MalformedURLException {
        URL myUrl = null;
        String defaultUrlStr = "https://google.com";

            myUrl = new URL(defaultUrlStr);
            myUrl = new URL("htts://example.com");

        return myUrl.toString();
    }

}
