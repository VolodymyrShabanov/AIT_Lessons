package lesson_30_2023_10_17.generics;

public class GenericBoxApp {
    public static void main(String[] args) {
        GenericBox<String> stringBox = new GenericBox<>("Hello");
        GenericBox<String> stringBox1 = new GenericBox<>(", world");
        System.out.println(stringBox);
        System.out.println(stringBox.getValue() + stringBox1.getValue());


        // Ошибка на этапе компиляции
        //stringBox.setValue("100");
        //GenericBox<String> stringGenericBox = new GenericBox<>(100);

        //GenericBox<int> intBox = new GenericBox<>();
        GenericBox<Integer> intBox = new GenericBox<>(150);
        GenericBox<Integer> intBox2 = new GenericBox<>(20);
        System.out.println(intBox.getValue() + intBox2.getValue());



    }
}
