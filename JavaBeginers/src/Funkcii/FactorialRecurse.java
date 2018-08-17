package Funkcii;

import java.util.Scanner;

public class FactorialRecurse {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        System.out.println(Fact(a));
    }

    public static int Fact(int n) {
        if (n==0)
            return 1;
        return n*Fact(n-1);
    }
}
