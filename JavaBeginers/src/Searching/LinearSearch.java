package Searching;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter number to search in this array!");
        int xNumber = Integer.parseInt(sc.nextLine());
        int endOfArray = arr.length - 1;
        if (linearSearch(arr, endOfArray, xNumber) == -1) {
            System.out.println("Element is not found on this Array.");
        } else {
            System.out.println("Element is found on position " + linearSearch(arr, endOfArray, xNumber) + ".");
        }
    }

    //Returning position of the searched element! If found return his index if not returns -1.
    static int linearSearch(int arr[], int endOfArray, int xNumber) {

        for (int i = 0; i < endOfArray; i++) {
            if (arr[i] == xNumber)
                return i;
        }

        return -1;
    }
}