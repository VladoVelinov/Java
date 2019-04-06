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