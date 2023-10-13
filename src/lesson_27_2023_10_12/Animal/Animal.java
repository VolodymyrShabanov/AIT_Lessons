package lesson_27_2023_10_12.Animal;

abstract class Animal {
    // Абстрактный метод не имеет реализации (тела метода)
    abstract void move();
    abstract void eat();

    // в абстрактном классе могут присутствовать обычные методы
    public void sayHello() {
        System.out.println("Hello from animal");
    }




}
