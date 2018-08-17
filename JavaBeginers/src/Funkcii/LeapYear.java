package Funkcii;

import java.util.Scanner;

/*
5 . Leap year
Напишете функция, която приема като аргументи 1 цяло число, което е година и връща истина, ако годината е високосна
и лъжа, ако не е.
Made by Vladislav Velinov.
*/
public class LeapYear {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int yearToCheck = Integer.parseInt(sc.nextLine());
        System.out.println(isLeapYear(yearToCheck));
    }

    private static boolean isLeapYear(int year) {
        if (year % 4 != 0) {
            return false;
        } else if (year % 400 == 0) {
            return true;
        } else if (year % 100 == 0) {
            return false;
        } else {
            return true;
        }
    }
}