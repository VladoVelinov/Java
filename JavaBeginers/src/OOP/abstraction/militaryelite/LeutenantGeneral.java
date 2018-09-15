package OOP.abstraction.militaryelite;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class LeutenantGeneral extends Private {
    private ArrayList<Private> privates = new ArrayList<>();

    public LeutenantGeneral(String[] tokens, ArrayList<Private> createdPrivates) {
        super(tokens);

        for (int i = 5; i < tokens.length ; i++) {
            for(Private privat : createdPrivates){
                if(tokens[i].equals(privat.id)){
                    if(!this.privates.contains(privat)) {
                        this.privates.add(privat);
                    }
                }
            }
        }

        Collections.sort(privates);
        Collections.reverse(privates);
    }

    @Override
    public String toString() {
        String res = super.toString() + String.format("Privates:%n");

        for (Private privat : privates){
            res += privat.toString();
        }

        return res;
    }
}