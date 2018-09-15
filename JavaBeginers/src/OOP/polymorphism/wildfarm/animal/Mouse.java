package OOP.polymorphism.wildfarm.animal;

import OOP.polymorphism.wildfarm.food.Food;
import OOP.polymorphism.wildfarm.food.Meat;

public class Mouse extends Mammal{
    private final String MOUSE_SOUND = "SQUEEEAAAK!";

    public Mouse(String animalType, String animalName,
                 double animalWeigth, String animalLivingRegion) {
        super(animalType, animalName, animalWeigth, animalLivingRegion);
    }

    @Override
    public void makeSound() {
        System.out.println(MOUSE_SOUND);
    }

    @Override
    public void eat(Food food) {
        makeSound();

        if(food instanceof Meat){
            System.out.println(this.animalType + " are not eating that type of food! ");
            return;
        }

        this.foodEaten += food.getQuantity();
    }
}