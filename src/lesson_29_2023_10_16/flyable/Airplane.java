package lesson_29_2023_10_16.flyable;

import java.awt.*;

public class Airplane extends Transport implements Flyable{

    public Airplane(int capacity) {
        super(capacity);
    }

    @Override
    public void fly() {
        System.out.println("Airplane fly");
    }

    @Override
    void takePassengers() {
        System.out.println("Беру на борт пассажиров");
    }

}
