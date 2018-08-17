package Arrays;

import java.util.Scanner;

/*
Задача 18
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програмата изважда на екрана най-често срещаното число.
Made by Vladislav Velinov.
*/
public class MostRepeatNumberInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray1 = new int[n];

        for (int i = 0; i < n; i++) {
            myArray1[i] = Integer.parseInt(sc.nextLine());
        }

        int index = 0, maxCounter = 0;

        for (int i = 0; i < n; i++) {
            int counter = 0;
            int n1 = myArray1[i];
            for (int y = 0; y < n; y++) {
                if (myArray1[y] == n1) {
                    counter++;
                }
                if (maxCounter < counter) {
                    maxCounter = counter;
                    index = y;
                }
            }
        }

        System.out.println(myArray1[index]);
    }
}