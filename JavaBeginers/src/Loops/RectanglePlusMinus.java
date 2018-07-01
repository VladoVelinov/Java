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

*/
public class RectanglePlusMinus {
    public static void main(String[] args) {

        int n, row;
        String minus = "-";
        String plus = "+";
        String symbol = "|";
        String minusMax = "";

        Scanner sc = new Scanner(System.in);

        System.out.println("How big will have this rectangle?");
        n = sc.nextInt();

        for (row = 0; row < n - 2; row++) {
            minusMax += minus;
        }

        for (row = 0; row < n; row++) {
            if ((row == 0) || (row == n - 1)) {
                System.out.println(plus + minusMax + plus);
            } else {
                System.out.println(symbol + minusMax + symbol);
            }
        }
    }
}
