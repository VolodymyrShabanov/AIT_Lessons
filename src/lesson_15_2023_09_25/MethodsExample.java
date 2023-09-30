package lesson_15_2023_09_25;

public class MethodsExample {
    public static void main(String[] args) {
        int var = 5;
        var = 10 + 5;

        int sumAB = calculateSum(10, 5);
        System.out.println("sumAB: " + sumAB);

        printSum(10, 5);

        int pow = -4;
        double var1 = powTwo(pow);
        System.out.printf("2 с степени %d = %.3f", pow, var1);
        System.out.println();

        System.out.println("================================================");

        int number = 5;
        int sqrNumber = squaredNumber(number);
        System.out.println("sqrNumber = " + sqrNumber);
        // перегрузка метода так как нужно принять тип данных double
        double number2 = 4.5;
        System.out.println("sqrNumber2 = " + squaredNumber(number2));

        //написать метод принимающий массив и возражающий минимальное значение этого массива

        int[] numbers = {4, 5, 3, 6, 7, 8, 3, 33, 32};

        int minNumber = minArray(numbers);
        System.out.println("Минимальное значение в массиве: " + minNumber);

        // написать метод определяющий присутствует ли число в массиве
        // тип возвращаемого значения bollean
        // параметры метода? массив и число (int)

        int searchMe = 3;
        boolean isArray = isNumberInArray(numbers, searchMe);
        System.out.println("Число " + searchMe + " в массиве: " + isArray);

        // написать метод поиска числа в массиве
        System.out.println("Число " + searchMe + " в массиве под индексом: " + searchNumberInArray(numbers, searchMe));

        System.out.println("Последнее вхождение элемента" + searchMe + " в массиве под индексом: " + searchLastNumberInArray(numbers, searchMe));
    } // main end

    public static boolean isNumberInArray(int[] numbers, int searchMe) {


        for (int value : numbers) {
            if (value == searchMe) return true;
        }
        return false;
    }

    public static int searchNumberInArray(int[] numbers, int searchMe) {
        int result = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchMe) return i;
        }

        return result;
    }

    // метод поиска индекса последнего вхождения элемента

    public static int searchLastNumberInArray(int[] numbers, int searchMe) {
        int result = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == searchMe) result = i;
        }

        return result;
    }


    public static int minArray (int[] ints) {
        if (ints.length < 1) return Integer.MIN_VALUE;

        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        return min;
    }

    public static double squaredNumber(double number) {
        return number * number;
    }
    public static int squaredNumber(int number) {
        number = number * number;
        return number;
    }

    public static void printSum(int a, int b) {
        int sum = a + b;
        System.out.println(sum);
    }

    public static int calculateSum(int a, int b) {
        printSum(a, b);

        int sum = a + b;
        return sum;
    }


    public static double powTwo(int x) {
        boolean isPositive = x >= 0;
        if (x < 0) {
            x *= -1;
        }
        int result = 1;
        for (int i = 0; i < x; i++) {
            result *= 2;
        }
        if (isPositive) {
            return result;
            //System.out.println(result);
        } else {
            return ((double) 1 / result);
            //System.out.printf("%.2f", (double) 1 / result);
        }
    }







}
