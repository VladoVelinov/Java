package Sorting;

import static Sorting.PrintArray.printArray;

public class SelectionSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 4, 9, 8, 7, 6, 0, 1, 2, 3};
        printArray(selectionSort(array));
    }

    private static int[] selectionSort(int[] arr) {
        int n = arr.length;
        int minimumPosition = 0;
        int lastMinimum = 0;

        for (int i = 0; i < n; i++) {
            int minimum = arr[i];
            int temp = arr[i];
            for (int j = minimumPosition; j < n; j++) {
                if (arr[j] <= minimum) {
                    minimum = arr[j];
                    lastMinimum = j;
                }
            }
            arr[i] = minimum;
            arr[lastMinimum] = temp;
            minimumPosition++;
        }

        return arr;
    }
}