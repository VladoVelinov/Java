package Loops;

import java.util.Scanner;

/*
Задача 11
Напишете програма, която въвежда цяло положително число n и печата на конзолата правоъгълник от n * n звездички.
Made by Vladislav Velinov.
*/
public class RectangleWithStars {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many stars will have this rectangle?");
        int n = Integer.parseInt(sc.nextLine());
        String stars = "*";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(stars.charAt(0));
        }

        for (int i = 0; i < n; i++) {
            System.out.println(sb);
        }
    }
}