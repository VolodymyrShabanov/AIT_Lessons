package lesson_29_2023_10_16.flyable;

public class Duck implements Swimmable, Flyable{
    @Override
    public void fly() {
        System.out.println("Duck fly");
    }

    @Override
    public void swim() {
        System.out.println("Duck swim");
    }
}
