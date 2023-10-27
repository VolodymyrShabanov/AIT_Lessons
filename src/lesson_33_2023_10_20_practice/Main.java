package lesson_33_2023_10_20_practice;

import javax.xml.stream.events.DTD;

public class Main {
    public static void main(String[] args) {
        Bus bus = new Bus("22A");
        Bus bus2 = new Bus("1");

        Driver driver = new Driver("Marsel");

        driver.goToBus(bus);
        driver.goToBus(bus2);
        driver.goToBus(bus);

        Passenger p1 = new Passenger("Aysel");
        Passenger p2 = new Passenger("Mykhailo");
        Passenger p3 = new Passenger("Maxim");
        Passenger p4 = new Passenger("Mihail");
        Passenger p5 = new Passenger("Delayed");
        Passenger p6 = new Passenger("Delayed2");

        bus.addPassenger(p1);
        bus.addPassenger(p2);
        bus.addPassenger(p3);
        bus.addPassenger(p4);

        bus.go();
        bus.addPassenger(p5);
        bus.addPassenger(p6);
    }
}
