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
        int n1 = 1, n2 = 1;

        System.out.println("Enter Number: ");
        int n = Integer.parseInt(sc.nextLine());
        if (n <= 0) {
            System.out.print("Invalid Input!");
        } else if (n == 1) {
            System.out.print(n1);
        } else {
            System.out.print(n1 + " " + n2);
        }

        for (int i = 2; i < n; ++i) {
            int n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
    }
}