package lesson_17_2023_09_27;

public class lesson_17_Cat {
    public static void main(String[] args) {

        System.out.println("Cat ===================================");

        Cat cat = new Cat(); // создаем объект класса Cat

        // при создании объекта класса все его поля инициализируются значениями по умолчанию.
        String catName = cat.name;
        System.out.println("Name: " + catName);
        System.out.println("Age:" + cat.age);
        System.out.println("Color: " + cat.color);
        cat.sayMeow(); // вызываем метод sayMeow у объекта
        cat.run();
        cat.sleep();

        System.out.println("\nCat_1 ===================================");
        // Создан новый объект класса
        // Имя (строка) которая была передана в конструктор
        // было присвоено полю name
        Cat cat1 = new Cat("Max");
        System.out.println("Name cat1: " + cat1.name);
        System.out.println("Age cat1: " + cat1.age);
        System.out.println("Color cat1: " + cat1.color);
        cat1.sayMeow();
        cat1.run();
        cat1.sleep();

        System.out.println("\nCat_2 ===================================");
        Cat cat2 = new Cat("Boris", "red");
        System.out.println("Name cat2: " + cat2.name);
        System.out.println("Age cat2: " + cat2.age);
        System.out.println("Color cat2: " + cat2.color);
        cat2.sayMeow();
        cat2.run();
        cat2.sleep();
        cat2.whoAmI();

        System.out.println("\nCat_3 ===================================");

        Cat cat3 = new Cat("Barsik", "white", 4);


        System.out.println("Name cat3: " + cat3.name);
        System.out.println("Age cat3: " + cat3.age);
        System.out.println("Color cat3: " + cat3.color);
        cat3.sayMeow();
        cat3.run();
        cat3.sleep();
        cat3.whoAmI();




    }
}
