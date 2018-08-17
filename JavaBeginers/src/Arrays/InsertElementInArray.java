package Arrays;

import java.util.Scanner;

/*
Задача 12
Да се напише програма, която на първия ред приема цяло число N и заделете масив с големина N+1 и после  N на брой
числа, които трябва да се сложат в масива. Програмата приема число x и y и числото x трябва да бъде вмъкнато
на позиция y.
Made by Vladislav Velinov.
*/
public class InsertElementInArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];
        int[] myNextArray = new int[n + 1];

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        System.out.println("Enter number and position for the inserted element:");
        int n1 = Integer.parseInt(sc.nextLine());
        int pos = Integer.parseInt(sc.nextLine());

        for (int i = 0; i < pos; i++) {
            myNextArray[i] = myArray[i];
        }

        myNextArray[pos] = n1;

        for (int i = pos; i < n; i++) {
            myNextArray[i + 1] = myArray[i];
        }

        for (int i = 0; i < myNextArray.length; i++) {
            System.out.print(myNextArray[i] + " ");
        }
    }
}