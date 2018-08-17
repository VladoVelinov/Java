package Funkcii;

import java.util.Scanner;
/*
Задача 17
Да се напише функция, която приема като аргумент цяло число и казва дали числото е просто.
Made by Vladislav Velinov.
 */
public class CheckForPrime {
    private static boolean isPrime(int number) {
        boolean isPrimeNumber = true;
        int sqrtN = (int) Math.sqrt(number);
        if (number == 0) {
            isPrimeNumber = false;
        }
        if (number == 1) {
            isPrimeNumber = false;
        }
        for (int i = 2; i <= sqrtN; i++) {
            if (number % i == 0) {
                isPrimeNumber = false;
                break;
            }
        }
        return isPrimeNumber;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(isPrime(num));
    }
}
