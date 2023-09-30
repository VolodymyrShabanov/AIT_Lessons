package lesson_12_2023_09_20;

public class LoopForEachExample {
    public static void main(String[] args) {
        /*
        Оператор foreach
        Если же вы хотите перебрать элементы коллекции или массива и последовательно выполнить действия над каждым,
        начинайте с первого элемента (i=0).

        Шаг будет равен единице. Завершать надо будет при достижении конца коллекции (i<array.length).
        А доступ к каждому следующему элементу получите путем прямого обращения к элементу массива.
        Для этого используют значение индексной переменной (array[i]).
        Но нужно будет опять писать однообразный служебный код, который не относится к логике программы.

        Чтобы создавать подобные циклы было проще, в Java 1.6 добавили оператор foreach.
         */
        int[] ints = new int[]{10, 11, 5, 6, 7, 8, 5, 10};

        int sum = 0;
        int index = 0;
        for (int number : ints) {
            sum += number;
            System.out.println(number + " : " + index++);
        }
        System.out.println("Сумма всех чисел массива ints: " + sum);
        System.out.println();

        String[] string = {"Double", "refresh", "everybody", "energy", "food"};
        for (String str : string) {
            if (str.length() > 6) {
                System.out.print(str + "; ");
            }
            }



    }
}
