package lesson_29_2023_10_16.flyable;

public abstract class Transport {
    int capacity;

    public Transport(int capacity) {
        this.capacity = capacity;
    }

    abstract void takePassengers();

    public int countPassengers(){
        return capacity;
    }

}
