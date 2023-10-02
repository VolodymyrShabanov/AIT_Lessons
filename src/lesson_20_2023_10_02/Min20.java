package lesson_20_2023_10_02;

public class Min20 {
    public static void main(String[] args) {

        Cat cat = new Cat ("", 4, 10);

//        cat.name = "Hello";
//        cat.age = 100;
//        cat.weight = -10;

//        cat.setName("Boris");
        cat.setAge(100);
        cat.setAge(5);
        cat.setWeight(34);


        System.out.println("Name: " + cat.getName());
        System.out.println("Age: " + cat.getAge());
        System.out.println("Weight: " + cat.getWeight());

        cat.sayMeow();




    }


}
