package Funkcii;

import java.util.Arrays;

public class NativeInsertionSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1};
        SmartInsertion(arr);
        System.out.println(Arrays.toString(arr));
    }

//    public static void NativeInsertion(int[] arr) {
//        for (int i = 1; i < arr.length; i++) {
//            int pos = i;
//
//        }
//    }

    public static void SmartInsertion(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            int value = arr[i];
            int pos = i - 1;
            while (pos >= 0 && value < arr[pos]) {
                arr[pos + 1] = arr[pos];
                pos--;
            }
            arr[pos + 1] = value;
        }
    }

    public static void MergeArray(int[] arr1, int[] arr2) {
        int[] result = new int[arr1.length+arr2.length];
        int cursor1=0;
        int cursor2=0;
        int index=0;
        while (cursor1<arr1.length&&cursor2<arr2.length){

        }
    }
}
