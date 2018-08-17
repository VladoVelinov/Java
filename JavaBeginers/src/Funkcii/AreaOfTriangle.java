package Funkcii;

import java.util.Scanner;

/*
8. Calculate Triangle Area
Напишете функция, която изчислява лицето на триъгълник
Made by Vladislav Velinov.
*/
public class AreaOfTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int h = Integer.parseInt(sc.nextLine());
        System.out.println(areaOfTriangle(a, h));
    }

    private static int areaOfTriangle(int a, int h) {
        return (a * h) / 2;
    }
}