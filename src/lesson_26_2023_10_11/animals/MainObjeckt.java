package lesson_26_2023_10_11.animals;

import java.sql.SQLOutput;

public class MainObjeckt {
    public static void main(String[] args) {
        Dog dog = new Dog();

        String string = "Hello " + dog; //.toString();
        System.out.println(string);

        Hamster hamster = new Hamster();
        hamster.sound("Hello");

        int totalAnimals = Animal.getTotalAmount();
        System.out.println("totalAnimals: " + totalAnimals);

        Hamster hamster1 = new Hamster();
        Animal[] animals = new Animal[2];
        animals[0] = dog;
        animals[1] = hamster1;

        for (Animal animal: animals) {
            System.out.println(animal);
        }




    }
}
