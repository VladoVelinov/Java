package Arrays;

import java.util.Scanner;

/*
Задача 8
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програмата да изведе всички числа кратни на 5, но по-големи от 5.
Made by Vladislav Velinov.
*/
public class NumbersDividedBy5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            if ((myArray[i]) % 5 == 0 && (myArray[i]) > 5) {
                System.out.print(myArray[i] + " ");
            }
        }
    }
}