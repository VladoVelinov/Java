package Arrays;

import java.util.Scanner;

/*
Задача 7
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програмата да изведе числото, което е най-близко до средната стойност на
въведените числа.
Made by Vladislav Velinov.
*/
public class ClosestToAverageValue {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];
        int y = 0, sum = 0, averageMin = Integer.MIN_VALUE, averageMax = Integer.MAX_VALUE;
        double average;
        boolean x = false;

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            sum = sum + (myArray[i]);
        }
        average = (double) sum / n;

        for (int i = 0; i < n; i++) {

            if (myArray[i] % average == 0) {
                x = true;
                y = myArray[i];
                break;
            }
            if (myArray[i] <= average && myArray[i] >= averageMin) {
                averageMin = myArray[i];
            } else if (myArray[i] >= average && myArray[i] <= averageMax) {
                averageMax = myArray[i];
            }
        }

        if (x) {
            System.out.println(y);
        } else if (averageMin > averageMax) {
            System.out.println(averageMin);
        } else {
            System.out.println(averageMax);
        }
    }
}