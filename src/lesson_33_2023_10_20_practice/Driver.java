package lesson_33_2023_10_20_practice;

public class Driver {
    private String name;

    private Bus bus;

    public Driver(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void goToBus(Bus bus){
        this.free();
        this.bus = bus;
        bus.setDriver(this); // передали информацию в автобус, что в него сел наш водитель
    }

    private void free() {
        if (bus != null) {
            System.out.println("Водитель " + name + " освобождает автобус " + bus.getNumber());
            this.bus.freeDriver();
        }
        this.bus = null;

    }

}
