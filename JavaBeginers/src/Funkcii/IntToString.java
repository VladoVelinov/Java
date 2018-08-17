package Funkcii;

import java.util.Scanner;

/*
13. IntToString
Напишете функция, която приема като аргумент променлива от тип int и връща променлива string, който е числото,
но просто записано като текст(стринг).Във функцията нямате право да ползвате системни методи като .toString() и подобни.
Made by Vladislav Velinov.
*/
public class IntToString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number for conversion to String: ");
        int num = Integer.parseInt(sc.nextLine());
        System.out.println(intToString(num));

    }

    private static String intToString(int number) {
        String result = "";
        result += number;
        return result;
    }
}