package Funkcii;

import java.util.Scanner;

/*
Задача 17
Да се напише функция, която приема като аргумент цяло число и казва дали числото е просто.
Made by Vladislav Velinov.
*/
public class isPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter positive integer Number: ");
        int num = Integer.parseInt(sc.nextLine());
        while (num <= 0) {
            System.out.println("Invalid input! ");
            num = Integer.parseInt(sc.nextLine());
        }
        System.out.println(isPrimeNumber(num));
    }

    private static boolean isPrimeNumber(int number) {

        int sqrtN = (int) Math.sqrt(number);
        boolean isPrime = true;

        if (number == 1) {
            isPrime = false;
        }

        for (int i = 2; i <= sqrtN; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
