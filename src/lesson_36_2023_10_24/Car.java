package lesson_36_2023_10_24;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_Lessons
public class Car implements Comparable<Car> {
    private String model;
    private int year;
    private int maxSpeed;

    public Car(String model, int year, int maxSpeed) {
        this.model = model;
        this.year = year;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public int compareTo(Car car) {
        return this.model.compareTo(car.getModel());
        //return this.year - car.getYear();
    }

    @Override
    public String toString() {
        return "\nCar{" +
                "model='" + model + '\'' +
                ", year=" + year +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
