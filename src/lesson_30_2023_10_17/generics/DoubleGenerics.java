package lesson_30_2023_10_17.generics;

public class DoubleGenerics<T, E> {
    private T name;
    private E value;
    private E[] arrays;

    public DoubleGenerics(T name, E value) {
        this.name = name;
        this.value = value;
    }

    @Override
    public String toString() {
        return "DoubleGenerics{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }

    public static void main(String[] args) {
        DoubleGenerics<String, Integer> testGeneric = new DoubleGenerics<>("John", 100);
        System.out.println(testGeneric);
        DoubleGenerics<Double, Double> testGeneric3 = new DoubleGenerics<>(10.5, 10.0);

    }
}
