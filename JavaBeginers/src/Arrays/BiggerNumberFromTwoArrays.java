package Arrays;

import Arrays2D.DisplayMatrix;

import java.util.Scanner;

import static Arrays.DisplayArray.displayArray;

/*
Задача 14
Да се напише програма, която на първия ред приема цяло число N и заделя 2 масива с големина N. После четем 2*N
на брой числа, които трябва да се сложат в масивите. Първо четем числата за първия масив, после за втория.
Програмата сравнява всички числа с еднакви индекси от двата масива и записва в трети масив, по-голямото от
двете числа.
Made by Vladislav Velinov.
*/
public class BiggerNumberFromTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray1 = new int[n];
        int[] myArray2 = new int[n];
        int[] myArray3 = new int[n];

        for (int i = 0; i < n; i++) {
            myArray1[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            myArray2[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            if (myArray1[i] <= myArray2[i]) {
                myArray3[i] = myArray2[i];
            } else {
                myArray3[i] = myArray1[i];
            }
        }

        displayArray(myArray3);
    }
}