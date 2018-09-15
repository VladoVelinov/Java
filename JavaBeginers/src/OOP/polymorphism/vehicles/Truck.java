package OOP.polymorphism.vehicles;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption += 1.6;
    }

    public Truck(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
        this.fuelConsumption += 1.6;
    }

    @Override
    public String refuel(double amount) {
        amount *= 0.95;
        return super.refuel(amount);
    }
}