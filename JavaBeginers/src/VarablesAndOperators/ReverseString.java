package VarablesAndOperators;

import java.util.Scanner;
/*
Made by Vladislav Velinov
 */
public class ReverseString {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter string to reverse:");
        String str = sc.nextLine();

        StringBuilder sb = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            sb.append(str.charAt(i));
        }

        System.out.println("Reversed string is:");
        System.out.println(sb.toString());
    }
}


// Втора версия
//import java.util.Scanner;
//
//public class ReverseString
//{
//    public static void main(String[] args)
//    {
//        System.out.println("Enter string to reverse:");
//
//        Scanner read = new Scanner(System.in);
//        String str = read.nextLine();
//        String reverse = "";
//
//
//        for(int i = str.length() - 1; i >= 0; i--)
//        {
//            reverse = reverse + str.charAt(i);
//        }
//
//        System.out.println("Reversed string is:");
//        System.out.println(reverse);
//    }
//}