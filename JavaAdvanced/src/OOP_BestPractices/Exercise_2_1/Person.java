package OOP_BestPractices.Exercise_2_1;

public class Person {
    private String id;
    private String firstName;
    private String familyName;

    public String personalDetails() {

        return String.format("Person: ID=%s Name: %s %s", id, firstName, familyName);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFamilyName() {
        return familyName;
    }

    public void setFamilyName(String familyName) {
        this.familyName = familyName;
    }
}
