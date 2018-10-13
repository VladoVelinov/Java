package FinalExam.Problem4;

public class Car extends Vehicle {
    public Car(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption += 0.9;
    }

    @Override
    public String refuel(double amount) {
        return super.refuel((double) Math.round(amount * 100) / 100);
    }
}