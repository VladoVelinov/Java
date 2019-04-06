package OOP_BestPractices.Exercise_2_1;

public class Person {
    private String id;
    private String firstName;
    private String lastName;

    Person(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String personalDetails() {
        return String.format("Person: Id=%s Name=%s %s", id, firstName, lastName);
    }

    String getId() {
        return id;
    }

    void setId(String id) {
        this.id = id;
    }

    String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
