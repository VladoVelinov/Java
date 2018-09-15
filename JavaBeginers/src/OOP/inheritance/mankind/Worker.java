package OOP.inheritance.mankind;

public class Worker extends Human {
    private double salary;
    private int hoursWorked;

    public Worker(String firstName, String lastName,
                  double salary, int hoursWorked) {
        super(firstName, lastName);
        this.setSalary(salary);
        this.hoursWorked = hoursWorked;
    }

    public double calculatePaymentPerHour() {
        double paymentPerHour = salary / hoursWorked;
        return paymentPerHour;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        try {
            if (salary > 0)
                this.salary = salary;
        }catch(IllegalArgumentException e){
            System.out.println("Salary cannot be negative number!");
        }
    }

    public int getHoursWorked() {
        return hoursWorked;
    }

    public void setHoursWorked(int hoursWorked) {
        this.hoursWorked = hoursWorked;
    }
}