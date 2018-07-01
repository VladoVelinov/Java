package Loops;

import java.util.Scanner;

/*
Задача 20 Брой числа
Да се състави програма, която при въвеждане на 2 естествени числа от интервала [100 .. 1000] намира броя срещания
на цифрата 5, участваща във всички числа от въведения интервал.. Програмата да не се влияе от наредбата на границите.
Made by Vladislav Velinov.
*/
public class FindAllNumbers5 {
    public static void main(String[] args) {

        int n1, n2, n3, y, counter = 0;

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
            do {
                if (y % 10 == 5) {
                    counter++;
                }
                y = y / 10;

            } while (y > 0);
        }
        System.out.println(counter);
    }
}