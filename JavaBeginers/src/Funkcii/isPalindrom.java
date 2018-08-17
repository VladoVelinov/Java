package Funkcii;

import java.util.Scanner;

/*
Задача 16
Да се напише функция boolean isPalindrom(String str) ,която приема като аргумент стринг и връща дали стрингът е
палиндром. Палиндорм са думи(изрази) които прочетени отпред и от зад са едно и също.
Made by Vladislav Velinov.
*/
public class isPalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine();
        System.out.println(isPalidrom(myStr));
    }

    private static boolean isPalidrom(String str) {
        boolean isPalindrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }
}