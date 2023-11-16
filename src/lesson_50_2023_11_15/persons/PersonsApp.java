package lesson_50_2023_11_15.persons;

/**
 * Created by Volodymyr Sh on 15.11.2023
 * project name: AIT_Lessons
 */
public class PersonsApp {
    public static void main(String[] args) {
        Person person = new Person("john@email.com", "qwerty");
        System.out.println(person);

        Person person1 = new Person("john-email.com", "qwerty");
        System.out.println(person1);

        Person person2 = new Person("john@ema%il.com", "qwerty");
        System.out.println(person2);
    }
}
