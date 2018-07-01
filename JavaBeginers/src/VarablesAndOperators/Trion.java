package VarablesAndOperators;

import java.util.Scanner;

/*
Задача 9. Редица трион
Ще казваме, че поредица от числа е трион, ако всяко число в нея е едновременно по-голямо или равно от двата си
съседа или пък едновременно по-малко или равно от тях. За първия и последния елемент имаме само по един съсед.
За определеност, считаме, че празната редица и всяка редица съставена само от един елемент също са трион.
Например дадените по-долу редица са триони:

•	10, 2, 20, 15, 16, -10, 100, 99, 101
•	20, 10
•	1

Напишете програма, която въвежда от стандартния 5 на брой цели числа,Да се изведе на стандартния изход "yes",
ако въведената поредица е трион, или "no", в противен случай.
Made by Vladislav Velinov.
*/
public class Trion {
    public static void main(String[] args) {
        int myInt1, myInt2, myInt3, myInt4, myInt5;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter five numbers:");
        myInt1 = Integer.parseInt(sc.nextLine());
        myInt2 = Integer.parseInt(sc.nextLine());
        myInt3 = Integer.parseInt(sc.nextLine());
        myInt4 = Integer.parseInt(sc.nextLine());
        myInt5 = Integer.parseInt(sc.nextLine());

        if ((myInt2 >= myInt3) & (myInt2 >= myInt1) | (myInt2 <= myInt3) & (myInt2 <= myInt1)) {
            if ((myInt3 >= myInt4) & (myInt3 >= myInt2) | (myInt3 <= myInt4) & (myInt3 <= myInt2)) {
                if ((myInt4 >= myInt5) & (myInt4 >= myInt3) | (myInt4 <= myInt5) & (myInt4 <= myInt3)) {
                    System.out.println("Yes!");
                } else {
                    System.out.println("No!");
                }
            } else {
                System.out.println("No!");
            }
        } else {
            System.out.println("No!");
        }
    }
}
