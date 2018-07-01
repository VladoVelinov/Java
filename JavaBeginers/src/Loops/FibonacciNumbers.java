package Loops;

import java.util.Scanner;

/*
Задача 8
Програмата трябва да чете число от стандартния вход.
Да се изведат на екрана първите n на брой числа на фибоначи.
Made by Vladislav Velinov.
*/
public class FibonacciNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n1 = 1, n2 = 1, n3, n, i;

        System.out.println("Enter Number: ");
        n = sc.nextInt();
        if (n <= 0) {
            System.out.print("Invalid Input!");
        } else if (n == 1) {
            System.out.print(n1);
        } else {
            System.out.print(n1 + " " + n2);
        }

        for (i = 2; i < n; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}