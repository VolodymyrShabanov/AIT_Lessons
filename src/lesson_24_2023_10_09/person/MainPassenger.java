package lesson_24_2023_10_09.person;

public class MainPassenger {
    public static void main(String[] args) {
        Passenger passenger = new Passenger("Viktor" , 14, 15054);

        passenger.info();

        passenger.passengerInfo();
        passenger.setAge(15);
        passenger.passengerInfo();

        System.out.println("===========================");

        Passenger passenger1 = new Passenger("Bob" , 25, 15057);
        passenger1.passengerInfo();
        System.out.println(passenger1.getName());

        System.out.println("===========================");

        BusDriver driver = new BusDriver("John", 45, "Lisense 12");
        driver.info();
        driver.driverInfo();
        System.out.println(driver.getId());
        System.out.println("===========================");

    }
}
