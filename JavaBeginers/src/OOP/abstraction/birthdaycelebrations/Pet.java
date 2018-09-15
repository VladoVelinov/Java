package OOP.abstraction.birthdaycelebrations;

import OOP.abstraction.multipleimplementation.Birthable;

public class Pet implements Birthable {

    private String birthDate;
    private String name;

    public Pet(String name, String birthDate) {
        this.birthDate = birthDate;
        this.name = name;
    }

    @Override
    public String getBirthDate() {
        return this.birthDate;
    }
}