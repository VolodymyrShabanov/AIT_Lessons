package lesson_24_2023_10_09.lesson;

public class InternationalBus extends Bus{
    private String[] countries;

    private int millage;

    public InternationalBus(String model, int yearOfMan, int capacity, String[] countries) {
        super(model, yearOfMan, capacity);
        this.countries = countries;
    }
    public InternationalBus(String model, int yearOfMan, int capacity, String countries) {
        super(model, yearOfMan, capacity);
        this.countries = new String[0];
    }

    public String[] getCountries() {
        return countries;
    }

    public void setCountries(String[] countries) {
        this.countries = countries;
    }


    public void goToRoute (int millage) {
        System.out.println(getModel() + " отправляется по маршруту");
//        start();
        start("Italy");
        this.millage += millage;
        // какой-то код.
        // Посещение стран, стоянка, заправка.....
        stop();
    }


    public void start(String country) {
        System.out.println("Выезжаем из страны - " + country);
    }

    public int getMillage() {
        return millage;
    }
}
