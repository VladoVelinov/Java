package Loops;

import java.util.Scanner;

/*
Задача 18  Наредени двойки
Напишете програма, която приема 2 числа (n и m),и изкарва на екрана всички наредени двойки с числа от 1 до 1000,
като първото се дели на n , а второто на m. Накрая програмата ви трябва да изведе броя им.
*/
public class PairsInOrder {
    public static void main(String[] args) {

        int n, m, n1, m1, counter = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter two numbers!");
        n = sc.nextInt();
        m = sc.nextInt();

        for (int i = n; i <= 1000; i += n) {
            if (i % n == 0) {
                n1 = i;
                for (int y = m; y <= 1000; y++) {
                    if (y % m == 0) {
                        m1 = y;
                        counter++;
                        System.out.println(n1 + "," + m1);
                    }
                }
            }
        }
        System.out.println("Count: " + counter);
    }
}