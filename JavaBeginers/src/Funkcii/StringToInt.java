package Funkcii;

import java.util.Scanner;

/*
12. StringToInt
Напишете функция, която приема като аргумент променлива от тип String и връща цяло число (int), което е
стойността на стринга(Метода трябва да работи като Integer.parseInt, но в нашата функция нямаме право да го ползваме)
Made by Vladislav Velinov.
*/
public class StringToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String number for conversion to Integer: ");
        String number = sc.nextLine();
        System.out.println(stringToInt(number));
    }

    private static int stringToInt(String str) {
        int result = 0;
        boolean isNegative = false;
        for (int i = 0; i < str.length(); i++) {
            char currChar = str.charAt(i);
            if (currChar == '-' && i == 0) {
                isNegative = true;
                continue;
            }
            int currNumber = currChar - 48;
            result = result * 10 + currNumber;
        }
        if (isNegative) {
            result *= -1;
        }
        return result;
    }
}