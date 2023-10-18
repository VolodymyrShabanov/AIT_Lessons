package lesson_30_2023_10_17.generics;

//public class GenericBox <T extends Number>{ // "extends Number" ограничение типа сверху
public class GenericBox <T>{
    private T value;

    public GenericBox(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "GenericBox{" +
                "value=" + value +
                '}';
    }


}
