package OOP.abstraction.militaryelite;

public abstract class Soldier {
    protected String id;
    protected String firstName;
    protected String lastName;

    public Soldier(String[] tokens){
        this.id = tokens[1];
        this.firstName = tokens[2];
        this.lastName = tokens[3];
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

    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }


}