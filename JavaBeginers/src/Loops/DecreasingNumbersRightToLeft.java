package Loops;

import java.util.Scanner;

/*
Задача 21 Намаляващи числа от дясно на ляво

Да се състави програма, която при въвеждане на 2 естествени числа от интервала [100..999] намира всички числа
между въведените (интервала между 2-те въведени числа), в записа на които всяка дясна цифра е по-голяма от
съседната й лява.
*/
public class DecreasingNumbersRightToLeft {
    public static void main(String[] args) {
        int n1, n2, n3, y;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers!");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        while (n1 < 100 || n1 > 999 || n2 < 100 || n2 > 999) {

            System.out.println("Invalid Input!");
            n1 = sc.nextInt();
            n2 = sc.nextInt();

        }
        if (n1 > n2) {
            n3 = n1;
            n1 = n2;
            n2 = n3;
        }

        for (int i = n1; i < n2; i++) {
            y = i / 10;
            y = y % 10;
            if ((i % 10) > y) {
                System.out.println(i);
            }
        }
    }
}
