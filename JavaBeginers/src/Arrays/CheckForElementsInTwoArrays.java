package Arrays;

import java.util.Scanner;

/*
Задача 15
Да се напише програма, която на първия ред приема цяло число N и заделя 2 масива с големина N и големина N*2.
После четем 3*N на брой числа, които трябва да се сложат в масивите. Първо четем числата за първия масив(първите
N числа) , после за втория. Програмата проверява дали всички числа от първия масив се съдържат във втория масив,
т.е. дали първият масив е подмножество на втория.
Made by Vladislav Velinov.
*/
public class CheckForElementsInTwoArrays {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int n2 = 2 * n;
        int[] myArray1 = new int[n];
        int[] myArray2 = new int[n2];
        boolean isTrue = false;
        int counter = 0;


        for (int i = 0; i < n; i++) {
            myArray1[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n2; i++) {
            myArray2[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            for (int y = 0; y < n2; y++) {
                if (myArray1[i] == myArray2[y]) {
                    counter++;
                    break;
                }
            }
        }

        if (counter == n) {
            isTrue = true;
        }
        System.out.println(isTrue);
    }
}