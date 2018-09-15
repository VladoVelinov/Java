package JavaMejdinenTest;

import java.util.Scanner;

/*
Test5:
Палиндром е дума, която се чете по същия начин от дясно наляво и от ляво надясно.
"abcba" е палиндром.
Напишете метод, който връща най-дългия палиндром на даден низ.
Класа да се именува: LongestPalindromeInWord.
Метода: findLongestPalindrome
Made by Vladislav Velinov.
*/
public class LongestPalindromeInWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String myStr = sc.nextLine();
        System.out.println(findLongestPalindrome(myStr));
    }

    private static boolean isPalindrome(String str) {
        boolean isPalindrom = true;
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                isPalindrom = false;
            }
        }
        return isPalindrom;
    }

    private static String findLongestPalindrome(String myString) {
        String string = "";

        for (int i = 1; i < myString.length(); i++) {
            for (int j = 0; j < myString.length() - i + 1; j++) {
                if (isPalindrome(myString.substring(j, j + i))) {
                    string = myString.substring(j, j + i);
                    break;
                }
            }
        }

        return string;
    }
}