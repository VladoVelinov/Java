package Funkcii;

import java.util.Scanner;

public class HexToBin {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Hex number to convert to Binary");
        String hex = sc.nextLine();
        hexToBin(hex);
    }

    private static void hexToBin(String hex) {
        String sum = "";

        for (int i = 0; i < hex.length(); i++) {
            sum += hex.charAt(i) + " ";
        }

        String[] tokens = sum.split(" ");
        for (String token : tokens) {
            if (token.equals("0"))
                System.out.print("0000");
            if (token.equals("1"))
                System.out.print("0001");
            if (token.equals("2"))
                System.out.print("0010");
            if (token.equals("3"))
                System.out.print("0011");
            if (token.equals("4"))
                System.out.print("0100");
            if (token.equals("5"))
                System.out.print("0101");
            if (token.equals("6"))
                System.out.print("0110");
            if (token.equals("7"))
                System.out.print("0111");
            if (token.equals("8"))
                System.out.print("1000");
            if (token.equals("9"))
                System.out.print("1001");
            if (token.equals("A"))
                System.out.print("1010");
            if (token.equals("B"))
                System.out.print("1011");
            if (token.equals("C"))
                System.out.print("1100");
            if (token.equals("D"))
                System.out.print("1101");
            if (token.equals("E"))
                System.out.print("1110");
            if (token.equals("F"))
                System.out.print("1111");
            if (token.equals("a"))
                System.out.print("1010");
            if (token.equals("b"))
                System.out.print("1011");
            if (token.equals("c"))
                System.out.print("1100");
            if (token.equals("d"))
                System.out.print("1101");
            if (token.equals("e"))
                System.out.print("1110");
            if (token.equals("f"))
                System.out.print("1111");
        }
    }
}