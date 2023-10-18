package lesson_24_2023_10_09.vehicle;

public class Bus extends Vehicle {

    int capacity;

    int countPassengers;

    public Bus(String model, int yearOfMan, int capacity) {
        super(model, yearOfMan);
        //System.out.println("Конструктор Bus");
        this.capacity = capacity;
    }

    public Bus() {
        this.setModel("Bus-01");
        //super();
    }

    public void takePassenger() {
        if (countPassengers < capacity) {
            countPassengers++;
            System.out.println("Пассажир зашел в автобус! " + this.getModel());
        } else {
            System.out.println("Автобус полный");
        }
    }

    public void dropOfPassenger() {
        if (countPassengers > 0) {
            countPassengers--;
            System.out.println("Пассажир вышел из автобуса.");
        } else {
            System.out.println("В автобусе больше нет пассажиров.");
        }
    }


    public int getCapacity() {
        return capacity;
    }


    public int getCountPassengers() {
        return countPassengers;
    }
}
