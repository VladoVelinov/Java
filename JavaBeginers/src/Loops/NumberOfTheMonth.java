package Loops;

import java.util.Scanner;

/*
Задача 23 Месец
Да се състави програма , която при въвеждане на 1 цяло числo изпечатва името на месеца, който отговаря на числото.
Ако числото е невалидно да дава съобщение за грешка.
*/
public class NumberOfTheMonth {
    public static void main(String[] args) {
        int month;

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter month number 1-12");
        month = Integer.parseInt(sc.nextLine());

        while (month < 1 || month > 12) {

            System.out.println("Invalid Input!");
            month = Integer.parseInt(sc.nextLine());
        }

        switch (month) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            case 5:
                System.out.println("May");
                break;
            case 6:
                System.out.println("June");
                break;
            case 7:
                System.out.println("July");
                break;
            case 8:
                System.out.println("August");
                break;
            case 9:
                System.out.println("September");
                break;
            case 10:
                System.out.println("October");
                break;
            case 11:
                System.out.println("November");
                break;
            case 12:
                System.out.println("December");
                break;
            default:
                System.out.println("Invalid Input!");
                break;
        }
    }
}
