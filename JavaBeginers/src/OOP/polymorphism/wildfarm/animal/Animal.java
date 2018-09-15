package OOP.polymorphism.wildfarm.animal;

import OOP.polymorphism.wildfarm.food.Food;

public abstract class Animal {
    protected String animalName;
    protected String animalType;
    protected double animalWeigth;
    protected int foodEaten;

    public abstract void makeSound();
    public abstract void eat(Food food);
}