package Loops;

import java.util.Scanner;

public class CheckIfNumberIsPrime {
    public static void main(String[] args) {
        int n, sqrtN, i;
        boolean isPrime = true;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer Number: ");
        n = sc.nextInt();
        sqrtN = (int) Math.sqrt(n);

        if (n == 1) {
            isPrime = false;
        }

        for (i = 2; i <= sqrtN; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime);
    }
}
