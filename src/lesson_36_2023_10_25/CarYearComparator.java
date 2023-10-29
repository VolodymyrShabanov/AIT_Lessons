package lesson_36_2023_10_25;

import java.util.Comparator;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_Lessons
public class CarYearComparator implements Comparator<Car> {
    @Override
    public int compare(Car car1, Car car2) {
        return car1.getYear() - car2.getYear();
    }
}
