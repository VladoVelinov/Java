package OOP.polymorphism.wildfarm.animal;

import OOP.polymorphism.wildfarm.MakeSound;
import OOP.polymorphism.wildfarm.food.Food;
import OOP.polymorphism.wildfarm.food.Vegetable;

public class Tiger extends Felime {
    private final String TIGER_SOUND = "ROARR!!!";

    public Tiger(String animalType, String animalName, double animalWeigth, String animalLivingRegion) {
        super(animalType, animalName, animalWeigth, animalLivingRegion);
    }

    @Override
    public void makeSound() {
        MakeSound ms = new MakeSound();
        ms.playSound("Tiger.wav");
    }

    @Override
    public void eat(Food food) {
        makeSound();

        if(food instanceof Vegetable){
            System.out.println(this.animalType + " are not eating that type of food! ");
            return;
        }

        this.foodEaten += food.getQuantity();
    }
}