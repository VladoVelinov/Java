package Loops;

import java.util.Scanner;

/*
Задача 14 Операции между числа
Напишете програма, която чете две цели числа (N1 и N2) и оператор с който да се извърши дадена математическа
операция с тях. Възможните операции са: Събиране(+), Изваждане(-), Умножение(*), Деление(/) и Модулно деление(%).
При събиране, изваждане и умножение на конзолата трябва да се отпечатат резултата и дали той е четен или нечетен.
При обикновеното деление – резултата. При модулното деление – остатъка. Трябва да се има предвид, че делителят
може да е равен на 0(нула), а на нула не се дели. В този случай трябва да се отпечата специално съобщение.
Made by Vladislav Velinov.
*/
public class OperationsWithNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two numbers n1, n2 and operator ( + , - , *, / , % )");
        int n1 = Integer.parseInt(sc.nextLine());
        int n2 = Integer.parseInt(sc.nextLine());
//        sc.nextLine(); //This will remove phantom \n from if previous command is nextInt()!!!!
        String operator = sc.nextLine();

        switch (operator) {
            case "+":
                int sum = n1 + n2;
                if (sum % 2 == 0) {
                    System.out.println(n1 + " + " + n2 + " = " + sum + " - even");
                } else {
                    System.out.println(n1 + " + " + n2 + " = " + sum + " - odd");
                }
                break;
            case "-":
                int raz = n1 - n2;
                if (raz % 2 == 0) {
                    System.out.println(n1 + " - " + n2 + " = " + raz + " - even");
                } else {
                    System.out.println(n1 + " - " + n2 + " = " + raz + " - odd");
                }
                break;
            case "*":
                int pow = n1 * n2;
                if (pow % 2 == 0) {
                    System.out.println(n1 + " * " + n2 + " = " + pow + " - even");
                } else {
                    System.out.println(n1 + " * " + n2 + " = " + pow + " - odd");
                }
                break;
            case "/":
                if (n2 == 0) {
                    System.out.println("Cannot divide " + n1 + " by zero!");
                } else {
                    String reminder = String.format("%.02f", (double) n1 / n2);
                    System.out.println(n1 + " / " + n2 + " = " + reminder);
                }
                break;
            case "%":
                if (n2 == 0) {
                    System.out.println("Cannot divide " + n1 + " by zero!");
                } else {
                    int reminder = n1 % n2;
                    System.out.println(n1 + " & " + n2 + " = " + reminder);
                }
                break;
            default:
                System.out.println("Invalid Input for Operator!!!");
                break;
        }
    }
}