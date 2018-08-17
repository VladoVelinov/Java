package Loops;

import java.util.Scanner;

/*
Проверка дали дадено число е естествено!
Made by Vladislav Velinov.
*/
public class CheckIfNumberIsPrime {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer Number: ");
        int n = Integer.parseInt(sc.nextLine());
        while (n <= 0) {
            System.out.println("Invalid input! ");
            n = Integer.parseInt(sc.nextLine());
        }
        int sqrtN = (int) Math.sqrt(n);
        boolean isPrime = true;

        if (n == 1) {
            isPrime = false;
        }

        for (int i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}