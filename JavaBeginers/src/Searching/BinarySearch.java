package Searching;

import java.util.Scanner;

public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter number to search in this array!");
        int xNumber = Integer.parseInt(sc.nextLine());
        int endOfArray = arr.length - 1;
        System.out.println(binSearch(arr, 0, endOfArray, xNumber));
        if (binSearchIndex(arr, 0, endOfArray, xNumber) == -1) {
            System.out.println("Element is not found on this Array.");
        } else {
            System.out.println("Element is found on position " + binSearchIndex(arr, 0, endOfArray, xNumber));
        }
    }

    // Recursive implementation of Binary Search true/false.
    private static boolean binSearch(int[] arr, int startOfArray, int endOfArray, int xNumber) {
        int mid = (startOfArray + endOfArray) / 2;
        if (arr[mid] == xNumber)
            return true;
        if (endOfArray == startOfArray)
            return false;
        if (arr[mid] > xNumber)
            return binSearch(arr, startOfArray, mid - 1, xNumber);
        else
            return binSearch(arr, mid + 1, endOfArray, xNumber);
    }

    // Recursive implementation of Binary Search return index position.
    private static int binSearchIndex(int[] arr, int startOfArray, int endOfArray, int xNumber) {
        int mid = (startOfArray + endOfArray) / 2;
        if (arr[mid] == xNumber)
            return mid;
        if (endOfArray == startOfArray)
            return -1;
        if (arr[mid] > xNumber)
            return binSearchIndex(arr, startOfArray, mid - 1, xNumber);
        else
            return binSearchIndex(arr, mid + 1, endOfArray, xNumber);
    }
}