package Funkcii;

import java.util.Scanner;

public class DecimalToBinary {
    private void convertBinary(int num) {
        int binary[] = new int[40];
        int index = 0;
        while (num > 0) {
            binary[index++] = num % 2;
            num /= 2;
        }

        for (int i = index - 1; i >= 0; i--) {
            System.out.print(binary[i]);
        }
    }

    public static void main(String arr[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter integer number for conversion: ");
        int number = Integer.parseInt(sc.nextLine());
        DecimalToBinary obj = new DecimalToBinary();
        System.out.println("Binary representation of " + number + " is: ");
        obj.convertBinary(number);
    }
}
