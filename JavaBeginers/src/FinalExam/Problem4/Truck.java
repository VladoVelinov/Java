package FinalExam.Problem4;

public class Truck extends Vehicle {
    public Truck(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
        this.fuelConsumption += 1.6;
    }

    @Override
    public String refuel(double amount) {
        amount *= 0.95;
        return super.refuel((double) Math.round(amount * 100) / 100);
    }
}