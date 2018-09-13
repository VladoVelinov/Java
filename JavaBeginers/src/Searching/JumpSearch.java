package Searching;

import java.util.Scanner;

public class JumpSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("Enter number to search in this array!");
        int xNumber = Integer.parseInt(sc.nextLine());
        if (jumpSearch(arr, xNumber) == -1) {
            System.out.println("Element is not found on this Array.");
        } else {
            System.out.println("Element is found on position " + jumpSearch(arr, xNumber) + ".");
        }
    }

    static int jumpSearch(int[] arr, int xNumber) {
        int n = arr.length;
        int step = (int) Math.floor(Math.sqrt(n));
        int prev = 0;

        while (arr[Math.min(step, n) - 1] < xNumber) {
            prev = step;
            step += (int) Math.floor(Math.sqrt(n));
            if (prev >= n)
                return -1;
        }

        while (arr[prev] < xNumber) {
            prev++;

            if (prev == Math.min(step, n))
                return -1;
        }

        if (arr[prev] == xNumber)
            return prev;

        return -1;
    }
}