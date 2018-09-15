package OOP.polymorphism.vehicles;

public class Car extends Vehicle{
    public Car(double fuelQuantity, double fuelConsumption){
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption += 0.9;
    }

    public Car(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.fuelConsumption += 0.9;
    }
}