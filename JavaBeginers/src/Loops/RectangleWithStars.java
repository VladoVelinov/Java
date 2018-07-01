package Loops;

import java.util.Scanner;

/*
Задача 11
Напишете програма, която въвежда цяло положително число n и печата на конзолата правоъгълник от n * n звездички.
*/
public class RectangleWithStars {
    public static void main(String[] args) {

        int n, row;

        Scanner sc = new Scanner(System.in);

        System.out.println("How many stars will have this rectangle?");
        n = sc.nextInt();
        String stars = "*";
        String starsMax = "";

        for (row = 0; row < n; row++) {
            starsMax += stars;
        }
        for (row = 0; row < n; row++) {
            System.out.println(starsMax);
        }
    }
}
