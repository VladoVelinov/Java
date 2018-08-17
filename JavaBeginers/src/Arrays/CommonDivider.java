package Arrays;

import java.util.Scanner;

/*
Задача 9
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програмата да изведе всички делители, които са общи, на въведените числа в масива
Made by Vladislav Velinov.
*/
public class CommonDivider {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];
        int n1 = 0, n2;

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n - 2; i++) {
            n1 = myArray[i];
            n2 = myArray[i + 1];
            while (n2 != 0) {
                int oldB = n2;
                n2 = n1 % n2;
                n1 = oldB;
            }

            if (myArray[i + 2] % n1 != 0) {
                break;
            }
        }
        System.out.println(n1);
    }
}