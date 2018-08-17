package Loops;

import java.util.Scanner;

/*
Задача 12
Напишете програма, която въвежда цяло положително число n и чертае на конзолата квадратна рамка с размер n * n
като в примерите по-долу:

input:
5

exit:
+ - - - +
| - - - |
| - - - |
| - - - |
+ - - - +
Made by Vladislav Velinov.
*/
public class RectanglePlusMinus {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("How big will be this rectangle?");
        int n = Integer.parseInt(sc.nextLine());
        String minus = "- ";
        String plus = "+ ";
        String symbol = "| ";

        StringBuilder minusMax = new StringBuilder();

        for (int i = 0; i < 2 * (n - 2); i++) {
            if (i % 2 == 0) {
                minusMax.append(minus.charAt(0));
            } else {
                minusMax.append(minus.charAt(1));
            }
        }

        for (int i = 0; i < n; i++) {
            if ((i == 0) || (i == n - 1)) {
                System.out.println(plus + minusMax + plus);
            } else {
                System.out.println(symbol + minusMax + symbol);
            }
        }
    }
}