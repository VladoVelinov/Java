package Loops;

import java.util.Scanner;

/*
Задача 7
Програмата трябва да чете число от стандартния вход.
Да се изведат на екрана всички числа от 1 до n(числото от потребителя),които се делят едновременно на 3 и на 5.
Made by Vladislav Velinov.
*/
public class NumbersDividedBy3And5 {
    public static void main(String[] args) {
        int n;
        int i = 1;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Number: ");
        n = sc.nextInt();

        while ((i >= 1) && (i <= n)) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                System.out.print(i+" ");
                i++;
            } else {
                i++;
            }
        }
    }
}
