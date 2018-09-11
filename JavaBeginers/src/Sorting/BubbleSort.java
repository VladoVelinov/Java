package Sorting;

import static Sorting.PrintArray.printArray;

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 4, 9, 8, 7, 6, 0};
        printArray(bubbleSort(array));
    }

    private static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < n - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    int temp = arr[i + 1];
                    arr[i + 1] = arr[i];
                    arr[i] = temp;
                    swapped = true;
                }
            }
        }
        while (swapped);
        return arr;
    }
}