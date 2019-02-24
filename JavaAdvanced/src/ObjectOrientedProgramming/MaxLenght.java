package ObjectOrientedProgramming;

import java.util.ArrayList;

public class MaxLenght {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("dog");
        myList.add("tree");
        myList.add("power");
        myList.add("Thunder");
        System.out.println(maxLength(myList));
    }
    private static int maxLength (ArrayList<String> string){
        int maxLenght=0;
        for (String aString :string ){
            int currLenght=aString.length();
            if (currLenght>maxLenght)
            maxLenght=currLenght;
        }
        return maxLenght;
    }
}