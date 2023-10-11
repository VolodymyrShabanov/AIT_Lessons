package lesson_25_2023_10_10;

public class Bus {
    private final int id;
    private final String model;
    private int mileage;
    private final int capacity;
    private BusDriver driver;
    private final Passenger[] passengers;

    private final AutoPilot autoPilot;

    private int amountPassenger;
    private static int counterForId;
    private static int ticketCounter;

    public Bus(String model, int capacity) {
        this.model = model;
        this.capacity = capacity;
        this.id = counterForId++;
        passengers = new Passenger[capacity];
        this.autoPilot = new AutoPilot("V.001-B");

    }



    public Bus(String model, int capacity, BusDriver driver) {
        this.driver = driver;
        this.model = model;
        this.capacity = capacity;
        this.id = counterForId++;
        passengers = new Passenger[capacity];
        this.autoPilot = new AutoPilot("V.001-B");
    }

    public boolean takePassenger(Passenger passenger) {
        // проверка Если пассажир имеет билет (не важно в каком автобусе), не пускаем его в автобус.
        if (passenger.getTicketNumber() != null) return false;

        if (amountPassenger < capacity) {
            // Done - выдать билет изменить кол-во пассажиров в автобусе
            passenger.setTicketNumber(generateTicketNumber(passenger.getId()));
            passengers[amountPassenger++] = passenger;

            return true;
        }
        return false;
    }

    public boolean droopPassenger(Passenger passenger) {
        int indexPassenger = isPassengerInBus(passenger.getId());
        if (indexPassenger >= 0) {
//            passengers[indexPassenger] = null;
            for (int i = indexPassenger; i < amountPassenger - 1; i++) {
                passengers[i] = passengers[i + 1];
            }

            passengers[amountPassenger - 1] = null;
            passenger.setTicketNumber(null);
            amountPassenger--;

            return true;
        }

        return false;
    }

    private int isPassengerInBus(int idPass) {
        for (int i = 0; i < amountPassenger; i++) {
            if (passengers[i].getId() == idPass) {
                return i;
            }

        }
        return -1;
    }

    private String generateTicketNumber(int passengerId) {
        return "B" + id + "-" + passengerId + String.format("%05d", ++ticketCounter);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{Bus id: ").append(id).append("; model: ").append(model).append("; ");
        sb.append("capacity: ").append(capacity).append("; ");
        sb.append(" Dribver: ");
        sb.append((driver == null ? "absent" : driver.toString())).append("; ");
        sb.append("Passengers: ");
        sb.append(getStringPassengerList());
        sb.append("; AP" + autoPilot);
        sb.append("}");
        return sb.toString();
    }

    private String getStringPassengerList() {
        StringBuilder sb = new StringBuilder("{");
        for (Passenger passenger : passengers) {
            if (passenger != null) {
                sb.append(passenger).append("; ");
            }
        }
        // Если в sb есть хоть один пассажир -> изменить длину (отрезать два последних символа)
        if (sb.length() > 1) {
            sb.setLength(sb.length() - 2);
        }
        sb.append("}");
        return sb.toString();
    }

    public int getId() {
        return id;
    }

    public String getModel() {
        return model;
    }


    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public int getCapacity() {
        return capacity;
    }

    public BusDriver getDriver() {
        return driver;
    }

    public void setDriver(BusDriver driver) {
        //System.out.println(driver.getName());
        this.driver = driver;
    }

    public Passenger[] getPassengers() {
        return passengers;
    }

    public int getAmountPassenger() {
        return amountPassenger;
    }
}
