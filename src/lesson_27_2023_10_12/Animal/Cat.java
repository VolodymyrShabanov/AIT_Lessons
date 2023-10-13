package lesson_27_2023_10_12.Animal;

public class Cat extends Animal{
    @Override
    public void move() {
        System.out.println("Cat moved");
    }

    @Override
    public void eat() {
        System.out.println("Cat eat");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Cat");
    }

}
