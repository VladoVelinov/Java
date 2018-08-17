package Loops;

import java.util.Scanner;
/*
Задача 10
Елемент, равен на сумата на останалите
Да се напише програма, която въвежда n цели, положителни числа и проверява дали сред тях съществува число,
което е равно на сумата на всички останали. Ако има такъв елемент, печата "Yes" + неговата стойност;
иначе печата "No" + разликата между най-големия елемент и сумата на останалите (по абсолютна стойност).
Made by Vladislav Velinov.
*/

public class CheckElementsSum {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how much elements we will have?");
        int n = Integer.parseInt(sc.nextLine());
        int sumOfElement = 0;
        int maxNum = Integer.MIN_VALUE;

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(sc.nextLine());
            sumOfElement += num;

            if (num > maxNum) {
                maxNum = num;
            }
        }

        if ((sumOfElement - maxNum) == maxNum) {
            System.out.println("Yes \nSum = " + maxNum);
        } else {
            System.out.println("No \nDiff = " + Math.abs(((sumOfElement - maxNum)) - maxNum));
        }
    }
}