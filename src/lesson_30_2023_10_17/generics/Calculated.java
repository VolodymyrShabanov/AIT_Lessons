package lesson_30_2023_10_17.generics;

public interface Calculated <T extends Number> {
    T sum(T v1, T v2);

    default void printValue(T value){
        System.out.println(value.intValue());
    }
}
