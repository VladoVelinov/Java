package ObjectOrientedProgramming.Exercises;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class CountCommon {
    public static void main(String[] args) {
        List<Integer> myList1 = Arrays.asList(3, 7, 3, -1, 2, 3, 7, 2, 15, 15);
        List<Integer> myList2 = Arrays.asList(-5, 15, 2, -1, 7, 15, 36);

        System.out.println(countCommon(myList1, myList2));
    }

    private static int countCommon(List<Integer> myList1, List<Integer> myList2) {
        HashSet<Integer> set1 = new HashSet<>(myList1);
        HashSet<Integer> set2 = new HashSet<>(myList2);
        int count = 0;

        for (int n : set2) {
            if (set1.contains(n))
                count++;
        }
        return count;
    }
}