package Arrays;

import java.util.Scanner;

import static Arrays.DisplayArray.displayArray;

/*
Задача 2
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Програма трябва да размени местата на най-големия и най-малкия елемент и да изкара
масива на екрана. Ако има два най-малки или два най-големи да се разменят местата на най-десните.

вход    изход
5       1 4 1 3 5
1
4
5
3
1

Made by Vladislav Velinov.
*/
public class SwapMinAndMaxElement {
    public static void main(String[] args) {

        int min = Integer.MAX_VALUE, max = Integer.MIN_VALUE, indexMin = 0, indexMax = 0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());

            if (myArray[i] >= max) {
                max = myArray[i];
                indexMin = i;
            }

            if (myArray[i] <= min) {
                min = myArray[i];
                indexMax = i;
            }
        }

        myArray[indexMin] = min;
        myArray[indexMax] = max;

        displayArray(myArray);
    }
}