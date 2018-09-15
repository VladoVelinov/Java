package OOP.abstraction.foodshortage;

public class Rebel implements Buyer {
    private int foodAmount;
    private String group;
    private int age;
    private String name;

    public Rebel(String name, int age, String group) {
        this.group = group;
        this.name = name;
        this.age = age;
    }

    @Override
    public int getAge() {
        return this.age;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public int buyFood() {
        this.foodAmount += 5;
        return 5;
    }

    @Override
    public int getFood() {
        return this.foodAmount;
    }
}