package Funkcii;

import java.util.Scanner;

/*
Задача 15
Да се напише функция String Reverse(String str) ,която приема като аргумент стринг и връща нов стринг наобратно.
Ако стрингът е започвал с главна буква, новият също трябва да започва с главна буква ,като предишната главна вече
ще е малка понеже ще е накрая на новия стринг.
Made by Vladislav Velinov.
*/
public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(reverseString(str));
    }

    private static String reverseString(String str) {
        String result;
        StringBuilder sb = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }
        result = (sb.toString());
        return result;
    }
}