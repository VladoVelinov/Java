/*
Exercise 1.8:
Write a method countCommon that takes two Lists of integers as parameters and returns the number of unique integers that
occur in both lists. Use one or more Sets as storage to help you solve this problem.
For example, if one list contains the values [3, 7, 3, -1, 2, 3, 7, 2, 15, 15] and the other list contains the values
[-5, 15, 2, -1, 7, 15, 36], your method should return 4 (because the elements -1, 2, 7, and 15 occur in both lists).
Made by Vladislav Velinov,
*/
package ObjectOrientedProgramming;

import java.util.*;

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