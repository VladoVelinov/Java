package OOP.polymorphism.wildfarm.animal;

public abstract class Mammal extends Animal{
    protected String livingRegion;

    public Mammal(String animalType, String animalName,
                  double animalWeigth, String animalLivingRegion){
        this.animalType = animalType;
        this.animalName = animalName;
        this.animalWeigth = animalWeigth;
        this.livingRegion = animalLivingRegion;
    }

    @Override
    public String toString(){
        return String.format("%s[%s, %.2f, %s, %d]",
                this.animalType,
                this.animalName, this.animalWeigth,
                this.livingRegion, this.foodEaten);
    }
}