package lesson_54_2023_11_22;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Volodymyr Sh on 22.11.2023
 * project name: AIT_Lessons
 */
public class DataChange {

    public static void main(String[] args) {
        // ======= Промежуточный методы для изменения потока (типа) данных: =======
        // map(Function<T, R> mapper)
        // flatMap(Function<T, R> mapper)
        // mapToObj(IntFunction() mapper)

        task_1();
        task_2();



    }

    private static void task_2() {
        int[] ints = new int[]{1, 2, 3, 4, 5, 6};
        List<Integer> integers = Arrays.stream(ints)
                //.mapToObj(i -> i)
                .boxed()
                .collect(Collectors.toList());
        System.out.println("integers: " + integers);
    }

    private static void task_1() {
        Shop shop = new Shop("Shop1", List.of("Orange", "Banana", "Apple"));
        Shop shop1 = new Shop("Shop2", List.of("Lime", "Cherry", "Pineapple"));
        Shop shop2 = new Shop("Shop3", List.of("Greape", "Lemon", "Apple"));

        Shop[] shops = new Shop[]{shop, shop1, shop2};

        List<String> products = Arrays.stream(shops)
                .flatMap(shopCurrent -> shopCurrent.getProducts().stream())
                .collect(Collectors.toList());

        System.out.println(products);

        String[] strings = new String[]{"ABC", "def", "qwerty", "XYZ"};

        List<String> stringList = Arrays.stream(strings)
                .flatMap(str -> str.chars().mapToObj(c -> String.valueOf((char) c)))
                .collect(Collectors.toList());

        System.out.println(stringList);


    }
}
