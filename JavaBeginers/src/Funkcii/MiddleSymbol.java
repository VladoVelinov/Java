package Funkcii;

import java.util.Scanner;

/*
2.Среден символ
Напишете функция, която приема стринг и изпечатва на екрана символа/символите в средата на стринга.
Made by Vladislav Velinov.
*/
public class MiddleSymbol {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(middle(str));
    }

    private static String middle(String str) {
        int position;
        int length;
        if (str.length() % 2 == 0) {
            position = str.length() / 2 - 1;
            length = 2;
        } else {
            position = str.length() / 2;
            length = 1;
        }
        return str.substring(position, position + length);
    }
}