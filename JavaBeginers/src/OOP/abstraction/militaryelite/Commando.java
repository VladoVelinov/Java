package OOP.abstraction.militaryelite;

import java.util.ArrayList;

public class Commando extends SpecialisedSoldier{
    private ArrayList<Mission> missions = new ArrayList<>();

    public Commando(String[] tokens) {
        super(tokens);

        for (int i = 6; i < tokens.length; i += 2) {
            try {
                Mission mission = new Mission(tokens[i], tokens[i+1]);
                missions.add(mission);
            }catch (IllegalArgumentException iae){
                //do nothing
            }
        }
    }

    public void CompleteMission(){}

    @Override
    public String toString() {
        String res = super.toString() + String.format("Missions:%n");

        for (Mission mission : missions){
            res += mission.toString();
        }

        return res;
    }
}