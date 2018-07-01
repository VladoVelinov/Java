package Loops;

import java.util.Scanner;

/*
Задача 9
Дадени са 2*n числа. Първото и второто формират двойка, третото и четвъртото също и т.н.
Всяка двойка има стойност – сумата от съставящите я числа. Напишете програма,
която проверява дали всички двойки имат еднаква стойност или печата максималната разлика
между две последователни двойки. Ако всички двойки имат еднаква стойност, отпечатайте "Yes, value=…" + стойността.
В противен случай отпечатайте "No, maxdiff=…" + максималната разлика.
Made by Vladislav Velinov.
*/
public class PairsOfNumbers {
    public static void main(String[] args) {
        int n, a, b, sum, i;
        int maxDiff = Integer.MIN_VALUE;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many pairs will have?");
        n = sc.nextInt();
        a = sc.nextInt();
        b = sc.nextInt();
        sum = a + b;

        for (i = 1; i < n; i++) {
            a = sc.nextInt();
            b = sc.nextInt();

            if (Math.abs(a + b - sum) > maxDiff)
                maxDiff = Math.abs(a + b - sum);
            sum = a + b;
        }

        if (maxDiff > 0) {
            System.out.println("No, \nmaxDiff = " + maxDiff);
        } else {
            System.out.println("Yes, \nvalue = " + sum);
        }
    }
}
