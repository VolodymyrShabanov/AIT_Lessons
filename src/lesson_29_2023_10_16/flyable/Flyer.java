package lesson_29_2023_10_16.flyable;

public class Flyer {

    public static void main(String[] args) {
        Flyable airplane = new Airplane(15);
        Flyable duck = new Duck();

        Flyable[] flyables = new Flyable[2];
        flyables[0] = airplane;
        flyables[1] = duck;

        for (Flyable flyer : flyables) {
            if (flyer instanceof Airplane) {
                Airplane test = (Airplane) flyer;
                System.out.println("количество пассажиров в самолете: " + test.countPassengers());
            }
        }

    }
}
