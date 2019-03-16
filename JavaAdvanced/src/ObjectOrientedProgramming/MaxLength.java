/*
Exercise 1.6:
Write a method maxLength that takes an ArrayList of Strings as a parameter and that returns the length of the longest
string in the list. If your method is passed an empty list, it should return 0.
Made by Vladislav Velinov.
*/
package ObjectOrientedProgramming;

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