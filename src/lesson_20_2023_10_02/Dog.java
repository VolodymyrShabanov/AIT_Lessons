package lesson_20_2023_10_02;

public class Dog {
    private String name;
    private int jumpHeight;
    private int maxJumpHeight;
    private int increesePerOneTraining;


    public Dog(String name, int jumpHeight) {
        this.name = name;
        this.jumpHeight = jumpHeight;
        this.increesePerOneTraining = 10;
        this.maxJumpHeight = jumpHeight * 2;
    }

    public String getName() {
        return name;
    }

    public int getJumpHeight() {
        return jumpHeight;
    }

    public void jump() {
        System.out.println(name + " прыгнула!");
    }

    public void train() {

        if (jumpHeight < maxJumpHeight) {
            jumpHeight += increesePerOneTraining;
        }

        if (jumpHeight > maxJumpHeight) {
            jumpHeight = maxJumpHeight;
        }
    }

    public boolean takeBarrier(int barrier) {
        if (jumpHeight >= barrier) {
            jump();
            return true;
        }

        if (maxJumpHeight >= barrier) {
            System.out.println(name + " идет тренироваться.");
            while (jumpHeight < barrier) {
                train();
            }
            jump();
            System.out.printf("Собака %s перепрыгивает барьер: %d\n!", name, barrier);
            System.out.println("Текущий прыжок: " + jumpHeight);

            return true;

        } else {
            System.out.printf("Барьер высотой %d собака %s взять не может\n!", barrier, name);
            System.out.println("Текущий прыжок: " + jumpHeight);
            return false;
        }

    }

    public String toString() {
        return "Dog " + name + "; current jump: " + jumpHeight;
    }

}
