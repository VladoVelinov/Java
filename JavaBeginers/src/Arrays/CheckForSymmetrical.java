package Arrays;

import java.util.Scanner;

/*
Задача 4
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програма трябва да провери дали масива е симетричен и да изпише True, ако е,
False, ако не е.
Made by Vladislav Velinov.
*/
public class CheckForSymmetrical {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];
        boolean b = true;

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n / 2; i++) {
            if (myArray[i] != myArray[n - (1 + i)]) {
                b = false;
                break;
            }
        }
        System.out.print(b);
    }
}