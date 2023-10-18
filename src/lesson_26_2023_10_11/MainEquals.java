package lesson_26_2023_10_11;

public class MainEquals {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Dog dog1 = new Dog();

        System.out.println(dog);
        System.out.println(dog1);

        System.out.println(dog == dog1);

        System.out.println(dog.equals(dog1));

    }
}
