package OOP.abstraction.Ferrari;

public class Lada implements Car {
    private final String MODEL_NAME = "NIVA";
    private String driverName;
    private final String BREAK_MESSAGE = "Nema takova";
    private final String GAS_MESSAGE = "Golfu pak ni izprevari!!";

    public Lada(String driverName) {
        this.driverName = driverName;
    }

    @Override
    public void useBreaks() {
        System.out.println(BREAK_MESSAGE);
    }

    @Override
    public void useGasPedal() {
        System.out.println(GAS_MESSAGE);
    }

    @Override
    public String getModel() {
        return this.MODEL_NAME;
    }

    @Override
    public String getDriversName() {
        return this.driverName;
    }

    @Override
    public String toString() {
        return String.format("%s/%s/%s/%s", this.MODEL_NAME, this.BREAK_MESSAGE, this.GAS_MESSAGE, this.driverName);
    }
}