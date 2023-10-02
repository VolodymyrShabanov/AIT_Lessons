package lesson_20_2023_10_02;

public class MainDog {
    public static void main(String[] args) {
        Dog dog = new Dog("Max", 54);

        System.out.println(dog.toString());

        int[] barriers = {50, 150, 85, 120, 107, 112};

        int countPassed = 0;
        for (int barrier: barriers) {
            System.out.println("Новый барьер: " + barrier);
            boolean isTaken = dog.takeBarrier(barrier);
            if (isTaken) countPassed++;
            System.out.println("==========================\n");
        }
        System.out.println("\nСобака преодолела " + countPassed + " барьеров.");

    }
}
