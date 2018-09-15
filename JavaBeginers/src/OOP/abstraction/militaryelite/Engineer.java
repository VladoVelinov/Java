package OOP.abstraction.militaryelite;

import java.util.ArrayList;

public class Engineer extends SpecialisedSoldier{
    private ArrayList<Repair> repairs = new ArrayList<>();

    public Engineer(String[] tokens) {
        super(tokens);

        for (int i = 6; i < tokens.length; i += 2) {
            Repair repair = new Repair(tokens[i], tokens[i+1]);
            repairs.add(repair);
        }
    }

    @Override
    public String toString() {
        String res = super.toString() + String.format("Repairs:%n");

        for (Repair repair : repairs){
            res += repair.toString();
        }

        return res;
    }
}