package JavaMejdinenTest;

import java.util.Scanner;

/*
Test2:
Напишете метод, който връща "Fizz" за числа кратни на 3 и "Buzz" за числа кратни на 5.
За числа, които са кратни на 3 и 5, върнете "FizzBuzz".
За числа, които не са кратни нито на 3 или на 5 - върнете числото.
Класа да се именува: FizzBuzz.
Метода: fizzBuzz
Made by Vladislav Velinov.
*/
public class FizzBuzz {
    public static void main(String[] args) {
        int num;
        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Въведвте положително число по-голямо от 0: ");
            num = sc.nextInt();
        } while (num <= 0);

        System.out.println(fizzBuzz(num));
    }

    private static String fizzBuzz(int number) {
        if ((number % 3 == 0) && (number % 5 == 0)) {
            return "FizzBuzz";
        } else if (number % 3 == 0)
            return "Fizz";
        else if (number % 5 == 0)
            return "Buzz";
        else
            return String.valueOf(number);
    }
}