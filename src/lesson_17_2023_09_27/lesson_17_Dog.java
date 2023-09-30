package lesson_17_2023_09_27;

import home_work_17.Car;

public class lesson_17_Dog {
    public static void main(String[] args) {
        Dog dog  = new Dog("Bim", 5);
        System.out.println(dog.whoAmI());

        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.run();
        dog.run();

        System.out.println(dog.whoAmI());



    }

}
