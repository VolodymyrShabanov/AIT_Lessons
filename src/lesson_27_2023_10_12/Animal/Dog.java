package lesson_27_2023_10_12.Animal;

import java.sql.SQLOutput;

public class Dog extends Animal{

    @Override
    void move() {
        System.out.println("Dog moved");
    }

    @Override
    void eat() {
        System.out.println("Dog eat");
    }

    @Override
    public void sayHello() {
        System.out.println("Hello from Dog");
    }
}
