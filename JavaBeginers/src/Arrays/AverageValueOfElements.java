package Arrays;

import java.util.Scanner;

/*
Задача 6
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програмата да изведе средната стойност на въведените числа.
Made by Vladislav Velinov.
*/
public class AverageValueOfElements {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];
        int sum = 0;

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            sum += myArray[i];
        }
        System.out.printf("%.3f", (double) sum / n);
    }
}