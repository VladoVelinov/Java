package OOP_BestPractices.Exercise_2_1;

public class Worker extends Person {
    private double dailyWage;
    private double workHours;

    Worker(String id, String firstName, String lastName, double dailyWage, double workHours) {
        super(id, firstName, lastName);
        this.dailyWage = dailyWage;
        this.workHours = workHours;
    }

    public double getDailyWage() {
        return dailyWage;
    }

    public void setDailyWage(double dailyWage) {
        this.dailyWage = dailyWage;
    }

    public double getWorkWours() {
        return workHours;
    }

    public void setWorkWours(double workHours) {
        this.workHours = workHours;
    }

    private double wagePerHour() {
        return dailyWage / workHours;
    }

    @Override
    public String personalDetails() {
        return String.format("Worker: Id=%s, Name=%s %s, Wage=%.2f, Hours=%.2f, Hour Pay=%.2f",
                getId(), getFirstName(), getLastName(), dailyWage, workHours, wagePerHour());
    }
}