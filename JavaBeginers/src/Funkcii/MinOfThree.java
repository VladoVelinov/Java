package Funkcii;

import java.util.Scanner;

/*
3. Min of tree
Напишете функция, която приема като аргументи 3 числа и връща най-малко измежду тях.
Made by Vladislav Velinov.
*/
public class MinOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.println(MinNumberOfThree(num1, num2, num3));
    }

    private static int MinNumberOfThree(int number1, int number2, int number3) {
        if (number1 <= number2 && number1 < number3)
            return number1;
        if (number2 <= number3 && number2 < number1)
            return number2;
        return number3;
    }
}