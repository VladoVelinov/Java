package Funkcii;

import java.util.Scanner;

public class BinaryToDecimal {
    private int ConvertToDecimal(int binaryNumber) {

        int decimal = 0;
        int p = 0;
        while (true) {
            if (binaryNumber == 0) {
                break;
            } else {
                int temp = binaryNumber % 10;
                decimal += temp * Math.pow(2, p);
                binaryNumber /= 10;
                p++;
            }
        }
        return decimal;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number for conversion: ");
        int number = sc.nextInt();
        BinaryToDecimal obj = new BinaryToDecimal();
        System.out.println("The number " + number + " decimal is " + obj.ConvertToDecimal(number));
    }
}
