package VarablesAndOperators;

import java.util.Scanner;

/*
Задача 1. Лице на правоъгълник
Напишете програма ,която чете 2 числа(страните на правоъгълник) (int a и b) ,смята и принтира лицето на правоъгълник:
Made by Vladislav Velinov.
*/
public class LiceNaPravougulnik {
    public static void main(String[] args) {
        int a, b;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number for a:");
        String input = sc.nextLine();
        a = Integer.parseInt(input);

        System.out.println("Enter number for b:");
        input = sc.nextLine();
        b = Integer.parseInt(input);

        System.out.println("The area of this rectangle is " + a * b);

    }
}
