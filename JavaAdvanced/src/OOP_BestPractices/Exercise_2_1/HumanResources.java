package OOP_BestPractices.Exercise_2_1;

import java.util.ArrayList;

public class HumanResources {
    private int currentId;
    private ArrayList<Person> personnel;

    HumanResources() {
        currentId = 1;
        personnel = new ArrayList<>();
    }

    void addPerson(Person p) {
        p.setId(Integer.toString(currentId++));
        personnel.add(p);
    }

    public void removePerson(Person p) {
        personnel.remove(p);
    }

    void generateReport() {
        for (Person p : personnel) {
            System.out.println(p.personalDetails());
        }
    }
}