package Funkcii;


import java.util.Arrays;

public class BubbleSortArr {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5,55,7,6};
        BubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void Swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void BubbleSort(int[] arr) {
        for (int j=0; j<arr.length-1; j++) {
            boolean isSwapped = false;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    Swap(arr, i, i + 1);
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                return;
        }
    }
//    public static void
}
