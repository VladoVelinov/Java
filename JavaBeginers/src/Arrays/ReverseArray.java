package Arrays;

import java.util.Scanner;

import static Arrays.DisplayArray.displayArray;

/*
Задача 3
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програма трябва да "reverse"-не  масива и да го изкара на екрана.
Made by Vladislav Velinov.
*/
public class ReverseArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n / 2; i++) {
            int temp = myArray[i];
            myArray[i] = myArray[n - (1 + i)];
            myArray[n - (1 + i)] = temp;
        }

        displayArray(myArray);
    }
}