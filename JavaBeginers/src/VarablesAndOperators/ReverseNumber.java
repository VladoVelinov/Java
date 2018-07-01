package VarablesAndOperators;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        int num, reversenum = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number to reverse!");
        num = sc.nextInt();

        if (num % 10 == 0)
            System.out.print(0);

        while (num != 0) {
            reversenum = reversenum * 10;
            reversenum = reversenum + num % 10;
            num = num / 10;
        }
        System.out.print(reversenum);
    }
}
