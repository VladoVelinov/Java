package Loops;

import java.util.Scanner;

/*
Задача 21 Намаляващи числа от дясно на ляво:
Да се състави програма, която при въвеждане на 2 естествени числа от интервала [100..999] намира всички числа
между въведените (интервала между 2-те въведени числа), в записа на които всяка дясна цифра е по-голяма от
съседната й лява.
Made by Vladislav Velinov.
*/
public class DecreasingNumbersRightToLeft {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers!");
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());

        while (n1 < 100 || n1 > 999 || n2 < 100 || n2 > 999) {

            System.out.println("Invalid Input!");
            n1 = Integer.parseInt(sc.nextLine());
            n2 = Integer.parseInt(sc.nextLine());

        }
        if (n1 > n2) {
            int n3 = n1;
            n1 = n2;
            n2 = n3;
        }

        for (int i = n1; i < n2; i++) {
            int y = i / 10;
            y = y % 10;
            if ((i % 10) > y) {
                System.out.println(i);
            }
        }
    }
}