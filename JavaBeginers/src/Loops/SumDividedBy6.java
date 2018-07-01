package Loops;

import java.util.Scanner;

/*
Задача 22 Числа кратни на 6 ?
Да се състави програма , която при въвеждане на 2 естествени числа от интервала [100 .. 1000] намира всички числа
между въведените (интервала между 2-те въведени числа), чиято сума от цифрите е кратна на 6.
Made by Vladislav Velinov.
*/
public class SumDividedBy6 {
    public static void main(String[] args) {
        int n1, n2, n3, y, sum;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers!");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        while (n1 < 100 || n1 > 1000 || n2 < 100 || n2 > 1000) {
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
            y = i;
            sum = 0;

            do {
                sum = sum + (y % 10);
                y = y / 10;
            } while (y > 0);

            if (sum % 6 == 0) {
                System.out.println(i);
            }
        }
    }
}
