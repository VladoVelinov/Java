package Funkcii;

import java.util.Scanner;

/*
4 . Average of tree
Напишете функция, която приема като аргументи 3 числа и връща средно аритметичното на 3-те.(помислете какъв трябва
да типа на връщане ?, Защо не става да е int)
Made by Vladislav Velinov
*/
public class AverageOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = Integer.parseInt(sc.nextLine());
        int num2 = Integer.parseInt(sc.nextLine());
        int num3 = Integer.parseInt(sc.nextLine());
        System.out.printf("%.3f", averageNumberOfThree(num1, num2, num3));
    }

    private static float averageNumberOfThree(int number1, int number2, int number3) {
        float average;
        average = (number1 + number2 + number3) / 3f;
        return average;
    }
}