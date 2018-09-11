package Arrays;

import java.util.Scanner;

import static Arrays.DisplayArray.displayArray;

/*
Задача 17
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програмата да промени всички въведени числа в масива след най-голямото число
както следва:
нечетните числа в по-малко четно число;
четните числа в по-голямо нечетно число;
Made by Vladislav Velinov.
*/
public class ChangeAfterBiggestNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray1 = new int[n];

        for (int i = 0; i < n; i++) {
            myArray1[i] = Integer.parseInt(sc.nextLine());
        }
        int biggestNumber = 0, index = 0;
        for (int i = 0; i < n; i++) {
            if (myArray1[i] > biggestNumber) {
                biggestNumber = myArray1[i];
                index = i;
            }
        }

        for (int i = index + 1; i < n; i++) {
            if (myArray1[i] % 2 == 0) {
                myArray1[i] += 1;
            } else {
                myArray1[i] -= 1;
            }
        }

        displayArray(myArray1);
    }
}