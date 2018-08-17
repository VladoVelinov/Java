package Funkcii;

import java.util.Scanner;

/*
1.	Знак пред int
Напишете функция, която приема аргумент цяло число и връща като резултат дали числото е положително или отрицателно.
Резултатът да се разпечата на екрана.
Made by Vladislav Velinov.
*/
public class SignBeforeInt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        System.out.println(signBeforeNumber(n));
    }

    private static String signBeforeNumber(int number) {
        if (number == 0)
            return "The number " + number + " is zero.";
        if (number > 0)
            return "The number " + number + " is positive.";
        else
            return "The number " + number + " is negative.";
    }
}
