package Arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import static Arrays.DisplayArray.displayArray;

/*
Задача 16
Да се напише програма, която на първия ред приема цяло число N, което е големина на масив и после  N на брой числа,
които трябва да се сложат в масива. Да се премахнат всички елементи със стойност 0 от масива.(Да не се ползва
допълнителен масив).
Made by Vladislav Velinov.
*/
public class SkipElementsWithZero {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter array length and numbers:");
        int n = Integer.parseInt(sc.nextLine());
        int[] myArray = new int[n];
        int counter = 0;
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            myArray[i] = Integer.parseInt(sc.nextLine());
        }

        for (int i = 0; i < n; i++) {
            if (myArray[i] != 0) {
                list.add(myArray[i]);
                ++counter;
            }
        }

        myArray = new int[counter];

        for (int i = 0; i < counter; i++) {
            myArray[i] = list.get(i);
        }

        displayArray(myArray);
    }
}