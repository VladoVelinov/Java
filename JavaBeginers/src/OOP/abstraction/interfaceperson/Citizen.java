package OOP.abstraction.interfaceperson;


import OOP.abstraction.foodshortage.Buyer;
import OOP.abstraction.multipleimplementation.Birthable;
import OOP.abstraction.multipleimplementation.Identifiable;

public class Citizen implements Identifiable, Birthable, Buyer {
    private int age;
    private String name;
    private String id;
    private String birthdate;
    private int foodAmount;

    public Citizen(String name, int age) {
        this.age = age;
        this.name = name;
    }

    public Citizen(String name, int age, String id) {
        this.age = age;
        this.name = name;
        this.id = id;
    }

    public Citizen(String name, int age, String id, String birthdate) {
        this.age = age;
        this.name = name;
        this.id = id;
        this.birthdate = birthdate;
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
    public String getBirthDate() {
        return this.birthdate;
    }

    @Override
    public String getId() {
        return this.id;
    }

    @Override
    public int buyFood() {
        this.foodAmount += 10;

        return 10;
    }

    @Override
    public int getFood() {
        return this.foodAmount;
    }
}