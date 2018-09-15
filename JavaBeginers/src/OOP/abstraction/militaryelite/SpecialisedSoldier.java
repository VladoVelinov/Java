package OOP.abstraction.militaryelite;

import OOP.abstraction.militaryelite.enums.SoldierCorpEnum;

public class SpecialisedSoldier extends Private {
    private SoldierCorpEnum soldiersCorps;

    public SpecialisedSoldier(String[] tokens) {
        super(tokens);
        if (tokens[5].equals(SoldierCorpEnum.Airforces.toString()))
            this.soldiersCorps = SoldierCorpEnum.Airforces;
        else if (tokens[5].equals(SoldierCorpEnum.Marines.toString()))
            this.soldiersCorps = SoldierCorpEnum.Marines;
        else
            throw new IllegalArgumentException();
    }

    @Override
    public String toString() {
        String res = super.toString() +
                String.format("Corps: %s%n", this.soldiersCorps.toString());

        return res;
    }
}