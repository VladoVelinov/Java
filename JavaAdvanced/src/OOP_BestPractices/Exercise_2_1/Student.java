package OOP_BestPractices.Exercise_2_1;

public class Student extends Person {
    private String grade;
//    public String personalDetails() {
//
//        return String.format("Person: ID=%s Name: %s %s Grade: %s", setId(getId()) grade);
//    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }
}
