package Funkcii;

import java.util.Scanner;

/*
7. Temperature Conversion
Напишете функция, която конвертира температура от Фаренхайт до Целзий.
Формула: (fahrenheit - 32) * 5 / 9.
Made by Vladislav Velinov.
*/
public class FarenheitToCelsium {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter temperature in Fahrenheit");
        float temperature = sc.nextFloat();
        System.out.printf("%.2f", FtoC(temperature));

    }

    private static float FtoC(float fahrenheit) {
        return ((fahrenheit - 32) * 5) / 9;
    }
}
