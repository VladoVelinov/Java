package Loops;

import java.util.Scanner;

/*
Задача 18  Наредени двойки
Напишете програма, която приема 2 числа (n и m),и изкарва на екрана всички наредени двойки с числа от 1 до 1000,
като първото се дели на n , а второто на m. Накрая програмата ви трябва да изведе броя им.
Made by Vladislav Velinov.
*/
public class PairsInOrder {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers!");
        int n = Integer.parseInt(sc.nextLine());
        int m = Integer.parseInt(sc.nextLine());
        int counter = 0;

        for (int i = 1; i <= 1000; i++) {
            if (i % n == 0) {
                for (int j = 1; j <= 1000; j++) {
                    if (j % m == 0) {
                        counter++;
                        System.out.println(i + "," + j);
                    }
                }
            }
        }
        System.out.println("Count: " + counter);
    }
}