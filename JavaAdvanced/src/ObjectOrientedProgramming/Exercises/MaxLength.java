package ObjectOrientedProgramming.Exercises;

import java.util.ArrayList;

public class MaxLength {
    public static void main(String[] args) {
        ArrayList<String> myList = new ArrayList<>();
        myList.add("dog");
        myList.add("tree");
        myList.add("power");
        myList.add("Thunder");
        System.out.println(maxLength(myList));
    }

    private static int maxLength(ArrayList<String> string) {
        int maxLength = 0;

        for (String aString : string) {
            int currLength = aString.length();
            if (currLength > maxLength)
                maxLength = currLength;
        }
        return maxLength;
    }
}