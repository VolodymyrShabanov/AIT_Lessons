package lesson_25_2023_10_10;

import java.util.Arrays;

public class MainBus {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("B. Smith");
//        System.out.println(passenger.toString());
//        System.out.println(passenger.getTicketNumber());
//

        BusDriver driver = new BusDriver("K. White" , "AB-4343432");
        System.out.println(driver.toString());

        Bus bus = new Bus("Neoplan", 44, driver);
        System.out.println(bus.toString());

        // Dane - вывод массива пассажиров.
        // Dane - вывод отсутствие драйвера.

        Bus bus1 = new Bus("Scaniz", 40);
        System.out.println(bus1.toString());

        Passenger passenger1 = new Passenger("N. Paul");
        Passenger passenger2 = new Passenger("J. Black");
        Passenger passenger3 = new Passenger("P. Dou");


        System.out.println(bus1.getAmountPassenger());
        bus1.takePassenger(passenger);
        bus1.takePassenger(passenger2);
        bus1.takePassenger(passenger1);
        System.out.println(bus1.getAmountPassenger());
        System.out.println(Arrays.toString(bus1.getPassengers()));
        System.out.println(bus1.toString());

        bus1.droopPassenger(passenger2);
        System.out.println(bus1.getAmountPassenger());
        System.out.println(Arrays.toString(bus1.getPassengers()));
        System.out.println(bus1.toString());


        bus1.takePassenger(passenger3);
        System.out.println(bus1.getAmountPassenger());
        System.out.println(Arrays.toString(bus1.getPassengers()));
        System.out.println(bus1.toString());

        Passenger passenger4 = new Passenger("A. Jonet");

        bus1.droopPassenger(passenger);
        bus1.droopPassenger(passenger1);
        bus1.takePassenger(passenger4);
        System.out.println(bus1.getAmountPassenger());
        System.out.println(Arrays.toString(bus1.getPassengers()));
        System.out.println(bus1.toString());

        System.out.println("Set new Driver");
        BusDriver bob = new BusDriver("Bob Grand", "AD-234");
        bus1.setDriver(bob);
        System.out.println(bus1.toString());

        BusDriver gena = new BusDriver("Gennadiy", "GS-345");
        bus1.setDriver(gena);
        System.out.println(bus1.toString());

        System.out.println(bob.getDriverLicence());


    }
}


//        StringBuilder sb = new StringBuilder("Hello");
//        sb.append(124);
//        System.out.println(sb.toString());
//        sb.setLength(sb.length() - 3);
//        System.out.println(sb.toString());
