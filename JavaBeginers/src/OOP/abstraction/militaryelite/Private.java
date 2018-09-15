package OOP.abstraction.militaryelite;

public class Private extends Soldier implements Comparable<Private>{
    private double salary;

    public Private(String[] tokens) {
        super(tokens);
        this.salary = Double.parseDouble(tokens[4]);
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s Salary: %.2f%n",
                firstName, lastName, id, salary);
    }

    @Override
    public int compareTo(Private pr) {
        int idFirst = Integer.parseInt(this.id);
        int idSecond = Integer.parseInt(pr.id);

        if(idFirst==idSecond)
            return 0;
        else if(idFirst>idSecond)
            return 1;
        else
            return -1;
    }
}