package Funkcii;

import java.util.Scanner;

/*
14. Printing Triangle
Напишете функция, която приема аргумент цяло число и печата на екрана следния триъгълник.
Made by Vladislav Velinov.
*/
public class PrintTriangle {
    private static void printTriangle(int number) {
        int i = 1;
        boolean isIncrement = true;
        while (i > 0) {
            printRow(i);
            System.out.println();

            if (i == number)
                isIncrement = false;

            if (isIncrement)
                i++;
            else
                i--;

        }
    }

    private static void printRow(int number) {
        for (int i = 1; i <= number; i++) {
            System.out.print(i + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num < 0) {
            System.out.println("Give positive number!");
            num = sc.nextInt();
        }
        printTriangle(num);

    }
}