package lesson_20_2023_10_02;

public class Cat {
    private String name = "Tim";
    private int age;
    private int weight;

    public Cat(String name, int age, int weight) {
//        this.name = name;
//        this.age = age;
//        this.weight = weight;
        setName(name);
        //if (this.name == null || this.name.isEmpty()) this.name = "Tim";
        setAge(age);
        setWeight(weight);
    }

    void sayMeow() {
        System.out.println("Meow!");
    }

    public String getName() {
        return name;
    }

    protected int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String newName) {
        if (newName != null && !newName.isEmpty()) {
            this.name = newName;
        }
    }

    public void setAge(int newAge) {
        if (newAge >= 0 && newAge <=20) {
            this.age = newAge;
        }
    }

    public void setWeight(int newWeight) {
        if (newWeight >=0 && newWeight <= 50) {
            this.weight = newWeight;
        }
    }

}
