package lesson_36_2023_10_24;

import java.util.Arrays;
import java.util.Comparator;

// Created by Volodymyr Sh on 25.10.2023
// project name: AIT_Lessons
public class CarsApp {
    public static void main(String[] args) {
        Car[] cars = new Car[5];
        cars[0] = new Car("Alfa", 2021, 120);
        cars[1] = new Car("BMW", 2000, 190);
        cars[2] = new Car("Citroen", 2018, 190);
        cars[3] = new Car("Dodge", 2023, 205);
        cars[4] = new Car("Ferrari", 2021, 300);

        System.out.println(Arrays.toString(cars));


        int[] ints = new int[]{9, 5, 1, 2, 4, 3, 0};
        System.out.println(Arrays.toString(ints));

        Arrays.sort(ints);
        System.out.println(Arrays.toString(ints));

        Arrays.sort(cars);
        System.out.println(Arrays.toString(cars));

        CarYearComparator carYearComparator = new CarYearComparator();

        Arrays.sort(cars, carYearComparator);
        System.out.println(Arrays.toString(cars));

        CarSpeedComparator carSpeedComparator = new CarSpeedComparator();
        Arrays.sort(cars, carSpeedComparator);
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, new Comparator<Car>() {
            @Override
            public int compare(Car car1, Car car2){
                return car1.getModel().compareTo(car2.getModel());
            }
        });

        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> car1.getModel().compareTo(car2.getModel())); //Option 1
//        Arrays.sort(cars, Comparator.comparing(Car::getModel)); //Option 2

//        Arrays.sort(cars, (car1, car2) -> car1.getYear() - car2.getYear());
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> {
//            int yarCompare = car1.getYear() - car2.getYear(); // Option 1
            int yarCompare = Integer.compare(car1.getYear(), car2.getYear()); // Option 2
            if (yarCompare == 0) {
               return car2.getModel().compareTo(car1.getModel());
           }else {
               return yarCompare;
           }
        });
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> car2.getMaxSpeed() - car1.getMaxSpeed());
        System.out.println(Arrays.toString(cars));

        Arrays.sort(cars, (car1, car2) -> {
            int sortSpeed = (car2.getMaxSpeed() - car1.getMaxSpeed());
            if  ( sortSpeed== 0) {
                return car1.getYear() - car2.getYear();
            } else {
                return sortSpeed;
            }
        });
        System.out.println(Arrays.toString(cars));

        Comparator<Car> yearComparator = (car1, car2) -> Integer.compare(car1.getYear(), car2.getYear());
        Arrays.sort(cars, yearComparator);

        Comparator<Car> speedYearComparator = Comparator
                .comparing(Car::getMaxSpeed)
                .thenComparing(Car::getYear).reversed();



        Arrays.sort(cars, speedYearComparator);
        System.out.println(Arrays.toString(cars));


        Comparator<Car> yearMaxSpeedComparator = Comparator
                .comparing(Car::getYear).reversed()
                .thenComparing(Car::getMaxSpeed).reversed();
        Arrays.sort(cars, yearMaxSpeedComparator);
        System.out.println(Arrays.toString(cars));


        //Вот так будет более правильно. Применить реверс к конкретному компаратору
//        Comparator<Car> comparator = Comparator.comparing(Car::getYear)
//                .thenComparing(Comparator.comparing(Car::getMaxSpeed).reversed());
//
//        Arrays.sort(cars, comparator);
//        System.out.println(Arrays.toString(cars));


    }
}
