package lesson_26_2023_10_11.animals;

public class Hamster extends Animal {

    @Override
    public void sound() {
        System.out.println("Hamster say hrum-hrum!");
    }

    @Override
    public String toString() {
        return "Hamster";
    }
}

