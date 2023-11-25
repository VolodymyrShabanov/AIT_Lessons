package lesson_54_2023_11_22;

import java.util.List;

/**
 * Created by Volodymyr Sh on 22.11.2023
 * project name: AIT_Lessons
 */
public class Shop {
    private String title;
    private List<String> products;

    public Shop(String title, List<String> products) {
        this.title = title;
        this.products = products;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "title='" + title + '\'' +
                ", products=" + products +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public List<String> getProducts() {
        return products;
    }
}
