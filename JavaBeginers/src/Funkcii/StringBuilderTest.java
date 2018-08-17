package Funkcii;

import java.util.Scanner;

public class StringBuilderTest {
    public static String ReverseString(String str) {
        StringBuilder result = new StringBuilder();

        for (int i=str.length()-1;i>-0;i--){
            result.append(str.charAt(i));
        }
        return result.toString();
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str =sc.nextLine();





//        System.out.println(ReverseString());
    }
}


//sravnqvane s compareTo() ili equals()