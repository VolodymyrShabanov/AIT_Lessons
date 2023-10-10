package lesson_24_2023_10_09.person;

public class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void went () {
        System.out.println("Person name: " + name + " went.");
    }

    public void stopped () {
        System.out.println("Person name: " + name + " stopped.");
    }
    public void info () {
        System.out.println("Person name: " + name + "; age: " + age + " years.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
