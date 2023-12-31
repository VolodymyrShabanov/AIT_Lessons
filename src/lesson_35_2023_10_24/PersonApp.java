package lesson_35_2023_10_24;

// Created by Volodymyr Sh on 23.10.2023
// project name: AIT_Lessons
public class PersonApp {
    public static void main(String[] args) {
        Person person = new Person("email", "password");
        System.out.println(person);

        String test = "0123@567/.89";
        System.out.println(test.indexOf('@'));
        System.out.println(test.lastIndexOf('@'));
        System.out.println(test.indexOf('1'));
        System.out.println(test.indexOf('1', 4));

        System.out.println(person);
        person.setEmail("as_d@fff.ff");
        System.out.println(person);
        System.out.println("===== validPassword ===========================");

        String validPassword = "asdf3%AS";
        System.out.println("Previous pass: " + person.getPassword());
        person.setPassword(validPassword);
        System.out.println("current pass: " + person.getPassword());


        System.out.println("===== inValidPassword ===========================");
        String inValidPassword = "asdf3%A";
        System.out.println("Previous pass: " + person.getPassword());
        person.setPassword(inValidPassword);
        System.out.println("current pass: " + person.getPassword());

    }
}
