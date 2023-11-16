package lesson_50_2023_11_15.persons;

/**
 * Created by Volodymyr Sh on 15.11.2023
 * project name: AIT_Lessons
 */
public class EmailValidateException extends Exception {

    public EmailValidateException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Email validate exception | " + super.getMessage();
    }
}
