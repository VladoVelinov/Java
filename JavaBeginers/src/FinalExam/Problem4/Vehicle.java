package FinalExam.Problem4;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;

    public Vehicle(double fuelQuantity, double fuelConsumption) throws IllegalArgumentException {

        if (fuelQuantity < 0)
            throw new IllegalArgumentException("Fuel must be a positive number");

        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public String drive(double distance) {
        String className = this.getClass().getSimpleName();
        double consumed = distance * this.fuelConsumption;

        if (consumed > fuelQuantity) {
            return className + " needs refueling";
        }

        fuelQuantity -= consumed;

        return className + " travelled " + distance + " km";
    }

    public String refuel(double amount) {
        double afterRefuel = this.fuelQuantity + amount;
        String className = this.getClass().getSimpleName();

        if (afterRefuel <= 0)
            return "Fuel must be a positive number";

        this.fuelQuantity = afterRefuel;

        return className + " refueled " + amount + "0";
    }

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return String.format("%s: %.2f", className, this.fuelQuantity);
    }
}