package OOP.polymorphism.vehicles;

public class Bus extends Vehicle {

    private boolean isEmpty;

    public Bus(double fuelQuantity, double fuelConsumption) {
        super(fuelQuantity, fuelConsumption);
    }

    public Bus(double fuelQuantity, double fuelConsumption, double tankCapacity) {
        super(fuelQuantity, fuelConsumption, tankCapacity);
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }

    @Override
    public String drive(double distance) {
        if (!isEmpty)
            this.fuelConsumption += 1.4;

        String res = super.drive(distance);

        if (!isEmpty)
            this.fuelConsumption -= 1.4;

        return res;
    }
}