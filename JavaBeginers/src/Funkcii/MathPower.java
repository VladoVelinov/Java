package Funkcii;

import java.util.Scanner;

/*
9. Math Power
Напишете фунцкия, която повдига дадено число на степен.
Made by Vladislav Velinov.
*/
public class MathPower {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = Integer.parseInt(sc.nextLine());
        int b = Integer.parseInt(sc.nextLine());
        System.out.println(pow(a, b));
    }

    private static double pow(int a, int b) {
//        return (int)Math.pow(a, b);
        double result = 1;
        if (b > 0) {
            for (int i = 0; i < b; i++) {
                result *= a;
            }
        } else if (b < 0)
            if (a == 0)
                return 0;
        for (int i = 0; i < -b; i++) {
            result /= a;
        }
        return result;
    }
}