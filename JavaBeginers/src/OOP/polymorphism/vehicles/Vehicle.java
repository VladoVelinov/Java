package OOP.polymorphism.vehicles;

public abstract class Vehicle {
    protected double fuelQuantity;
    protected double fuelConsumption;
    protected double tankCapacity;

    public Vehicle(double fuelQuantity, double fuelConsumption) throws IllegalArgumentException {

        if (fuelQuantity < 0)
            throw new IllegalArgumentException("Fuel must be a positive number");

        this.fuelQuantity = fuelQuantity;
        this.fuelConsumption = fuelConsumption;
    }

    public Vehicle(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        this(fuelQuantity, fuelConsumption);

        if (tankCapacity < fuelQuantity)
            throw new IllegalArgumentException("Cannot fit fuel in tank");

        this.tankCapacity = tankCapacity;
    }

    public String drive(double distance) {
        String className = this.getClass().getSimpleName();
        double consumed = distance * this.fuelConsumption;

        if (consumed > fuelQuantity) {
            return className + " needs refueling";
        }

        fuelQuantity -= consumed;

        return className + " travelled " + distance + "km!";
    }

    public String refuel(double amount) {
        double afterRefuel = this.fuelQuantity + amount;
        String className = this.getClass().getSimpleName();

        if (afterRefuel <= 0)
            return "Fuel must be a positive number";

        if (afterRefuel > this.tankCapacity)
            return "Cannot fit fuel in tank";

        this.fuelQuantity = afterRefuel;

        return className + " refueled " + amount + "l!";
    }

    @Override
    public String toString() {
        String className = this.getClass().getSimpleName();
        return String.format("%s: %f", className, this.fuelQuantity);
    }
}