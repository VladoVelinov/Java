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

        int n, row;
        String symbol = "$";
        String symbolsMax = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("How many symbols will have this triangle?");
        n = sc.nextInt();

        for (row = 0; row < n; row++) {
            symbolsMax += symbol;
            System.out.println(symbolsMax);
        }
    }
}
