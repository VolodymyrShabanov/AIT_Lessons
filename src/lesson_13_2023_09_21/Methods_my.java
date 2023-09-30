package lesson_13_2023_09_21;

import java.util.Random;

public class Methods_my {
    public static void main(String[] args) {
        // написать метод распечатывающий от 1-го до n=
        printNumbers(10);

        // метод выводит не экран числа от X до Y
        printNumbers(3, 10);





//        System.out.println("Hello");

        Integer i = 10;
        test(i);

        sayHello();

        String string = "Java";
        saySomething(string);

        char ch = 'A';
        char anotherChar = 'B';
        char anotherChar2 = 'C';

        printDecimalCodeOfChar(ch);
        printDecimalCodeOfChar(anotherChar);
        printDecimalCodeOfChar(anotherChar2);

        int[] array = {1, 45, 76, 54, 90, 435, 0, 45};

        // метод вывода массива на печать
        printArray(array);

        // метод анализа числа из массива на простое или не простое
        for (int number : array) {
            printNumbersPrime(number);
        }


        int[] newArray = new int[10];
        fillArrayWithRandomValues(newArray);
        printArray(newArray);


        int temp = 55;
        changeMe(temp);
        System.out.println(temp);

        changeMe(newArray);
        printArray(newArray);

        int[] third = newArray;
        third[2] = -10000;

        printArray(newArray);

        third = null;

        newArray[4] = -1111;
        // third[0] = 10; Ошибка компиляции - NPE

        String string1 = "Hello";
        changeMe(string1);
        System.out.println(string1);



    } // main - Methods area

    private static void test(Integer i) {

    }

    public static void changeMe(String string) {
        string = string + "Privet";

        System.out.println(string);
    }


    public static void changeMe(int x) {
        x = 100;
    }

    public static void changeMe(int[] arr) {
        arr[0] = 100;
    }


    public static void fillArrayWithRandomValues(int[] arr) {
        Random random = new Random();
        int bound = 101;

        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(bound);

        }
    }

    public static void printNunbers(String str, int x) {
        System.out.println(str + "Поговори со мной");

    }

    public static void printNumbers(int x, int y) {
        System.out.println("\nМетод выводит не экран числа от X до Y:");
        for (int i = x; i <= y; i++) {
            System.out.print(i + "; ");
        }
        System.out.println();
    }

    public static void printNumbers(int n) {
        printNumbers(1, n); // Пере использование метода


//        System.out.println("\nМетод печатает от 1-го до n: ");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(i + "; ");
//        }
//        System.out.println();
    }

    public static void printNumbersPrime(int number) {
        System.out.println("Метод анализа числа из массива на простое или не простое");

        boolean isSimple = true;
        if (number == 1 || number < 0) isSimple = false;

        if (number % 2 == 0 && number != 2 || number % 3 == 0 && number != 3) {
            isSimple = false;
        }


        for (int j = 5; j <= Math.sqrt(number); j += 6) { // 2 ... n-1

            if (number % j == 0 || number % (j + 2) == 0) {
                isSimple = false;
                break;
            }
        }

        if (isSimple) {
            System.out.print(number + " - простое число");
        } else {
            System.out.println(number + " - не является простым");
        }
    }


    public static void printArray(int[] array) {
        System.out.println("\nМетод вывода массива на печать");

        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ((i < array.length - 1) ? ", " : "]\n"));
        }


    }

    public static void printDecimalCodeOfChar(char ch1) {
        System.out.println((int) ch1);
    }

    public static void sayHello() {
        // тело метода

        System.out.println("Hello");
    }

    public static void saySomething(String str) {
        System.out.println(str);
    }
} // end class
