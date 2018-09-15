package OOP.inheritance.mankind;

public class Student extends Human implements Comparable<Student> {
    private double grade;

    public Student(String firstName, String lastName, double grade) {
        super(firstName, lastName);
        this.setGrade(grade);
    }

    public double getGrade() {
        return this.grade;
    }

    public void setGrade(double grade) {
        try {
            if (grade > 2.0 || grade < 6.0)
                this.grade = grade;
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid input!");
        }
    }

    @Override
    public String toString() {
        String str = firstName + " " + lastName + " " + grade;
        return str;
    }

    @Override
    public int compareTo(Student st) {
        if (grade == st.grade)
            return 0;
        else if (grade > st.grade)
            return 1;
        else
            return -1;
    }
}