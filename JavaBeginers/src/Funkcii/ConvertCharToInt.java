package Funkcii;

import java.util.Scanner;

/*
11. CharToInt
Напишете функция, която приема като аргумент променлива от тип char и връща цяло число (int), което е стойността
на този символ(не в аски таблицата, а реалната стойност). Функцията да се казва ConvertCharToInt.
Made by Vladislav Velinov.
*/
public class ConvertCharToInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter character for conversion to Integer: ");
        char a = sc.next(".").charAt(0);
        System.out.println(toInt(a));
    }

    private static int toInt(char a) {
        if ((int) a > 96)
            return ((int) a) - 96;
        else if ((int) a > 64)
            return ((int) a) - 64;
        else if ((int) a > 48)
            return ((int) a) - 48;
        else if ((int) a == 48)
            return 0;
        else
            return (int) a;
    }
}