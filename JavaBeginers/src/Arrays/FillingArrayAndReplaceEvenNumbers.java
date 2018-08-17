package Arrays;

import java.util.Scanner;

/*
Задача 1
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после N на брой числа,
които трябва да се сложат в масива. Програма трябва да направи всички четни числа на 0 и да изкара масива на екрана.
Made by Vladislav Velinov.
*/
public class FillingArrayAndReplaceEvenNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArry = new int[n];

        for (int i = 0; i < n; i++) {
            myArry[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            if (myArry[i] % 2 == 0) {
                myArry[i] = 0;
            }
            System.out.print(myArry[i] + " ");
        }
    }
}