package OOP.polymorphism.wildfarm.animal;

import OOP.polymorphism.wildfarm.MakeSound;
import OOP.polymorphism.wildfarm.food.Food;

public class Cat extends Felime{
    private final String CAT_SOUND = "Meowwww";

    protected String breed;

    public Cat(String animalType, String animalName,
               double animalWeigth, String animalLivingRegion,
               String breed) {
        super(animalType, animalName, animalWeigth, animalLivingRegion);
        this.breed = breed;
    }

    @Override
    public void makeSound() {
        MakeSound ms = new MakeSound();
        ms.playSound("Cat.wav");
    }

    @Override
    public void eat(Food food) {
        makeSound();
        this.foodEaten += food.getQuantity();
    }

    @Override
    public String toString(){
        return String.format("%s[%s, %s, %.2f, %s, %d]",
                this.animalType, this.animalName,
                this.breed, this.animalWeigth,
                this.livingRegion, this.foodEaten);
    }
}