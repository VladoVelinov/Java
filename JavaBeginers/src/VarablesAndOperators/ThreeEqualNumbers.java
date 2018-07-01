package VarablesAndOperators;

import java.util.Scanner;

/*
Задача 8. Еднакви 3 числа
Да се въведат 3 числа и да се отпечата дали са еднакви (yes / no)
*/
public class ThreeEqualNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter first number:");
        int myInt1 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter second number");
        int myInt2 = Integer.parseInt(sc.nextLine());

        System.out.println("Enter third number");
        int myInt3 = Integer.parseInt(sc.nextLine());

        if ((myInt1 == myInt2) & (myInt2 == myInt3)) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
