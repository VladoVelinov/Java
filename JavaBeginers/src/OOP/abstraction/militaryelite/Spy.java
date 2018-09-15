package OOP.abstraction.militaryelite;

public class Spy extends Soldier{
    private String codeNumber;

    public Spy(String[] tokens) {
        super(tokens);
        this.codeNumber = tokens[4];
    }

    @Override
    public String toString() {
        return String.format("Name: %s %s Id: %s %n Code Number: %s",
                this.firstName, this.lastName, this.id, this.codeNumber);
    }
}