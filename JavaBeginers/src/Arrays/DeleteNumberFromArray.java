package Arrays;

import java.util.Scanner;

/*
Задача 10
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програмата приема число, което трябва да бъде изтрито от масива. Трябва да
изтриете всички срещания на числото от масива и да го изкарате на екрана . В масива не трябва да има празни елементи
или дупките да се запълват със 'специални' числа.
Made by Vladislav Velinov.
*/
public class DeleteNumberFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Enter number to be removed from the array:");
        int n1 = Integer.parseInt(sc.nextLine());
        int counter = 0;

        for (int i = 0; i < n; i++) {
            if (myArray[i] % n1 != 0) {
                ++counter;
            }
        }

        int[] myTempArray = new int[counter];
        counter = 0;

        for (int i = 0; i < n; i++) {
            if (myArray[i] % n1 != 0) {
                myTempArray[counter] = myArray[i];
                ++counter;
            }
        }

        for (int i : myTempArray) {
            System.out.print(i + " ");
        }
    }
}