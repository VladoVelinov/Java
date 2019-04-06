package ObjectOrientedProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

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
            int occurrences = counts.get(key);
            if (occurrences > maxOccurrences) {
                maxOccurrences = occurrences;
            }
        }
        return maxOccurrences;
    }
}