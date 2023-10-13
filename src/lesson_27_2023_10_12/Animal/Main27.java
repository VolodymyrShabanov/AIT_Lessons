package lesson_27_2023_10_12.Animal;

public class Main27 {
    public static void main(String[] args) {
        // Ошибка. Не может быть создан объект абстрактного класса
        // Animal animal = new Animal();

        Dog dog1 = new Dog();
        Cat cat1 = new Cat();

        dog1.move();
        dog1.eat();

        cat1.move();
        cat1.eat();

    }
}
