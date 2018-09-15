package Tests;

import java.util.Scanner;

public class FindAllPrimes {
    private static boolean isPrime(int number) {
        boolean isPrime = true;
        int sqrtN = (int) Math.sqrt(number);
        if (number == 1) {
            isPrime = false;
        }

        for (int i = 0; i < sqrtN; i++) {
            if (number % i == 0) {
                isPrime = false;
                break;
            }
        }

        return isPrime;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        int a = Integer.parseInt(input1);
        int b = Integer.parseInt(input2);

        for (int i = a; i <= b; i++) {
            if (isPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
