package Loops;

import java.util.Scanner;

/*
Задача 13

Да се напише програма, която въвежда число n и печата триъгълник от долари като в примерите:

Input:
2

Output:
$
$$
Made by Vladislav Velinov.
*/
public class TriangleFromDollarSigns {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How many symbols will have this triangle?");
        int n = Integer.parseInt(sc.nextLine());
        String symbol = "$";
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            sb.append(symbol.charAt(0));
            System.out.println(sb);
        }
    }
}