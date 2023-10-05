package lesson_21_2023_10_04;

public class Car {

    static int countCar;
    private final String model;
    private int powerPS;

    public Car(String model, int powerPS) {
        this.model = model;
        this.powerPS = powerPS;
        countCar++;
    }

    public void info() {
        System.out.println("Car: " + model + "; power: " + powerPS + ". Всего выпущено машин: " +  countCar);
        getCountCar();
    }


    public static int getCountCar() {
        return countCar;
    }


    public static void main(String[] args) {
        Car car1 = new Car("BMW" , 200);

        Car car2 = new Car("Skoda" , 150);
        car1.info();
        car2.info();

        System.out.println("Всего создано автомобилей (статическая переменная): " + Car.countCar);
        System.out.println("Всего создано автомобилей (статический метод): " + Car.getCountCar());

//        car1.model = "Mercedes";

    }






}
