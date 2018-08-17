package Funkcii;

import java.util.Scanner;

public class FibbonaciRecurse {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        a= sc.nextInt();
        System.out.println(Fib(a));
    }

    public static int Fib(int n) {
        if (n==1||n==2)
            return 1;
        return Fib(n-1)+ Fib(n-2);
    }
}
