package lesson_24_2023_10_09.person;

public class BusDriver extends Person {

    private String driveLicence;
    private int id;
    private static int counter = 100;

    public BusDriver(String name, int age, String driveLicence) {
        super(name, age);
        this.driveLicence = driveLicence;
        this.id = counter++;
    }

    public void driverInfo() {
        System.out.println("BusDriver id: " + id + " (prava nomer: " + driveLicence + ") age: " + getAge());
    }

    public String getDriveLicence() {
        return driveLicence;
    }

    public void setDriveLicence(String driveLicence) {
        this.driveLicence = driveLicence;
    }

    public int getId() {
        return id;
    }


    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        BusDriver.counter = counter;
    }
}




