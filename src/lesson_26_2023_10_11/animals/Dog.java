package lesson_26_2023_10_11.animals;

public class Dog extends Animal {

    String name = "Max";

    @Override
    public void sound() {
        System.out.println(name + " say Woof!");
    }

    @Override
    public void sound(String string) {
        System.out.println("Dog say: " + string);
    }

    public void sound(int amount) {
        sound(String.valueOf(amount));
    }

    public void jump() {
        System.out.println("Dog jumping!");
    }

    @Override
    public String toString() {
        return "{Dog: " + name + "}";
    }


    @Override
    public boolean equals(Object obj) {
        System.out.println("Equals Dog");
        if (this == obj) return true;
        if (obj instanceof Dog) {
            Dog temp = (Dog) obj;
            return this.name.equals(temp.name);
        }
        return false;
    }
}
