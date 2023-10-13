package lesson_26_2023_10_11.animals;

public class MainAnimals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Cat cat = new  Cat();
//        cat.sayHello();
        Hamster hamster = new Hamster();

//        dog.sound();
//        cat.sound();
//        hamster.sound();

        Animal animal = new Dog();
        System.out.println("Get class: " + animal.getClass().getName());
//        animal.sound();

        Animal[] animals = new Animal[4];
        animals[0] = dog;
        animals[1] = cat;
        animals[2] = hamster;
        animals[3] = new SuperDog();

        for (int i = 0; i < animals.length; i++) {
            animals[i].sound();
        }
        System.out.println("downCast===================");
        for (Animal currentAnimal: animals) {
            currentAnimal.sound("Lets fun!");
            if (currentAnimal instanceof Cat) {
                Cat tempCat = (Cat) currentAnimal;
                tempCat.sayHello();
            }
        }

        System.out.println("\n===================");

        Object object = new Dog();
        Dog dog1 =(Dog) object;
        dog1.sound();

//        Object object1 = new Cat();
//        Dog dog2 =(Dog) object1;
//        dog2.sound();
//

        Animal superDog = new SuperDog();
        System.out.println(superDog instanceof Dog);
        System.out.println(superDog instanceof SuperDog);





    }

}
