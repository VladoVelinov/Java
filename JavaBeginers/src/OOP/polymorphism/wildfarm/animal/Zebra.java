package OOP.polymorphism.wildfarm.animal;

import OOP.polymorphism.wildfarm.food.Food;
import OOP.polymorphism.wildfarm.food.Meat;

public class Zebra extends Mammal{
    private final String ZEBRA_SOUND = "Zs";

    public Zebra(String animalType, String animalName, double animalWeigth, String animalLivingRegion) {
        super(animalType, animalName, animalWeigth, animalLivingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(ZEBRA_SOUND);
    }

    @Override
    public void eat(Food food) {
        makeSound();

        if(food instanceof Meat){
            System.out.println(this.animalType + "s are not eating that type of food! ");
            return;
        }

        this.foodEaten += food.getQuantity();
    }
}