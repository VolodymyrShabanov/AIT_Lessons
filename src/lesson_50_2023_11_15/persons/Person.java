package lesson_50_2023_11_15.persons;

/**
 * Created by Volodymyr Sh on 15.11.2023
 * project name: AIT_Lessons
 */
public class Person {
    private String email;
    private String password;

    public Person(String email, String password) {
        setEmail(email);
        setPassword(password);
    }

    @Override
    public String toString() {
        return "Person{" +
                "email='" + email + '\'' +
                '}';
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        try {
            EmailValidator.validate(email);
            System.out.println("Email -> is correct!");
            this.email = email;
        } catch (EmailValidateException e) {
            System.err.println("Email -> not correct!");
            e.printStackTrace();
        }
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
