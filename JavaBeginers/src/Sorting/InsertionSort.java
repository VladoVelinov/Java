package Sorting;

import static Sorting.PrintArray.printArray;

public class InsertionSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 4, 9, 8, 7, 6, 0, 1, 2, 3};
        printArray(insertionSort(array));
    }

    private static int[] insertionSort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
        return arr;
    }
}
