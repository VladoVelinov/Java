package JavaMejdinenTest;

import java.util.Scanner;

/*
Test3:
Просто число е естествено число по-голямо от 1, което няма положителни делители, различни от 1 и самото число.
Напишете метод, който проверява дали числото е просто.
Класа да се именува: PrimeNumber
Метода: isPrime
Made by Vladislav Velinov.
*/
public class PrimeNumber {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Въведвте положително число: ");
            num = sc.nextInt();
        } while (num < 0);

        System.out.println(isPrime(num));
    }

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
}