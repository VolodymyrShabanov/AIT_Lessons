package lesson_43_2023_11_03_practice.enums;

/**
 * Created by Volodymyr Sh on 03.11.2023
 * project name: AIT_Lessons
 */
public enum Size {
    S ("46-48", "36-38"),
    M ("48-50", "38-40"),
    L ("50-52", "40-42"),
    XL("52-54", "42-44");

    private final String europe;
    private final String usa;

     Size(String europe, String usa) {
        this.europe = europe;
        this.usa = usa;
    }

    public String getEurope() {
        return europe;
    }

    public String getUsa() {
        return usa;
    }
}
