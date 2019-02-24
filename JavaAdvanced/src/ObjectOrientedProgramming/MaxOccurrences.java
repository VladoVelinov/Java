/*
Exercise 1.9:
Write a method maxOccurrences that accepts a List of integers as a parameter and returns the number of times the most
frequently occurring integer (the "mode") occurs in the list. Solve this problem using a Map as auxiliary storage.
If the list is empty, return 0.
Made by Vladislav Velinov.
*/
package ObjectOrientedProgramming;

import java.util.*;

public class MaxOccurrences {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);
        myList.add(2);
        myList.add(3);
        myList.add(1);
        myList.add(5);
        myList.add(6);
        myList.add(7);
        myList.add(1);

        System.out.println(maxOccurrences(myList));
    }

    private static int maxOccurrences(List<Integer> myList) {
        HashMap<Integer, Integer> counts = new HashMap<>();
        int maxOccurrences = 0;
        for (int i : myList) {
            Integer count = counts.get(i);
            if (count == null) {
                counts.put(i, 1);
            } else {
                counts.put(i, ++count);

            }
        }

        for (int key : counts.keySet()) {
            int occurrencs = counts.get(key);
            if (occurrencs > maxOccurrences) {
                maxOccurrences = occurrencs;
            }
        }
        return maxOccurrences;
    }
}
