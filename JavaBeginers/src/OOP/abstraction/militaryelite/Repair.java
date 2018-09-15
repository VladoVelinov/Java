package OOP.abstraction.militaryelite;

public class Repair {
    private String partName;
    private int hoursWorked;

    public Repair(String partName, String hoursWorked) {
        this.partName = partName;
        this.hoursWorked = Integer.parseInt(hoursWorked);
    }

    @Override
    public String toString() {
        return String.format("Part Name: %s Hours Worked: %d%n",
                this.partName, this.hoursWorked);
    }
}