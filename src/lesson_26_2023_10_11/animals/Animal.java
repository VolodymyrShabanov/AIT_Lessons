package lesson_26_2023_10_11.animals;

public class Animal {

    private static int counter;

    public void sound(){
        System.out.println("Animal say Hello!");
    }

    public void sound (String string) {
        System.out.println("Animal say: " + string);
    }

    public Animal() {
        counter++;
    }
    public Animal(String str){
        counter++;
    }
    public static int getTotalAmount() {
        return counter;
    }



}
