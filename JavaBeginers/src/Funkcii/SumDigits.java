package Funkcii;

import java.util.Scanner;

/*
6. Sum digits
Напишете функция, която приема като аргументи 1 цяло число и връща като резултат сумата на всички цифри в него.
Made by Vladislav Velinov.
*/
public class SumDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = Integer.parseInt(sc.nextLine());
        System.out.println(SumOfDigits(number));
    }

    private static int SumOfDigits(int num) {
        int sum = 0;
        do {
            sum = sum + (num % 10);
            num = num / 10;
        } while (num > 0);
        return sum;
    }
}