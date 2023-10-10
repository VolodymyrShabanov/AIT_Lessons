package lesson_24_2023_10_09.person;

public class Passenger extends Person {

    private final int id;
    private static int count;
    private int ticketNumber;

    private boolean isKind;


    public Passenger(String name, int age, int ticketNumber) {
        super(name, age);
        this.id = count++;
        this.ticketNumber = ticketNumber;
        this.isKind  = age < 15;

    }

    public void sitIn() {
        System.out.println("Person name: " + getName() + " sit ia bus.");
    }

    public void drop() {
        System.out.println("Person name: " + getName() + " out bus.");
    }


    public void  passengerInfo () {
        System.out.print("Passenger id:" + id + " (ticket number: " + ticketNumber + "), isKind: " + (isKind ? "YES" : "NO") + " ->");
        super.info();
    }

    public static int getCount() {
        return count;
    }

    public static void setCount(int count) {
        Passenger.count = count;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }
}
