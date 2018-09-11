package Sorting;

import static Sorting.PrintArray.printArray;

public class QuickSort {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 4, 9, 8, 7, 6, 0};
        QuickSort ob = new QuickSort();
        ob.quickSort(array, 0, array.length-1);
        printArray(array);
    }

    int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = (low - 1);

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;

        return i + 1;
    }

    void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);

            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }
}