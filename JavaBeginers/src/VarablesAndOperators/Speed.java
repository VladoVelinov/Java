package VarablesAndOperators;

import java.util.Scanner;

/*
Задача 5. Информация за скоростта
Да се напише програма, която въвежда скорост (десетично число) и отпечатва информация за скоростта. При скорост до
10 (включително) отпечатайте “slow”. При скорост над 10 и до 50 отпечатайте “average”. При скорост над 50 и до 150
отпечатайте “fast”. При скорост над 150 и до 1000 отпечатайте “ultra fast”. При по-висока скорост отпечатайте
“extremely fast”.
Made by Vladislav Velinov.
*/
public class Speed {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check!");
        double speed = Double.parseDouble(sc.nextLine());

        if (speed <= 10) {
            System.out.println("slow");
        } else if (speed > 1000) {
            System.out.println("extremely fast");
        } else if (speed > 150) {
            System.out.println("ultra fast");
        } else if (speed > 50) {
            System.out.println("fast");
        } else {
            System.out.println("average");
        }
    }
}