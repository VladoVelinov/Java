package Funkcii;

import java.util.Scanner;

public class BinToHex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter binary number to convert to Hex");
        String bin = sc.nextLine();
        binToHex(bin);
    }

    private static void binToHex(String bin) {
        String sum = "";
        int counter = 0;

        for (int i = 0; i < bin.length(); i++) {
            counter++;
            if (counter % 4 == 0) {
                sum += bin.charAt(i) + " ";
                continue;
            }
            sum += bin.charAt(i);
        }

        String[] tokens = sum.split(" ");
        for (String token : tokens) {
            if (token.equals("0000"))
                System.out.print("0");
            if (token.equals("0001"))
                System.out.print("1");
            if (token.equals("0010"))
                System.out.print("2");
            if (token.equals("0011"))
                System.out.print("3");
            if (token.equals("0100"))
                System.out.print("4");
            if (token.equals("0101"))
                System.out.print("5");
            if (token.equals("0110"))
                System.out.print("6");
            if (token.equals("0111"))
                System.out.print("7");
            if (token.equals("1000"))
                System.out.print("8");
            if (token.equals("1001"))
                System.out.print("9");
            if (token.equals("1010"))
                System.out.print("A");
            if (token.equals("1011"))
                System.out.print("B");
            if (token.equals("1100"))
                System.out.print("C");
            if (token.equals("1101"))
                System.out.print("D");
            if (token.equals("1110"))
                System.out.print("E");
            if (token.equals("1111"))
                System.out.print("F");
        }
    }
}