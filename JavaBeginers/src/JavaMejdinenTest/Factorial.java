package JavaMejdinenTest;

import java.util.Scanner;

/*
est1:
Напишете метод, който изчислява факториел на дадено число n.
Факториел е произведението на всички положителни числа по-малки или равни на n. Например, факториел (4) = 4x3x2x1 = 24.
Класа да се именува: Factorial.
Метода: findFactorial
Made by Vladislav Velinov.
*/
public class Factorial {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Въведвтв положително число за пресмятане на фацториел:");
            num = sc.nextInt();
        } while (num < 0);

        System.out.println("Фалториала на числото " + num + " e: " + findFactorial(num));
    }

    private static int findFactorial(int number) {
        if (number == 0)
            return 1;
        return number * findFactorial(number - 1);
    }
}