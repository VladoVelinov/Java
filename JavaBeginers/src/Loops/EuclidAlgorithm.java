package Loops;

import java.util.Scanner;

/*
Задача 19 НОД
Най-голям общ делител (НОД) на две цели числа, поне едното от които е различно от нула, в математиката е най-голямото
цяло число, което дели и двете числа без остатък. Напишете програма, която смята НОД на две числа.
Подсказка: Проверете алгоритъма на Евклид.
Made by Vladislav Velinov.
*/
public class EuclidAlgorithm {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers!");
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());

        while (n2 != 0) {
            int oldB = n2;
            n2 = n1 % n2;
            n1 = oldB;
        }
        System.out.println(n1);
    }
}