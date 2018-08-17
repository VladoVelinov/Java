package Funkcii;

import java.util.Scanner;

/*
10. Greater of Two Values
Получавате от потребителя 2 стойности от еднакъв тип. Напишете функция/функции, която ги сравнява и връща
по-голямото .Възможните типове са  string , int и char.
Made by Vladislav Velinov.
*/
public class GraterOfTwoValues {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        switch (str) {
            case "int": {
                int a = sc.nextInt();
                int b = sc.nextInt();
                System.out.println(integerID(a, b));
                break;
            }
            case "char": {
                char a = sc.next(".").charAt(0);
                char b = sc.next(".").charAt(0);
                System.out.println(charID(a, b));
                break;
            }
            case "string": {
                String a = sc.nextLine();
                String b = sc.nextLine();
                System.out.println(strID(a, b));
                break;
            }
            default: {
                System.out.println("Incorrect Input!");
            }
        }
    }

    private static int integerID(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    private static char charID(char a, char b) {
        if (a > b)
            return a;
        else
            return b;
    }

    private static String strID(String a, String b) {
        if (a.length() > b.length())
            return a;
        else
            return b;
    }
}