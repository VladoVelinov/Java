package VarablesAndOperators;

import java.util.Scanner;

/*
Задача 3. Число от 100 до 200
Да се напише програма, която въвежда цяло число и проверява дали е под 100, между 100 и 200 или над 200.
Да се отпечатат съответно съобщения като в примерите по-долу:

вход  |  	изход		|    вход	|    изход	            |   вход	|    изход          |
95	  |  Less than 100	|	  120   |Between 100 and 200	|	210	    |Greater than 200   |
Made by Vladislav Velinov.
*/
public class NumberRange {
    public static void main(String[] args) {
        System.out.println("Enter number for compression!");
        Scanner sc = new Scanner(System.in);

        int num = Integer.parseInt(sc.nextLine());

        if (num < 100) {
            System.out.println("Less than 100");
        } else if (num > 200) {
            System.out.println("Greater than 200");
        } else {
            System.out.println("Between 100 and 200");
        }
    }
}
