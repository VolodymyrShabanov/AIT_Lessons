package lesson_33_2023_10_20_practice;

import java.sql.SQLOutput;

public class Bus {

    private final String number;
    private final Passenger[] passengers;
    private int count;
    private Driver driver; // агрегирование, композиция, включение
    private boolean isGo;


    public Bus(String number) {
        this.number = number;
        this.passengers = new Passenger[5];
    }

    public void setDriver(Driver driver) {
        this.stop();
        if (driver == null) {
            System.err.println("Вы пытаетесь положить водителя null!");
        } else if (this.driver == driver) {
            System.err.println("Вы пытаетесь положить того же самого водителя...");
        } else if (this.driver != null) {
            System.err.println("А водитель уже есть! Освободите сначала его!");
        } else {
            System.out.println("Водитель " + driver.getName() + " в автобусе " + number);
            this.driver = driver;
        }
    }

    public void freeDriver() {
        this.stop();
        System.out.println("Водитель " + driver.getName() + " освобожден из автобуса " + number);
        this.driver = null;
    }

    public void addPassenger(Passenger passenger) {
        this.stop();
        if (count < passengers.length) {
            passengers[count++] = passenger;
        } else {
            System.err.println("Автобус заполнен!");
        }
    }

    public void go(){
        if (driver != null) {
            this.isGo = true;
            System.out.println("Автобус " + number + " поехал под управлением " + driver.getName());

            System.out.println("Пассажиры автобуса");
            for (int i = 0; i < count; i++) {
                System.out.println(passengers[i].getName());
            }
        } else {
            System.err.println("у автобуса нет водителя :(");
        }
    }

    public String getNumber() {
        return number;
    }

    public void stop() {
        System.out.println("Автобус " + number + " был остановлен/или уже стоит");
        this.isGo = false;
    }
}
