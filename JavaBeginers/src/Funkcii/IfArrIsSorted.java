package Funkcii;

public class IfArrIsSorted {
    public static void main(String[] args) {

        int[] arr = {1, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(isSort(arr, 0));
    }

    public static boolean isSort(int[] arr, int cursor) {
        if (arr[cursor] == arr.length - 1)
            return true;
        if (arr[cursor] > arr[cursor + 1])
            return false;
        return isSort(arr, cursor + 1);


    }
}
