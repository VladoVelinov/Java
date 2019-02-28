/*
Exercise 1.7:
Write a method minToFront that takes an ArrayList of integers as a parameter and that moves the minimum value in the
list to the front, otherwise preserving the order of the elements. For example, if a variable called list stores the
following values: {3, 8, 92, 4, 2, 17, 9} and you make this call: minToFront(list); it should store the following
values after the call: {2, 3, 8, 92, 4, 17, 9} You may assume that the list stores at least one value.
Made by Vladislav Velinov
*/
package ObjectOrientedProgramming;

import java.util.ArrayList;

public class MinToFront {
    public static void main(String[] args) {
        ArrayList<Integer> myList = new ArrayList<>();
        myList.add(3);
        myList.add(4);
        myList.add(92);
        myList.add(4);
        myList.add(2);
        myList.add(17);
        myList.add(9);

        minToFront(myList);

    }

    private static void minToFront(ArrayList<Integer> myList) {
        int min = Integer.MAX_VALUE;
        int pos = -1;

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i) < min) {
                min = myList.get(i);
                pos = i;
            }
        }

        myList.remove(pos);
        myList.add(0, min);

        for (int i = 0; i < myList.size(); i++) {
            if (myList.size() == 1) {
                System.out.printf("[%s] ", myList.get(i));
            } else if (i == 0) {
                System.out.printf("[%s, ", myList.get(i));
            } else if (i == myList.size() - 1) {
                System.out.printf("%s]", myList.get(i));
            } else {
                System.out.printf("%s, ", myList.get(i));
            }
        }
    }
}